// Generated from C:/Users/JORGE AURELIO MORALE/Documents/Personal Projects/programming-languages-project\picalc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class picalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, OP=13, CP=14, OB=15, CB=16, OSB=17, CSB=18, 
		EQ=19, DOT=20, PW=21, CL=22, US=23, PC=24, OUTPUT=25, INPUT=26, RINPUT=27, 
		BOOL=28, CHAR=29, INT=30, STRING=31, ID=32, WS=33;
	public static final int
		RULE_program = 0, RULE_proc = 1, RULE_dec = 2, RULE_pat = 3, RULE_otype = 4, 
		RULE_type = 5, RULE_abs = 6, RULE_val = 7, RULE_path = 8, RULE_label = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "proc", "dec", "pat", "otype", "type", "abs", "val", "path", 
			"label"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'run'", "'if'", "'then'", "'else'", "'new'", "'def'", "'and'", 
			"'type'", "'Boolean'", "'Char'", "'Int'", "'String'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'='", "'.'", "'^'", "':'", "'_'", "'|'", "'!'", 
			"'?'", "'?*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "OP", "CP", "OB", "CB", "OSB", "CSB", "EQ", "DOT", "PW", "CL", 
			"US", "PC", "OUTPUT", "INPUT", "RINPUT", "BOOL", "CHAR", "INT", "STRING", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "picalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public picalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			proc();
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

	public static class ProcContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode OUTPUT() { return getToken(picalcParser.OUTPUT, 0); }
		public TerminalNode INPUT() { return getToken(picalcParser.INPUT, 0); }
		public AbsContext abs() {
			return getRuleContext(AbsContext.class,0);
		}
		public TerminalNode RINPUT() { return getToken(picalcParser.RINPUT, 0); }
		public TerminalNode OP() { return getToken(picalcParser.OP, 0); }
		public TerminalNode CP() { return getToken(picalcParser.CP, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode PC() { return getToken(picalcParser.PC, 0); }
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proc);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				val();
				setState(24);
				match(OUTPUT);
				setState(25);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				val();
				setState(28);
				match(INPUT);
				setState(29);
				abs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				val();
				setState(32);
				match(RINPUT);
				setState(33);
				abs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				match(OP);
				setState(36);
				match(CP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				match(OP);
				setState(38);
				proc();
				setState(39);
				match(PC);
				setState(40);
				proc();
				setState(41);
				match(CP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				match(OP);
				setState(44);
				dec();
				setState(45);
				proc();
				setState(46);
				match(CP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				match(T__1);
				setState(49);
				val();
				setState(50);
				match(T__2);
				setState(51);
				proc();
				setState(52);
				match(T__3);
				setState(53);
				proc();
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

	public static class DecContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(picalcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(picalcParser.ID, i);
		}
		public TerminalNode CL() { return getToken(picalcParser.CL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<AbsContext> abs() {
			return getRuleContexts(AbsContext.class);
		}
		public AbsContext abs(int i) {
			return getRuleContext(AbsContext.class,i);
		}
		public TerminalNode EQ() { return getToken(picalcParser.EQ, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__4);
				setState(58);
				match(ID);
				setState(59);
				match(CL);
				setState(60);
				type();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(T__5);
				setState(62);
				match(ID);
				setState(63);
				abs();
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					match(T__6);
					setState(65);
					match(ID);
					setState(66);
					abs();
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__7);
				setState(72);
				match(ID);
				setState(73);
				match(EQ);
				setState(74);
				type();
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

	public static class PatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(picalcParser.ID, 0); }
		public OtypeContext otype() {
			return getRuleContext(OtypeContext.class,0);
		}
		public TerminalNode OSB() { return getToken(picalcParser.OSB, 0); }
		public TerminalNode CSB() { return getToken(picalcParser.CSB, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<PatContext> pat() {
			return getRuleContexts(PatContext.class);
		}
		public PatContext pat(int i) {
			return getRuleContext(PatContext.class,i);
		}
		public TerminalNode US() { return getToken(picalcParser.US, 0); }
		public PatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitPat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatContext pat() throws RecognitionException {
		PatContext _localctx = new PatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pat);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(ID);
				setState(78);
				otype();
				}
				break;
			case OSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(OSB);
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					label();
					setState(81);
					pat();
					}
					}
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OSB) | (1L << US) | (1L << ID))) != 0) );
				setState(87);
				match(CSB);
				}
				break;
			case US:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(US);
				setState(90);
				otype();
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

	public static class OtypeContext extends ParserRuleContext {
		public TerminalNode CL() { return getToken(picalcParser.CL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterOtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitOtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitOtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtypeContext otype() throws RecognitionException {
		OtypeContext _localctx = new OtypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_otype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CL) {
				{
				setState(93);
				match(CL);
				setState(94);
				type();
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode PW() { return getToken(picalcParser.PW, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode OSB() { return getToken(picalcParser.OSB, 0); }
		public TerminalNode CSB() { return getToken(picalcParser.CSB, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PW:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(PW);
				setState(98);
				type();
				}
				break;
			case OSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(OSB);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << OSB) | (1L << PW) | (1L << ID))) != 0)) {
					{
					{
					setState(100);
					label();
					setState(101);
					type();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(CSB);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class AbsContext extends ParserRuleContext {
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public TerminalNode EQ() { return getToken(picalcParser.EQ, 0); }
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public AbsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterAbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitAbs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitAbs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsContext abs() throws RecognitionException {
		AbsContext _localctx = new AbsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_abs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			pat();
			setState(113);
			match(EQ);
			setState(114);
			proc();
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

	public static class ValContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode OSB() { return getToken(picalcParser.OSB, 0); }
		public TerminalNode CSB() { return getToken(picalcParser.CSB, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode BOOL() { return getToken(picalcParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(picalcParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(picalcParser.INT, 0); }
		public TerminalNode STRING() { return getToken(picalcParser.STRING, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_val);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				path();
				}
				break;
			case OSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(OSB);
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					label();
					setState(119);
					val();
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OSB) | (1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0) );
				setState(125);
				match(CSB);
				}
				break;
			case BOOL:
			case CHAR:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(picalcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(picalcParser.ID, i);
		}
		public TerminalNode OB() { return getToken(picalcParser.OB, 0); }
		public TerminalNode CB() { return getToken(picalcParser.CB, 0); }
		public List<TerminalNode> DOT() { return getTokens(picalcParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(picalcParser.DOT, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);
			setState(131);
			match(OB);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(132);
				match(DOT);
				setState(133);
				match(ID);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(CB);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(picalcParser.ID, 0); }
		public TerminalNode EQ() { return getToken(picalcParser.EQ, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(141);
				match(ID);
				setState(142);
				match(EQ);
				}
				break;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0094\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4F\n\4\r\4\16"+
		"\4G\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5V\n\5\r\5\16\5"+
		"W\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\5\6b\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7j\n\7\f\7\16\7m\13\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\6\t|\n\t\r\t\16\t}\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3\n\3\n\3\n\7"+
		"\n\u0089\n\n\f\n\16\n\u008c\13\n\3\n\3\n\3\13\3\13\5\13\u0092\n\13\3\13"+
		"\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\13\16\3\2\36!\2\u009e\2\26\3\2"+
		"\2\2\49\3\2\2\2\6M\3\2\2\2\b]\3\2\2\2\na\3\2\2\2\fp\3\2\2\2\16r\3\2\2"+
		"\2\20\u0082\3\2\2\2\22\u0084\3\2\2\2\24\u0091\3\2\2\2\26\27\7\3\2\2\27"+
		"\30\5\4\3\2\30\3\3\2\2\2\31\32\5\20\t\2\32\33\7\33\2\2\33\34\5\20\t\2"+
		"\34:\3\2\2\2\35\36\5\20\t\2\36\37\7\34\2\2\37 \5\16\b\2 :\3\2\2\2!\"\5"+
		"\20\t\2\"#\7\35\2\2#$\5\16\b\2$:\3\2\2\2%&\7\17\2\2&:\7\20\2\2\'(\7\17"+
		"\2\2()\5\4\3\2)*\7\32\2\2*+\5\4\3\2+,\7\20\2\2,:\3\2\2\2-.\7\17\2\2./"+
		"\5\6\4\2/\60\5\4\3\2\60\61\7\20\2\2\61:\3\2\2\2\62\63\7\4\2\2\63\64\5"+
		"\20\t\2\64\65\7\5\2\2\65\66\5\4\3\2\66\67\7\6\2\2\678\5\4\3\28:\3\2\2"+
		"\29\31\3\2\2\29\35\3\2\2\29!\3\2\2\29%\3\2\2\29\'\3\2\2\29-\3\2\2\29\62"+
		"\3\2\2\2:\5\3\2\2\2;<\7\7\2\2<=\7\"\2\2=>\7\30\2\2>N\5\f\7\2?@\7\b\2\2"+
		"@A\7\"\2\2AE\5\16\b\2BC\7\t\2\2CD\7\"\2\2DF\5\16\b\2EB\3\2\2\2FG\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2HN\3\2\2\2IJ\7\n\2\2JK\7\"\2\2KL\7\25\2\2LN\5\f"+
		"\7\2M;\3\2\2\2M?\3\2\2\2MI\3\2\2\2N\7\3\2\2\2OP\7\"\2\2P^\5\n\6\2QU\7"+
		"\23\2\2RS\5\24\13\2ST\5\b\5\2TV\3\2\2\2UR\3\2\2\2VW\3\2\2\2WU\3\2\2\2"+
		"WX\3\2\2\2XY\3\2\2\2YZ\7\24\2\2Z^\3\2\2\2[\\\7\31\2\2\\^\5\n\6\2]O\3\2"+
		"\2\2]Q\3\2\2\2][\3\2\2\2^\t\3\2\2\2_`\7\30\2\2`b\5\f\7\2a_\3\2\2\2ab\3"+
		"\2\2\2b\13\3\2\2\2cd\7\27\2\2dq\5\f\7\2ek\7\23\2\2fg\5\24\13\2gh\5\f\7"+
		"\2hj\3\2\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2"+
		"\2nq\7\24\2\2oq\t\2\2\2pc\3\2\2\2pe\3\2\2\2po\3\2\2\2q\r\3\2\2\2rs\5\b"+
		"\5\2st\7\25\2\2tu\5\4\3\2u\17\3\2\2\2v\u0083\5\22\n\2w{\7\23\2\2xy\5\24"+
		"\13\2yz\5\20\t\2z|\3\2\2\2{x\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\7\24\2\2\u0080\u0083\3\2\2\2\u0081\u0083\t\3\2\2\u0082"+
		"v\3\2\2\2\u0082w\3\2\2\2\u0082\u0081\3\2\2\2\u0083\21\3\2\2\2\u0084\u0085"+
		"\7\"\2\2\u0085\u008a\7\21\2\2\u0086\u0087\7\26\2\2\u0087\u0089\7\"\2\2"+
		"\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\22\2\2"+
		"\u008e\23\3\2\2\2\u008f\u0090\7\"\2\2\u0090\u0092\7\25\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\25\3\2\2\2\169GMW]akp}\u0082\u008a"+
		"\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}