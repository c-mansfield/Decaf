import antlr4 as ant
from DecafLexer import DecafLexer
from DecafParser import DecafParser
from DecafVisitor import DecafVisitor
from SymbolTable import HEAP, STACK, SymbolTable, VarSymbol, MethodSymbol

class DecafSemanticChecker(DecafVisitor):
        
    def __init__(self):
        super().__init__()
        self.st = SymbolTable()
        
    def visitProgram(self, ctx:DecafParser.ProgramContext):
        #print('Start')
        self.st.enterScope()
        line_num = ctx.start.line
        method_decls = ctx.method_decl()
        data_type = ""
        
        for index, m in enumerate(method_decls):
        
            method_symbol = self.st.probe(m.ID().getText())
    
            if m.data_type() != None:
                data_type = m.data_type().getText()
            else:
                data_type = "void"
            
            if m.getText() == "main" and len(m.method_arg()) > 0:
                print('Error on line', line_num,', method \'main\' cannot have any parameters')
            
#            if m.ID().getText() == "main" and index < len(method_decls)  :
 #               print('Warning detected functions declared after main, these will not be executed')
                
            method_symbol = MethodSymbol(id=method_symbol,
                                             type=data_type,
                                             line=line_num,
                                             params=m.method_arg())
                    
            self.st.addSymbol(method_symbol)
        
        self.visitChildren(ctx)
        self.st.exitScope()
        #print('End')
    
    def visitField_decl(self, ctx:DecafParser.Field_declContext):
        line_num = ctx.start.line
        data_type = ctx.data_type().getText()
        field_decls = ctx.field_arg()
        #method_decls = ctx.method_decl()
                
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
                                         mem=STACK)
                
                self.st.addSymbol(field_symbol)
                        
        self.visitChildren(ctx)
        
    def visitMethod_decl(self, ctx: DecafParser.Method_declContext):
        #Makes method have its own scope
        #self.st.enterScope()
        line_num = ctx.start.line
                        
        self.visitChildren(ctx)
        #self.st.exitScope()
        
    def visitMethod_arg(self, ctx: DecafParser.Method_argContext):
        line_num = ctx.start.line
        data_type = ctx.data_type().getText()
        var_decls = ctx.ID().getText()
        var_symbol = self.st.probe(var_decls)
        
        
        if var_symbol != None:

            print('Error on line', line_num,', variable \'', var_decls,'\' has already been declared on line',var_symbol.line)
                            
        else:
        
            var_symbol = VarSymbol(id=var_decls,
                                     type=data_type,
                                     line=line_num,
                                     size=8,
                                     mem=STACK)
                            
            self.st.addSymbol(var_symbol)
        
        
        self.visitChildren(ctx)
        
    def visitField_arg(self, ctx: DecafParser.Field_argContext):
                
        self.visitChildren(ctx)
        
    def visitData_type(self, ctx: DecafParser.Data_typeContext):
        
        self.visitChildren(ctx)

    def visitBlock(self, ctx: DecafParser.BlockContext):
        line_num = ctx.start.line
        #var_decl = ctx.var_decl(0).getText()
        #self.st.probe(var_decl)
        
        self.visitChildren(ctx)
        
    def visitVar_decl(self, ctx: DecafParser.Var_declContext):
        line_num = ctx.start.line
        var_ids = ctx.ID()
        data_type = ctx.data_type().getText()
        
        for v in var_ids:
        
            id_symbol = self.st.probe(v.getText())
        
            if id_symbol != None:
        
                print('Error on line', line_num,', variable \'', v.getText(),'\' has already been declared on line',id_symbol.line)
            
            else:
                
                id_symbol = VarSymbol(id=v.getText(),
                                       type=data_type,
                                       line=line_num,
                                       size=8,
                                       mem=STACK)
                
                self.st.addSymbol(id_symbol)
            
        self.visitChildren(ctx)
        
    def visitStatement(self, ctx: DecafParser.StatementContext):
        line_num = ctx.start.line
        
        self.visitChildren(ctx)
        
    def visitLocation(self, ctx: DecafParser.LocationContext):
        line_num = ctx.start.line
        var_id = ctx.ID().getText()
        var_symb = self.st.lookup(var_id)
        
        if var_symb == None:
            
            print('Error on line',line_num,', variable \'',var_id,'\' has not been declared')

            
        self.visitChildren(ctx)
        
    def visitExpr(self, ctx:DecafParser.ExprContext):
        line_num = ctx.start.line
        expr_type = ""
    
        if len(ctx.expr()) == 2:
            
            type_a = self.visit(ctx.expr(0))
            type_b = self.visit(ctx.expr(1))
                                    
            if type_a == type_b:
                
                expr_type = type_a
                
            else:
                
                expr_type = None
                print('Error on line',line_num,'type mismatched in expression')
            
        elif ctx.location() != None:
            
            var_name = ctx.location().ID().getText()
            var_symbol = self.st.lookup(var_name)
            
            if var_symbol == None:
                
                expr_type = var_symbol.type
                
            else:
                
                expr_type  = None
                
        #elif ctx.literal() != None:
            #pass
        else:
            self.visitChildren(ctx)
            
        return expr_type
        
#filein = open('testdata/semantics/illegal-03.dcf', 'r')
filein = open('test.dcf', 'r')
lexer = DecafLexer(ant.InputStream(filein.read()))

stream = ant.CommonTokenStream(lexer)

parser = DecafParser(stream)
tree = parser.program()

visitor = DecafSemanticChecker()
visitor.visit(tree)
