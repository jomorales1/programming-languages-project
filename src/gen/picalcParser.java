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
		T__9=10, T__10=11, T__11=12, T__12=13, OP=14, CP=15, OB=16, CB=17, OSB=18, 
		CSB=19, EQ=20, DOT=21, PW=22, CL=23, US=24, PC=25, OUTPUT=26, INPUT=27, 
		RINPUT=28, BOOL=29, CHAR=30, INT=31, STRING=32, ID=33, WS=34;
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
			null, "'run'", "'if'", "'then'", "'else'", "'print'", "'new'", "'def'", 
			"'and'", "'type'", "'Boolean'", "'Char'", "'Int'", "'String'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'='", "'.'", "'^'", "':'", "'_'", 
			"'|'", "'!'", "'?'", "'?*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "OP", "CP", "OB", "CB", "OSB", "CSB", "EQ", "DOT", "PW", 
			"CL", "US", "PC", "OUTPUT", "INPUT", "RINPUT", "BOOL", "CHAR", "INT", 
			"STRING", "ID", "WS"
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
		public TerminalNode OUTPUT() { return getToken(picalcParser.OUTPUT, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(picalcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(picalcParser.ID, i);
		}
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
		public TerminalNode EQ() { return getToken(picalcParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(picalcParser.STRING, 0); }
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(23);
					val();
					}
					break;
				case 2:
					{
					setState(24);
					match(ID);
					}
					break;
				}
				setState(27);
				match(OUTPUT);
				setState(30);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(28);
					val();
					}
					break;
				case 2:
					{
					setState(29);
					match(ID);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(32);
					val();
					}
					break;
				case 2:
					{
					setState(33);
					match(ID);
					}
					break;
				}
				setState(36);
				match(INPUT);
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(37);
					abs();
					}
					break;
				case 2:
					{
					setState(38);
					match(ID);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(41);
					val();
					}
					break;
				case 2:
					{
					setState(42);
					match(ID);
					}
					break;
				}
				setState(45);
				match(RINPUT);
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(46);
					abs();
					}
					break;
				case 2:
					{
					setState(47);
					match(ID);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(OP);
				setState(51);
				match(CP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(OP);
				setState(53);
				proc();
				setState(54);
				match(PC);
				setState(55);
				proc();
				setState(56);
				match(CP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				match(OP);
				setState(59);
				dec();
				setState(60);
				proc();
				setState(61);
				match(CP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				match(T__1);
				setState(64);
				val();
				setState(65);
				match(T__2);
				setState(66);
				proc();
				setState(67);
				match(T__3);
				setState(68);
				proc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(70);
					val();
					}
					break;
				case 2:
					{
					setState(71);
					match(ID);
					}
					break;
				}
				setState(74);
				match(INPUT);
				setState(75);
				match(ID);
				setState(76);
				match(EQ);
				setState(77);
				match(T__4);
				setState(78);
				match(OUTPUT);
				setState(79);
				match(STRING);
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__5);
				setState(83);
				match(ID);
				setState(84);
				match(CL);
				setState(85);
				type();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__6);
				setState(87);
				match(ID);
				setState(88);
				abs();
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					match(T__7);
					setState(90);
					match(ID);
					setState(91);
					abs();
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__7 );
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(T__8);
				setState(97);
				match(ID);
				setState(98);
				match(EQ);
				setState(99);
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
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(ID);
				setState(103);
				otype();
				}
				break;
			case OSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(OSB);
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					label();
					setState(106);
					pat();
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OSB) | (1L << US) | (1L << ID))) != 0) );
				setState(112);
				match(CSB);
				}
				break;
			case US:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(US);
				setState(115);
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
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CL) {
				{
				setState(118);
				match(CL);
				setState(119);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PW:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(PW);
				setState(123);
				type();
				}
				break;
			case OSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(OSB);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << OSB) | (1L << PW) | (1L << ID))) != 0)) {
					{
					{
					setState(125);
					label();
					setState(126);
					type();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(CSB);
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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
		public TerminalNode OSB() { return getToken(picalcParser.OSB, 0); }
		public TerminalNode CSB() { return getToken(picalcParser.CSB, 0); }
		public List<TerminalNode> ID() { return getTokens(picalcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(picalcParser.ID, i);
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
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				pat();
				setState(138);
				match(EQ);
				setState(139);
				proc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(OSB);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(142);
					match(ID);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(CSB);
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
		public List<TerminalNode> ID() { return getTokens(picalcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(picalcParser.ID, i);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				path();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(OSB);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OSB) | (1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					{
					setState(153);
					label();
					setState(154);
					val();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(CSB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(OSB);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(163);
					match(ID);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(CSB);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
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
			setState(173);
			match(ID);
			setState(174);
			match(OB);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(175);
				match(DOT);
				setState(176);
				match(ID);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(184);
				match(ID);
				setState(185);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\5\3%\n"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\5\3\63\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3K\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3S\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\6\4_\n\4\r\4\16\4`\3\4\3\4\3\4\3\4\5\4g\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\6\5o\n\5\r\5\16\5p\3\5\3\5\3\5\3\5\5\5w\n\5\3\6"+
		"\3\6\5\6{\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0083\n\7\f\7\16\7\u0086\13"+
		"\7\3\7\3\7\5\7\u008a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0092\n\b\f\b\16"+
		"\b\u0095\13\b\3\b\5\b\u0098\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u009f\n\t\f\t"+
		"\16\t\u00a2\13\t\3\t\3\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa\13\t\3\t\3\t"+
		"\5\t\u00ae\n\t\3\n\3\n\3\n\3\n\7\n\u00b4\n\n\f\n\16\n\u00b7\13\n\3\n\3"+
		"\n\3\13\3\13\5\13\u00bd\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3"+
		"\2\f\17\3\2\37\"\2\u00d5\2\26\3\2\2\2\4R\3\2\2\2\6f\3\2\2\2\bv\3\2\2\2"+
		"\nz\3\2\2\2\f\u0089\3\2\2\2\16\u0097\3\2\2\2\20\u00ad\3\2\2\2\22\u00af"+
		"\3\2\2\2\24\u00bc\3\2\2\2\26\27\7\3\2\2\27\30\5\4\3\2\30\3\3\2\2\2\31"+
		"\34\5\20\t\2\32\34\7#\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35"+
		" \7\34\2\2\36!\5\20\t\2\37!\7#\2\2 \36\3\2\2\2 \37\3\2\2\2!S\3\2\2\2\""+
		"%\5\20\t\2#%\7#\2\2$\"\3\2\2\2$#\3\2\2\2%&\3\2\2\2&)\7\35\2\2\'*\5\16"+
		"\b\2(*\7#\2\2)\'\3\2\2\2)(\3\2\2\2*S\3\2\2\2+.\5\20\t\2,.\7#\2\2-+\3\2"+
		"\2\2-,\3\2\2\2./\3\2\2\2/\62\7\36\2\2\60\63\5\16\b\2\61\63\7#\2\2\62\60"+
		"\3\2\2\2\62\61\3\2\2\2\63S\3\2\2\2\64\65\7\20\2\2\65S\7\21\2\2\66\67\7"+
		"\20\2\2\678\5\4\3\289\7\33\2\29:\5\4\3\2:;\7\21\2\2;S\3\2\2\2<=\7\20\2"+
		"\2=>\5\6\4\2>?\5\4\3\2?@\7\21\2\2@S\3\2\2\2AB\7\4\2\2BC\5\20\t\2CD\7\5"+
		"\2\2DE\5\4\3\2EF\7\6\2\2FG\5\4\3\2GS\3\2\2\2HK\5\20\t\2IK\7#\2\2JH\3\2"+
		"\2\2JI\3\2\2\2KL\3\2\2\2LM\7\35\2\2MN\7#\2\2NO\7\26\2\2OP\7\7\2\2PQ\7"+
		"\34\2\2QS\7\"\2\2R\33\3\2\2\2R$\3\2\2\2R-\3\2\2\2R\64\3\2\2\2R\66\3\2"+
		"\2\2R<\3\2\2\2RA\3\2\2\2RJ\3\2\2\2S\5\3\2\2\2TU\7\b\2\2UV\7#\2\2VW\7\31"+
		"\2\2Wg\5\f\7\2XY\7\t\2\2YZ\7#\2\2Z^\5\16\b\2[\\\7\n\2\2\\]\7#\2\2]_\5"+
		"\16\b\2^[\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ag\3\2\2\2bc\7\13\2\2c"+
		"d\7#\2\2de\7\26\2\2eg\5\f\7\2fT\3\2\2\2fX\3\2\2\2fb\3\2\2\2g\7\3\2\2\2"+
		"hi\7#\2\2iw\5\n\6\2jn\7\24\2\2kl\5\24\13\2lm\5\b\5\2mo\3\2\2\2nk\3\2\2"+
		"\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\25\2\2sw\3\2\2\2tu\7\32"+
		"\2\2uw\5\n\6\2vh\3\2\2\2vj\3\2\2\2vt\3\2\2\2w\t\3\2\2\2xy\7\31\2\2y{\5"+
		"\f\7\2zx\3\2\2\2z{\3\2\2\2{\13\3\2\2\2|}\7\30\2\2}\u008a\5\f\7\2~\u0084"+
		"\7\24\2\2\177\u0080\5\24\13\2\u0080\u0081\5\f\7\2\u0081\u0083\3\2\2\2"+
		"\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008a\7\25\2\2"+
		"\u0088\u008a\t\2\2\2\u0089|\3\2\2\2\u0089~\3\2\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\r\3\2\2\2\u008b\u008c\5\b\5\2\u008c\u008d\7\26\2\2\u008d\u008e"+
		"\5\4\3\2\u008e\u0098\3\2\2\2\u008f\u0093\7\24\2\2\u0090\u0092\7#\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7\25\2\2\u0097"+
		"\u008b\3\2\2\2\u0097\u008f\3\2\2\2\u0098\17\3\2\2\2\u0099\u00ae\5\22\n"+
		"\2\u009a\u00a0\7\24\2\2\u009b\u009c\5\24\13\2\u009c\u009d\5\20\t\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009b\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00ae\7\25\2\2\u00a4\u00a8\7\24\2\2\u00a5\u00a7\7#\2\2\u00a6\u00a5\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\7\25\2\2\u00ac\u00ae\t"+
		"\3\2\2\u00ad\u0099\3\2\2\2\u00ad\u009a\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00b0\7#\2\2\u00b0\u00b5\7\22\2"+
		"\2\u00b1\u00b2\7\27\2\2\u00b2\u00b4\7#\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\7\23\2\2\u00b9\23\3\2\2\2\u00ba\u00bb\7#\2"+
		"\2\u00bb\u00bd\7\26\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\25\3\2\2\2\30\33 $)-\62JR`fpvz\u0084\u0089\u0093\u0097\u00a0\u00a8\u00ad"+
		"\u00b5\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}