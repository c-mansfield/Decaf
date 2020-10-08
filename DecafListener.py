# Generated from Decaf.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .DecafParser import DecafParser
else:
    from DecafParser import DecafParser

# This class defines a complete listener for a parse tree produced by DecafParser.
class DecafListener(ParseTreeListener):

    # Enter a parse tree produced by DecafParser#program.
    def enterProgram(self, ctx:DecafParser.ProgramContext):
        pass

    # Exit a parse tree produced by DecafParser#program.
    def exitProgram(self, ctx:DecafParser.ProgramContext):
        pass


    # Enter a parse tree produced by DecafParser#field_decl.
    def enterField_decl(self, ctx:DecafParser.Field_declContext):
        pass

    # Exit a parse tree produced by DecafParser#field_decl.
    def exitField_decl(self, ctx:DecafParser.Field_declContext):
        pass


    # Enter a parse tree produced by DecafParser#method_decl.
    def enterMethod_decl(self, ctx:DecafParser.Method_declContext):
        pass

    # Exit a parse tree produced by DecafParser#method_decl.
    def exitMethod_decl(self, ctx:DecafParser.Method_declContext):
        pass


    # Enter a parse tree produced by DecafParser#method_arg.
    def enterMethod_arg(self, ctx:DecafParser.Method_argContext):
        pass

    # Exit a parse tree produced by DecafParser#method_arg.
    def exitMethod_arg(self, ctx:DecafParser.Method_argContext):
        pass


    # Enter a parse tree produced by DecafParser#field_arg.
    def enterField_arg(self, ctx:DecafParser.Field_argContext):
        pass

    # Exit a parse tree produced by DecafParser#field_arg.
    def exitField_arg(self, ctx:DecafParser.Field_argContext):
        pass


    # Enter a parse tree produced by DecafParser#data_type.
    def enterData_type(self, ctx:DecafParser.Data_typeContext):
        pass

    # Exit a parse tree produced by DecafParser#data_type.
    def exitData_type(self, ctx:DecafParser.Data_typeContext):
        pass


    # Enter a parse tree produced by DecafParser#block.
    def enterBlock(self, ctx:DecafParser.BlockContext):
        pass

    # Exit a parse tree produced by DecafParser#block.
    def exitBlock(self, ctx:DecafParser.BlockContext):
        pass



del DecafParser