// Generated from Decaf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, VOID=2, INT=3, BOOL=4, IF=5, ELSE=6, FOR=7, RETURN=8, BREAK=9, 
		CONTINUE=10, CALLOUT=11, LSQUARE=12, RSQUARE=13, LCURLY=14, RCURLY=15, 
		LROUND=16, RROUND=17, SEMI=18, COMMA=19, DOUBLEQUOTE=20, SINGLEQUOTE=21, 
		EQ=22, ADD=23, SUB=24, MUL=25, DIV=26, MOD=27, GREATER=28, LESS=29, GREATEREQ=30, 
		LESSEQ=31, EQTO=32, PLUSEQ=33, MINUSEQ=34, NOTEQ=35, EXCLAMATION=36, AND=37, 
		OR=38, TRUE=39, FALSE=40, DBLSLASH=41, ID=42, CHAR=43, DECIMAL_LITERAL=44, 
		HEX_LITERAL=45, STRING_LITERAL=46, COMMENT=47, WS=48;
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_method_decl = 2, RULE_method_arg = 3, 
		RULE_field_arg = 4, RULE_data_type = 5, RULE_block = 6, RULE_var_decl = 7, 
		RULE_statement = 8, RULE_location = 9, RULE_assign_op = 10, RULE_expr = 11, 
		RULE_method_call = 12, RULE_data_literal = 13, RULE_bool_literal = 14, 
		RULE_char_literal = 15, RULE_int_literal = 16, RULE_bin_op = 17, RULE_arith_op = 18, 
		RULE_rel_op = 19, RULE_eq_op = 20, RULE_cond_op = 21, RULE_method_name = 22, 
		RULE_callout_arg = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "field_decl", "method_decl", "method_arg", "field_arg", "data_type", 
			"block", "var_decl", "statement", "location", "assign_op", "expr", "method_call", 
			"data_literal", "bool_literal", "char_literal", "int_literal", "bin_op", 
			"arith_op", "rel_op", "eq_op", "cond_op", "method_name", "callout_arg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'void'", "'int'", "'boolean'", "'if'", "'else'", "'for'", 
			"'return'", "'break'", "'continue'", "'callout'", "'['", "']'", "'{'", 
			"'}'", "'('", "')'", "';'", "','", "'\"'", "'''", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'+='", "'-='", 
			"'!='", "'!'", "'&&'", "'||'", "'true'", "'false'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "VOID", "INT", "BOOL", "IF", "ELSE", "FOR", "RETURN", 
			"BREAK", "CONTINUE", "CALLOUT", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", 
			"LROUND", "RROUND", "SEMI", "COMMA", "DOUBLEQUOTE", "SINGLEQUOTE", "EQ", 
			"ADD", "SUB", "MUL", "DIV", "MOD", "GREATER", "LESS", "GREATEREQ", "LESSEQ", 
			"EQTO", "PLUSEQ", "MINUSEQ", "NOTEQ", "EXCLAMATION", "AND", "OR", "TRUE", 
			"FALSE", "DBLSLASH", "ID", "CHAR", "DECIMAL_LITERAL", "HEX_LITERAL", 
			"STRING_LITERAL", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public TerminalNode EOF() { return getToken(DecafParser.EOF, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(CLASS);
			setState(49);
			match(ID);
			setState(50);
			match(LCURLY);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					field_decl();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOL))) != 0)) {
				{
				{
				setState(57);
				method_decl();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(RCURLY);
			setState(64);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<Field_argContext> field_arg() {
			return getRuleContexts(Field_argContext.class);
		}
		public Field_argContext field_arg(int i) {
			return getRuleContext(Field_argContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(DecafParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			data_type();
			setState(67);
			field_arg();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(68);
				match(COMMA);
				setState(69);
				field_arg();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LROUND() { return getToken(DecafParser.LROUND, 0); }
		public TerminalNode RROUND() { return getToken(DecafParser.RROUND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public List<Method_argContext> method_arg() {
			return getRuleContexts(Method_argContext.class);
		}
		public Method_argContext method_arg(int i) {
			return getRuleContext(Method_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				{
				setState(77);
				data_type();
				}
				break;
			case VOID:
				{
				setState(78);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81);
			match(ID);
			setState(82);
			match(LROUND);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==BOOL) {
				{
				setState(83);
				method_arg();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(84);
					match(COMMA);
					setState(85);
					method_arg();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(93);
			match(RROUND);
			setState(94);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_argContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Method_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_arg(this);
		}
	}

	public final Method_argContext method_arg() throws RecognitionException {
		Method_argContext _localctx = new Method_argContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			data_type();
			setState(97);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_argContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LSQUARE() { return getToken(DecafParser.LSQUARE, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(DecafParser.RSQUARE, 0); }
		public Field_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_arg(this);
		}
	}

	public final Field_argContext field_arg() throws RecognitionException {
		Field_argContext _localctx = new Field_argContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_arg);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(ID);
				setState(101);
				match(LSQUARE);
				setState(102);
				int_literal();
				setState(103);
				match(RSQUARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(DecafParser.BOOL, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LCURLY);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOL) {
				{
				{
				setState(110);
				var_decl();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALLOUT) | (1L << LCURLY) | (1L << ID))) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(DecafParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			data_type();
			setState(125);
			match(ID);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				match(ID);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(DecafParser.SEMI, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode LROUND() { return getToken(DecafParser.LROUND, 0); }
		public TerminalNode RROUND() { return getToken(DecafParser.RROUND, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public TerminalNode COMMA() { return getToken(DecafParser.COMMA, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				location();
				setState(136);
				assign_op();
				setState(137);
				expr(0);
				setState(138);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				method_call();
				setState(141);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(IF);
				setState(144);
				match(LROUND);
				setState(145);
				expr(0);
				setState(146);
				match(RROUND);
				setState(147);
				block();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(148);
					match(ELSE);
					setState(149);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(FOR);
				setState(153);
				match(ID);
				setState(154);
				match(EQ);
				setState(155);
				expr(0);
				setState(156);
				match(COMMA);
				setState(157);
				expr(0);
				setState(158);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(RETURN);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLOUT) | (1L << LROUND) | (1L << SUB) | (1L << EXCLAMATION) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << CHAR) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL))) != 0)) {
					{
					setState(161);
					expr(0);
					}
				}

				setState(164);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(BREAK);
				setState(166);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				match(CONTINUE);
				setState(168);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LSQUARE() { return getToken(DecafParser.LSQUARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(DecafParser.RSQUARE, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_location);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(ID);
				setState(174);
				match(LSQUARE);
				setState(175);
				expr(0);
				setState(176);
				match(RSQUARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(DecafParser.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(DecafParser.MINUSEQ, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLUSEQ) | (1L << MINUSEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Data_literalContext data_literal() {
			return getRuleContext(Data_literalContext.class,0);
		}
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXCLAMATION() { return getToken(DecafParser.EXCLAMATION, 0); }
		public TerminalNode LROUND() { return getToken(DecafParser.LROUND, 0); }
		public TerminalNode RROUND() { return getToken(DecafParser.RROUND, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(183);
				location();
				}
				break;
			case 2:
				{
				setState(184);
				method_call();
				}
				break;
			case 3:
				{
				setState(185);
				data_literal();
				}
				break;
			case 4:
				{
				setState(186);
				match(SUB);
				setState(187);
				expr(3);
				}
				break;
			case 5:
				{
				setState(188);
				match(EXCLAMATION);
				setState(189);
				expr(2);
				}
				break;
			case 6:
				{
				setState(190);
				match(LROUND);
				setState(191);
				expr(0);
				setState(192);
				match(RROUND);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(196);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(197);
					bin_op();
					setState(198);
					expr(5);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LROUND() { return getToken(DecafParser.LROUND, 0); }
		public TerminalNode RROUND() { return getToken(DecafParser.RROUND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_call);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				method_name();
				setState(206);
				match(LROUND);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLOUT) | (1L << LROUND) | (1L << SUB) | (1L << EXCLAMATION) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << CHAR) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL))) != 0)) {
					{
					setState(207);
					expr(0);
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(208);
						match(COMMA);
						setState(209);
						expr(0);
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(217);
				match(RROUND);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(CALLOUT);
				setState(220);
				match(LROUND);
				setState(221);
				match(STRING_LITERAL);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(222);
					match(COMMA);
					setState(223);
					callout_arg();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(RROUND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_literalContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Data_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterData_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitData_literal(this);
		}
	}

	public final Data_literalContext data_literal() throws RecognitionException {
		Data_literalContext _localctx = new Data_literalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_data_literal);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				int_literal();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				bool_literal();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				char_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(DecafParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DecafParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(DecafParser.CHAR, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(DecafParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(DecafParser.HEX_LITERAL, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL_LITERAL || _la==HEX_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_opContext extends ParserRuleContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bin_op);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				arith_op();
				}
				break;
			case GREATER:
			case LESS:
			case GREATEREQ:
			case LESSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				rel_op();
				}
				break;
			case EQTO:
			case NOTEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				eq_op();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				cond_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(DecafParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(DecafParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DecafParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(DecafParser.MOD, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitArith_op(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(DecafParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(DecafParser.LESS, 0); }
		public TerminalNode GREATEREQ() { return getToken(DecafParser.GREATEREQ, 0); }
		public TerminalNode LESSEQ() { return getToken(DecafParser.LESSEQ, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << GREATEREQ) | (1L << LESSEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQTO() { return getToken(DecafParser.EQTO, 0); }
		public TerminalNode NOTEQ() { return getToken(DecafParser.NOTEQ, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==EQTO || _la==NOTEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DecafParser.AND, 0); }
		public TerminalNode OR() { return getToken(DecafParser.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(DecafParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(DecafParser.RSQUARE, 0); }
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_callout_arg);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALLOUT:
			case LROUND:
			case SUB:
			case EXCLAMATION:
			case TRUE:
			case FALSE:
			case ID:
			case CHAR:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				expr(0);
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(LSQUARE);
				setState(261);
				expr(0);
				setState(262);
				match(RSQUARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u010d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\4\3\4\5"+
		"\4R\n\4\3\4\3\4\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\5\4^\n\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\b\3\b\7\b"+
		"r\n\b\f\b\16\bu\13\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\7\t\u0083\n\t\f\t\16\t\u0086\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00a5\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ad\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b5\n\13\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c5\n\r\3\r\3\r\3\r\3\r\7\r\u00cb"+
		"\n\r\f\r\16\r\u00ce\13\r\3\16\3\16\3\16\3\16\3\16\7\16\u00d5\n\16\f\16"+
		"\16\16\u00d8\13\16\5\16\u00da\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00e3\n\16\f\16\16\16\u00e6\13\16\3\16\5\16\u00e9\n\16\3\17\3\17"+
		"\3\17\5\17\u00ee\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\5\23\u00fa\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u010b\n\31\3\31\2\3\30\32\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\2\n\3\2\5\6\4\2\30\30#$\3\2)*\3\2./"+
		"\3\2\31\35\3\2\36!\4\2\"\"%%\3\2\'(\2\u0118\2\62\3\2\2\2\4D\3\2\2\2\6"+
		"Q\3\2\2\2\bb\3\2\2\2\nk\3\2\2\2\fm\3\2\2\2\16o\3\2\2\2\20~\3\2\2\2\22"+
		"\u00ac\3\2\2\2\24\u00b4\3\2\2\2\26\u00b6\3\2\2\2\30\u00c4\3\2\2\2\32\u00e8"+
		"\3\2\2\2\34\u00ed\3\2\2\2\36\u00ef\3\2\2\2 \u00f1\3\2\2\2\"\u00f3\3\2"+
		"\2\2$\u00f9\3\2\2\2&\u00fb\3\2\2\2(\u00fd\3\2\2\2*\u00ff\3\2\2\2,\u0101"+
		"\3\2\2\2.\u0103\3\2\2\2\60\u010a\3\2\2\2\62\63\7\3\2\2\63\64\7,\2\2\64"+
		"8\7\20\2\2\65\67\5\4\3\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2"+
		"\29>\3\2\2\2:8\3\2\2\2;=\5\6\4\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2"+
		"\2?A\3\2\2\2@>\3\2\2\2AB\7\21\2\2BC\7\2\2\3C\3\3\2\2\2DE\5\f\7\2EJ\5\n"+
		"\6\2FG\7\25\2\2GI\5\n\6\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3"+
		"\2\2\2LJ\3\2\2\2MN\7\24\2\2N\5\3\2\2\2OR\5\f\7\2PR\7\4\2\2QO\3\2\2\2Q"+
		"P\3\2\2\2RS\3\2\2\2ST\7,\2\2T]\7\22\2\2UZ\5\b\5\2VW\7\25\2\2WY\5\b\5\2"+
		"XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]U\3\2\2"+
		"\2]^\3\2\2\2^_\3\2\2\2_`\7\23\2\2`a\5\16\b\2a\7\3\2\2\2bc\5\f\7\2cd\7"+
		",\2\2d\t\3\2\2\2el\7,\2\2fg\7,\2\2gh\7\16\2\2hi\5\"\22\2ij\7\17\2\2jl"+
		"\3\2\2\2ke\3\2\2\2kf\3\2\2\2l\13\3\2\2\2mn\t\2\2\2n\r\3\2\2\2os\7\20\2"+
		"\2pr\5\20\t\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2ty\3\2\2\2us\3\2"+
		"\2\2vx\5\22\n\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3"+
		"\2\2\2|}\7\21\2\2}\17\3\2\2\2~\177\5\f\7\2\177\u0084\7,\2\2\u0080\u0081"+
		"\7\25\2\2\u0081\u0083\7,\2\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7\24\2\2\u0088\21\3\2\2\2\u0089\u008a\5\24\13\2\u008a"+
		"\u008b\5\26\f\2\u008b\u008c\5\30\r\2\u008c\u008d\7\24\2\2\u008d\u00ad"+
		"\3\2\2\2\u008e\u008f\5\32\16\2\u008f\u0090\7\24\2\2\u0090\u00ad\3\2\2"+
		"\2\u0091\u0092\7\7\2\2\u0092\u0093\7\22\2\2\u0093\u0094\5\30\r\2\u0094"+
		"\u0095\7\23\2\2\u0095\u0098\5\16\b\2\u0096\u0097\7\b\2\2\u0097\u0099\5"+
		"\16\b\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00ad\3\2\2\2\u009a"+
		"\u009b\7\t\2\2\u009b\u009c\7,\2\2\u009c\u009d\7\30\2\2\u009d\u009e\5\30"+
		"\r\2\u009e\u009f\7\25\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\5\16\b\2\u00a1"+
		"\u00ad\3\2\2\2\u00a2\u00a4\7\n\2\2\u00a3\u00a5\5\30\r\2\u00a4\u00a3\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ad\7\24\2\2\u00a7"+
		"\u00a8\7\13\2\2\u00a8\u00ad\7\24\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ad\7"+
		"\24\2\2\u00ab\u00ad\5\16\b\2\u00ac\u0089\3\2\2\2\u00ac\u008e\3\2\2\2\u00ac"+
		"\u0091\3\2\2\2\u00ac\u009a\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ac\u00a7\3\2"+
		"\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00b5"+
		"\7,\2\2\u00af\u00b0\7,\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\5\30\r\2\u00b2"+
		"\u00b3\7\17\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3"+
		"\2\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7\27\3\2\2\2\u00b8\u00b9"+
		"\b\r\1\2\u00b9\u00c5\5\24\13\2\u00ba\u00c5\5\32\16\2\u00bb\u00c5\5\34"+
		"\17\2\u00bc\u00bd\7\32\2\2\u00bd\u00c5\5\30\r\5\u00be\u00bf\7&\2\2\u00bf"+
		"\u00c5\5\30\r\4\u00c0\u00c1\7\22\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3"+
		"\7\23\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00ba\3\2\2\2"+
		"\u00c4\u00bb\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00c0"+
		"\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\f\6\2\2\u00c7\u00c8\5$\23\2\u00c8"+
		"\u00c9\5\30\r\7\u00c9\u00cb\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00ce\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\31\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\5.\30\2\u00d0\u00d9\7\22\2\2\u00d1\u00d6\5"+
		"\30\r\2\u00d2\u00d3\7\25\2\2\u00d3\u00d5\5\30\r\2\u00d4\u00d2\3\2\2\2"+
		"\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\7\23\2\2\u00dc\u00e9\3\2\2\2\u00dd\u00de\7"+
		"\r\2\2\u00de\u00df\7\22\2\2\u00df\u00e4\7\60\2\2\u00e0\u00e1\7\25\2\2"+
		"\u00e1\u00e3\5\60\31\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e9\7\23\2\2\u00e8\u00cf\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e9\33\3\2\2"+
		"\2\u00ea\u00ee\5\"\22\2\u00eb\u00ee\5\36\20\2\u00ec\u00ee\5 \21\2\u00ed"+
		"\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\35\3\2\2"+
		"\2\u00ef\u00f0\t\4\2\2\u00f0\37\3\2\2\2\u00f1\u00f2\7-\2\2\u00f2!\3\2"+
		"\2\2\u00f3\u00f4\t\5\2\2\u00f4#\3\2\2\2\u00f5\u00fa\5&\24\2\u00f6\u00fa"+
		"\5(\25\2\u00f7\u00fa\5*\26\2\u00f8\u00fa\5,\27\2\u00f9\u00f5\3\2\2\2\u00f9"+
		"\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa%\3\2\2\2"+
		"\u00fb\u00fc\t\6\2\2\u00fc\'\3\2\2\2\u00fd\u00fe\t\7\2\2\u00fe)\3\2\2"+
		"\2\u00ff\u0100\t\b\2\2\u0100+\3\2\2\2\u0101\u0102\t\t\2\2\u0102-\3\2\2"+
		"\2\u0103\u0104\7,\2\2\u0104/\3\2\2\2\u0105\u010b\5\30\r\2\u0106\u0107"+
		"\7\16\2\2\u0107\u0108\5\30\r\2\u0108\u0109\7\17\2\2\u0109\u010b\3\2\2"+
		"\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010b\61\3\2\2\2\318>JQZ]k"+
		"sy\u0084\u0098\u00a4\u00ac\u00b4\u00c4\u00cc\u00d6\u00d9\u00e4\u00e8\u00ed"+
		"\u00f9\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}