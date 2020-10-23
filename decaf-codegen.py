import antlr4 as ant
from DecafLexer import DecafLexer
from DecafParser import DecafParser
from DecafVisitor import DecafVisitor
from SymbolTable import HEAP, STACK, SymbolTable, VarSymbol, MethodSymbol, param_registers

class DecafSemanticChecker(DecafVisitor):
    def __init__(self):
        super().__init__()
        self.head = '.data\n'
        self.body = '.global main\n'
        self.st = SymbolTable()
        
    def visitProgram(self, ctx:DecafParser.ProgramContext):
        self.st.enterScope()
        self.visitChildren(ctx)
        self.st.exitScope()
    
    def visitField_decl(self, ctx:DecafParser.Field_declContext):
        line_num = ctx.start.line
        data_type = ctx.data_type().getText()
        field_decls = ctx.field_arg()
                
        for f in field_decls:
            
            array_size = 0
            field_symbol = self.st.probe(f.getText())
            
            if f.int_literal() != None:
                
                array_size = f.int_literal().getText()
                
                if int(array_size) <= 0:
                
                    print('Error on line', line_num,', array \'', f.ID().getText(),'\' must have a declaration value greater than 0')
            
            if field_symbol != None:
    
                print('Error on line', line_num,', variable \'', f.ID().getText(),'\' has already been declared on line',field_symbol.line)
                
            else:
                
                field_symbol = VarSymbol(id=f.ID().getText(),
                                         type=data_type,
                                         line=line_num,
                                         size=8,
                                         mem=HEAP)
                
                self.st.addSymbol(field_symbol)
                        
        self.visitChildren(ctx)
    
    def visitMethod_decl(self, ctx:DecafParser.Method_declContext):
        data_type = ""
        line_num = ctx.start.line
        method_name = ctx.ID().getText()
        method_args = ctx.method_arg()
        method_params = []
        
        if ctx.data_type() != None:
            data_type = ctx.data_type().getText()
        else:
            data_type = "void"

        for i in method_args:
            arg_type = i.data_type().getText()
            method_arg = VarSymbol(id=i.ID().getText(), type=arg_type, line=line_num, size=8, mem=STACK)
            method_params.append(method_arg)

        method_symbol = MethodSymbol(id=method_name,
                                         type=data_type,
                                         line=line_num,
                                         params=method_params)
        
        self.body += method_name + ':\n'
        
        if method_name == 'main':
            self.body += 'movq %rsp, %rbp\n'
            
        self.st.enterScope()
        for i in range(len(method_params)):
            self.st.addSymbol(method_params[i])
            #Saving each method parameter onto a location on the stack(Memory)
            self.body += 'movq ' + param_registers[i] + ',' + str(method_params[i].getAddr()) + '(%rsp)\n'
        
        self.visitChildren(ctx)
        self.body += 'ret\n'
        self.st.exitScope()
        
    def visitExpr(self, ctx:DecafParser.ExprContext):
                
        if ctx.data_literal():
            int_literal = ctx.data_literal().getText()
            self.body += 'movq $' + int_literal + ', %rax\n'
            
        elif ctx.location():
            loc_name = ctx.location().getText()
            location = self.st.lookup(loc_name)
            
            addr = str(location.getAddr())
            
            if location.mem == HEAP:
                self.body += 'movq ' + addr + '(%rbp), %rax\n'
            else:
                self.body += 'movq ' + addr + '(%rsp), %rax\n'        
                
        else:
            self.visitChildren(ctx)

    def visitMethod_call(self, ctx:DecafParser.Method_callContext):

        if ctx.method_name():
            for i in range(len(ctx.expr())):
                self.visit(ctx.expr(i))
                self.st.stack_pointer[-1] += 8
                ptr = self.st.stack_pointer[-1]
                self.body += 'movq %rax, ' + str(ptr) + '(%rsp)\n'

            for z in range(len(ctx.expr())):
                ptr = self.st.stack_pointer[-1]
                reg = param_registers[z]
                self.body += 'movq ' + ptr + '(% rsp), ' + reg + '\n'
                self.st.stack_pointer[-1] -= 8

            #Current pos stored in symbol table
            #Needs to be 16 byte aligned or we get segmentation errors
            stack_len = self.st.stack_pointer[-1]
            stack_len = stack_len + (int(stack_len/8+1) % 2) * 8
            self.body += 'subq $' + str(stack_len) + ', %rsp\n'
            method_name = ctx.method_name().getText()
            self.body += 'call ' + method_name + '\n'
            self.body += 'addq $' + str(stack_len) + ', %rsp\n'

        elif ctx.CALLOUT():
            pass

        self.visitChildren(ctx)
            
filein = open('test.dcf', 'r')
lexer = DecafLexer(ant.InputStream(filein.read()))

stream = ant.CommonTokenStream(lexer)

parser = DecafParser(stream)
tree = parser.program()

visitor = DecafSemanticChecker()
visitor.visit(tree)

code = visitor.head + visitor.body
print(code)
