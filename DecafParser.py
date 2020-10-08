# Generated from Decaf.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60")
        buf.write("K\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\3\2\3\2\3\2\3\2\7\2\25\n\2\f\2\16\2\30\13\2\3\2\7")
        buf.write("\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3")
        buf.write("\7\3\'\n\3\f\3\16\3*\13\3\3\4\3\4\5\4.\n\4\3\4\3\4\3\4")
        buf.write("\3\4\3\4\7\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\4\3\5\3\5")
        buf.write("\3\5\3\6\3\6\3\6\3\6\5\6D\n\6\3\7\3\7\3\b\3\b\3\b\3\b")
        buf.write("\2\2\t\2\4\6\b\n\f\16\2\3\3\2\5\6\2I\2\20\3\2\2\2\4\"")
        buf.write("\3\2\2\2\6-\3\2\2\2\b<\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16")
        buf.write("G\3\2\2\2\20\21\7\3\2\2\21\22\7+\2\2\22\26\7\20\2\2\23")
        buf.write("\25\5\4\3\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2")
        buf.write("\26\27\3\2\2\2\27\34\3\2\2\2\30\26\3\2\2\2\31\33\5\6\4")
        buf.write("\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2")
        buf.write("\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\21\2\2 !\7\2\2")
        buf.write("\3!\3\3\2\2\2\"#\5\f\7\2#(\5\n\6\2$%\7\25\2\2%\'\5\n\6")
        buf.write("\2&$\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\5\3\2\2\2")
        buf.write("*(\3\2\2\2+.\5\f\7\2,.\7\4\2\2-+\3\2\2\2-,\3\2\2\2./\3")
        buf.write("\2\2\2/\60\7+\2\2\60\61\7\22\2\2\61\66\5\b\5\2\62\63\7")
        buf.write("\25\2\2\63\65\5\b\5\2\64\62\3\2\2\2\658\3\2\2\2\66\64")
        buf.write("\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\23")
        buf.write("\2\2:;\5\16\b\2;\7\3\2\2\2<=\5\f\7\2=>\7+\2\2>\t\3\2\2")
        buf.write("\2?D\7+\2\2@A\7+\2\2AB\7\16\2\2BD\7\17\2\2C?\3\2\2\2C")
        buf.write("@\3\2\2\2D\13\3\2\2\2EF\t\2\2\2F\r\3\2\2\2GH\7\20\2\2")
        buf.write("HI\7\21\2\2I\17\3\2\2\2\b\26\34(-\66C")
        return buf.getvalue()


class DecafParser ( Parser ):

    grammarFileName = "Decaf.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'class'", "'void'", "'int'", "'boolean'", 
                     "'if'", "'else'", "'for'", "'return'", "'break'", "'continue'", 
                     "'callout'", "'['", "']'", "'{'", "'}'", "'('", "')'", 
                     "';'", "','", "'\"'", "'''", "'='", "'+'", "'-'", "'*'", 
                     "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", 
                     "'+='", "'!='", "'!'", "'&&'", "'||'", "'true'", "'false'", 
                     "'//'" ]

    symbolicNames = [ "<INVALID>", "CLASS", "VOID", "INT", "BOOL", "IF", 
                      "ELSE", "FOR", "RETURN", "BREAK", "CONTINUE", "CALLOUT", 
                      "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", "LROUND", 
                      "RROUND", "SEMI", "COMMA", "DOUBLEQUOTE", "SINGLEQUOTE", 
                      "EQ", "ADD", "SUB", "MUL", "DIV", "MOD", "GREATER", 
                      "LESS", "GREATEREQ", "LESSEQ", "EQTO", "PLUSEQ", "NOTEQ", 
                      "EXCLAMATION", "AND", "OR", "TRUE", "FALSE", "DBLSLASH", 
                      "ID", "INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
                      "COMMENT", "WS" ]

    RULE_program = 0
    RULE_field_decl = 1
    RULE_method_decl = 2
    RULE_method_arg = 3
    RULE_field_arg = 4
    RULE_data_type = 5
    RULE_block = 6

    ruleNames =  [ "program", "field_decl", "method_decl", "method_arg", 
                   "field_arg", "data_type", "block" ]

    EOF = Token.EOF
    CLASS=1
    VOID=2
    INT=3
    BOOL=4
    IF=5
    ELSE=6
    FOR=7
    RETURN=8
    BREAK=9
    CONTINUE=10
    CALLOUT=11
    LSQUARE=12
    RSQUARE=13
    LCURLY=14
    RCURLY=15
    LROUND=16
    RROUND=17
    SEMI=18
    COMMA=19
    DOUBLEQUOTE=20
    SINGLEQUOTE=21
    EQ=22
    ADD=23
    SUB=24
    MUL=25
    DIV=26
    MOD=27
    GREATER=28
    LESS=29
    GREATEREQ=30
    LESSEQ=31
    EQTO=32
    PLUSEQ=33
    NOTEQ=34
    EXCLAMATION=35
    AND=36
    OR=37
    TRUE=38
    FALSE=39
    DBLSLASH=40
    ID=41
    INT_LITERAL=42
    CHAR_LITERAL=43
    STRING_LITERAL=44
    COMMENT=45
    WS=46

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLASS(self):
            return self.getToken(DecafParser.CLASS, 0)

        def ID(self):
            return self.getToken(DecafParser.ID, 0)

        def LCURLY(self):
            return self.getToken(DecafParser.LCURLY, 0)

        def RCURLY(self):
            return self.getToken(DecafParser.RCURLY, 0)

        def EOF(self):
            return self.getToken(DecafParser.EOF, 0)

        def field_decl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DecafParser.Field_declContext)
            else:
                return self.getTypedRuleContext(DecafParser.Field_declContext,i)


        def method_decl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DecafParser.Method_declContext)
            else:
                return self.getTypedRuleContext(DecafParser.Method_declContext,i)


        def getRuleIndex(self):
            return DecafParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)




    def program(self):

        localctx = DecafParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 14
            self.match(DecafParser.CLASS)
            self.state = 15
            self.match(DecafParser.ID)
            self.state = 16
            self.match(DecafParser.LCURLY)
            self.state = 20
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,0,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 17
                    self.field_decl() 
                self.state = 22
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,0,self._ctx)

            self.state = 26
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << DecafParser.VOID) | (1 << DecafParser.INT) | (1 << DecafParser.BOOL))) != 0):
                self.state = 23
                self.method_decl()
                self.state = 28
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 29
            self.match(DecafParser.RCURLY)
            self.state = 30
            self.match(DecafParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Field_declContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def data_type(self):
            return self.getTypedRuleContext(DecafParser.Data_typeContext,0)


        def field_arg(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DecafParser.Field_argContext)
            else:
                return self.getTypedRuleContext(DecafParser.Field_argContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(DecafParser.COMMA)
            else:
                return self.getToken(DecafParser.COMMA, i)

        def getRuleIndex(self):
            return DecafParser.RULE_field_decl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterField_decl" ):
                listener.enterField_decl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitField_decl" ):
                listener.exitField_decl(self)




    def field_decl(self):

        localctx = DecafParser.Field_declContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_field_decl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            self.data_type()
            self.state = 33
            self.field_arg()
            self.state = 38
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==DecafParser.COMMA:
                self.state = 34
                self.match(DecafParser.COMMA)
                self.state = 35
                self.field_arg()
                self.state = 40
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Method_declContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(DecafParser.ID, 0)

        def LROUND(self):
            return self.getToken(DecafParser.LROUND, 0)

        def method_arg(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DecafParser.Method_argContext)
            else:
                return self.getTypedRuleContext(DecafParser.Method_argContext,i)


        def RROUND(self):
            return self.getToken(DecafParser.RROUND, 0)

        def block(self):
            return self.getTypedRuleContext(DecafParser.BlockContext,0)


        def data_type(self):
            return self.getTypedRuleContext(DecafParser.Data_typeContext,0)


        def VOID(self):
            return self.getToken(DecafParser.VOID, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(DecafParser.COMMA)
            else:
                return self.getToken(DecafParser.COMMA, i)

        def getRuleIndex(self):
            return DecafParser.RULE_method_decl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethod_decl" ):
                listener.enterMethod_decl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethod_decl" ):
                listener.exitMethod_decl(self)




    def method_decl(self):

        localctx = DecafParser.Method_declContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_method_decl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [DecafParser.INT, DecafParser.BOOL]:
                self.state = 41
                self.data_type()
                pass
            elif token in [DecafParser.VOID]:
                self.state = 42
                self.match(DecafParser.VOID)
                pass
            else:
                raise NoViableAltException(self)

            self.state = 45
            self.match(DecafParser.ID)
            self.state = 46
            self.match(DecafParser.LROUND)
            self.state = 47
            self.method_arg()
            self.state = 52
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==DecafParser.COMMA:
                self.state = 48
                self.match(DecafParser.COMMA)
                self.state = 49
                self.method_arg()
                self.state = 54
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 55
            self.match(DecafParser.RROUND)
            self.state = 56
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Method_argContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def data_type(self):
            return self.getTypedRuleContext(DecafParser.Data_typeContext,0)


        def ID(self):
            return self.getToken(DecafParser.ID, 0)

        def getRuleIndex(self):
            return DecafParser.RULE_method_arg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethod_arg" ):
                listener.enterMethod_arg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethod_arg" ):
                listener.exitMethod_arg(self)




    def method_arg(self):

        localctx = DecafParser.Method_argContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_method_arg)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58
            self.data_type()
            self.state = 59
            self.match(DecafParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Field_argContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(DecafParser.ID, 0)

        def LSQUARE(self):
            return self.getToken(DecafParser.LSQUARE, 0)

        def RSQUARE(self):
            return self.getToken(DecafParser.RSQUARE, 0)

        def getRuleIndex(self):
            return DecafParser.RULE_field_arg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterField_arg" ):
                listener.enterField_arg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitField_arg" ):
                listener.exitField_arg(self)




    def field_arg(self):

        localctx = DecafParser.Field_argContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_field_arg)
        try:
            self.state = 65
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 61
                self.match(DecafParser.ID)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 62
                self.match(DecafParser.ID)
                self.state = 63
                self.match(DecafParser.LSQUARE)
                self.state = 64
                self.match(DecafParser.RSQUARE)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Data_typeContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(DecafParser.INT, 0)

        def BOOL(self):
            return self.getToken(DecafParser.BOOL, 0)

        def getRuleIndex(self):
            return DecafParser.RULE_data_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterData_type" ):
                listener.enterData_type(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitData_type" ):
                listener.exitData_type(self)




    def data_type(self):

        localctx = DecafParser.Data_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_data_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            _la = self._input.LA(1)
            if not(_la==DecafParser.INT or _la==DecafParser.BOOL):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LCURLY(self):
            return self.getToken(DecafParser.LCURLY, 0)

        def RCURLY(self):
            return self.getToken(DecafParser.RCURLY, 0)

        def getRuleIndex(self):
            return DecafParser.RULE_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlock" ):
                listener.enterBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlock" ):
                listener.exitBlock(self)




    def block(self):

        localctx = DecafParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 69
            self.match(DecafParser.LCURLY)
            self.state = 70
            self.match(DecafParser.RCURLY)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





