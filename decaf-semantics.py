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
        print('Start')
        self.st.enterScope()
        self.visitChildren(ctx)
        self.st.exitScope()
        print('End')
    
    def visitField_decl(self, ctx:DecafParser.Field_declContext):
        line_num = ctx.start.line
        field_decl = ctx.field_arg(0).getText()
        field_symbol = self.st.probe(field_decl)
                
        if field_symbol != None:
    
            print('Error on line', line_num,', variable \'', field_decl,'\' has already been declared on line',field_symbol.line)
        
        else:
            
            field_symbol = VarSymbol(id=field_decl,
                                   type='int',
                                   line=line_num,
                                   size=8,
                                   mem=STACK)
            
            self.st.addSymbol(field_symbol)
            
        self.visitChildren(ctx)
            
    def visitMethod_decl(self, ctx: DecafParser.Method_declContext):
        
        line_num = ctx.start.line
        #block_name = ctx.block(0).getText()
        #var_symb = 
        #print(self.st.probe(block_name))
        
        self.visitChildren(ctx)
        
    def visitMethod_arg(self, ctx: DecafParser.Method_argContext):
        
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
        var_id = ctx.ID(0).getText()
        id_symbol = self.st.probe(var_id)
        
        if id_symbol != None:
    
            print('Error on line', line_num,', variable \'', var_id,'\' has already been declared on line',id_symbol.line)
        
        else:
            
            id_symbol = VarSymbol(id=var_id,
                                   type='int',
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
        var_symb = self.st.probe(var_id)
        
        if var_symb == None:
            
            print('Error on line',line_num,', variable \'',var_id,'\' has not been declared')

            
        self.visitChildren(ctx)
        
filein = open('testdata/semantics/legal-02.dcf', 'r')
#filein = open('test.dcf', 'r')
lexer = DecafLexer(ant.InputStream(filein.read()))

stream = ant.CommonTokenStream(lexer)

parser = DecafParser(stream)
tree = parser.program()

visitor = DecafSemanticChecker()
visitor.visit(tree)
