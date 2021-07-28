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
		RULE_block = 0, RULE_program = 1, RULE_proc = 2, RULE_dec = 3, RULE_pat = 4, 
		RULE_otype = 5, RULE_type = 6, RULE_abs = 7, RULE_val = 8, RULE_path = 9, 
		RULE_label = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"block", "program", "proc", "dec", "pat", "otype", "type", "abs", "val", 
			"path", "label"
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(picalcParser.EOF, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picalcListener ) ((picalcListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picalcVisitor ) return ((picalcVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__8))) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(22);
					program();
					}
					break;
				case T__5:
				case T__6:
				case T__8:
					{
					setState(23);
					dec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
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
		enterRule(_localctx, 4, RULE_proc);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(34);
					val();
					}
					break;
				case 2:
					{
					setState(35);
					match(ID);
					}
					break;
				}
				setState(38);
				match(OUTPUT);
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(39);
					val();
					}
					break;
				case 2:
					{
					setState(40);
					match(ID);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(43);
					val();
					}
					break;
				case 2:
					{
					setState(44);
					match(ID);
					}
					break;
				}
				setState(47);
				match(INPUT);
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(48);
					abs();
					}
					break;
				case 2:
					{
					setState(49);
					match(ID);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(52);
					val();
					}
					break;
				case 2:
					{
					setState(53);
					match(ID);
					}
					break;
				}
				setState(56);
				match(RINPUT);
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(57);
					abs();
					}
					break;
				case 2:
					{
					setState(58);
					match(ID);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(OP);
				setState(62);
				match(CP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				match(OP);
				setState(64);
				proc();
				setState(65);
				match(PC);
				setState(66);
				proc();
				setState(67);
				match(CP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				match(OP);
				setState(70);
				dec();
				setState(71);
				proc();
				setState(72);
				match(CP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				match(T__1);
				setState(75);
				val();
				setState(76);
				match(T__2);
				setState(77);
				proc();
				setState(78);
				match(T__3);
				setState(79);
				proc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(81);
					val();
					}
					break;
				case 2:
					{
					setState(82);
					match(ID);
					}
					break;
				}
				setState(85);
				match(INPUT);
				setState(86);
				match(ID);
				setState(87);
				match(EQ);
				setState(88);
				match(T__4);
				setState(89);
				match(OUTPUT);
				setState(90);
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
		enterRule(_localctx, 6, RULE_dec);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__5);
				setState(94);
				match(ID);
				setState(95);
				match(CL);
				setState(96);
				type();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__6);
				setState(98);
				match(ID);
				setState(99);
				abs();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(100);
					match(T__7);
					setState(101);
					match(ID);
					setState(102);
					abs();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__8);
				setState(109);
				match(ID);
				setState(110);
				match(EQ);
				setState(111);
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
		enterRule(_localctx, 8, RULE_pat);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(ID);
				setState(115);
				otype();
				}
				break;
			case OSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(OSB);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OSB) | (1L << US) | (1L << ID))) != 0)) {
					{
					{
					setState(117);
					label();
					setState(118);
					pat();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(CSB);
				}
				break;
			case US:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(US);
				setState(127);
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
		enterRule(_localctx, 10, RULE_otype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CL) {
				{
				setState(130);
				match(CL);
				setState(131);
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
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PW:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(PW);
				setState(135);
				type();
				}
				break;
			case OSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(OSB);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << OSB) | (1L << PW) | (1L << ID))) != 0)) {
					{
					{
					setState(137);
					label();
					setState(138);
					type();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(CSB);
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
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
		enterRule(_localctx, 14, RULE_abs);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				pat();
				setState(150);
				match(EQ);
				setState(151);
				proc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(OSB);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(154);
					match(ID);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
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
		enterRule(_localctx, 16, RULE_val);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				path();
				}
				break;
			case OSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(OSB);
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OSB) | (1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
						{
						{
						setState(165);
						label();
						setState(166);
						val();
						}
						}
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(173);
						match(ID);
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(181);
				match(CSB);
				}
				break;
			case BOOL:
			case CHAR:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
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
		enterRule(_localctx, 18, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(186);
				match(DOT);
				setState(187);
				match(ID);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 20, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(193);
				match(ID);
				setState(194);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\5\4\'\n\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\5"+
		"\4\65\n\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"V\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\3\6\3\6\5\6\u0083\n\6\3\7\3\7"+
		"\5\7\u0087\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008f\n\b\f\b\16\b\u0092\13"+
		"\b\3\b\3\b\5\b\u0096\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009e\n\t\f\t\16"+
		"\t\u00a1\13\t\3\t\5\t\u00a4\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00ab\n\n\f\n"+
		"\16\n\u00ae\13\n\3\n\7\n\u00b1\n\n\f\n\16\n\u00b4\13\n\5\n\u00b6\n\n\3"+
		"\n\3\n\5\n\u00ba\n\n\3\13\3\13\3\13\7\13\u00bf\n\13\f\13\16\13\u00c2\13"+
		"\13\3\f\3\f\5\f\u00c6\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2"+
		"\f\17\3\2\37\"\2\u00df\2\34\3\2\2\2\4!\3\2\2\2\6]\3\2\2\2\br\3\2\2\2\n"+
		"\u0082\3\2\2\2\f\u0086\3\2\2\2\16\u0095\3\2\2\2\20\u00a3\3\2\2\2\22\u00b9"+
		"\3\2\2\2\24\u00bb\3\2\2\2\26\u00c5\3\2\2\2\30\33\5\4\3\2\31\33\5\b\5\2"+
		"\32\30\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2"+
		"\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!\"\7\3\2\2\"#\5\6"+
		"\4\2#\5\3\2\2\2$\'\5\22\n\2%\'\7#\2\2&$\3\2\2\2&%\3\2\2\2\'(\3\2\2\2("+
		"+\7\34\2\2),\5\22\n\2*,\7#\2\2+)\3\2\2\2+*\3\2\2\2,^\3\2\2\2-\60\5\22"+
		"\n\2.\60\7#\2\2/-\3\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61\64\7\35\2\2\62\65"+
		"\5\20\t\2\63\65\7#\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65^\3\2\2\2\669\5\22"+
		"\n\2\679\7#\2\28\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:=\7\36\2\2;>\5\20\t"+
		"\2<>\7#\2\2=;\3\2\2\2=<\3\2\2\2>^\3\2\2\2?@\7\20\2\2@^\7\21\2\2AB\7\20"+
		"\2\2BC\5\6\4\2CD\7\33\2\2DE\5\6\4\2EF\7\21\2\2F^\3\2\2\2GH\7\20\2\2HI"+
		"\5\b\5\2IJ\5\6\4\2JK\7\21\2\2K^\3\2\2\2LM\7\4\2\2MN\5\22\n\2NO\7\5\2\2"+
		"OP\5\6\4\2PQ\7\6\2\2QR\5\6\4\2R^\3\2\2\2SV\5\22\n\2TV\7#\2\2US\3\2\2\2"+
		"UT\3\2\2\2VW\3\2\2\2WX\7\35\2\2XY\7#\2\2YZ\7\26\2\2Z[\7\7\2\2[\\\7\34"+
		"\2\2\\^\7\"\2\2]&\3\2\2\2]/\3\2\2\2]8\3\2\2\2]?\3\2\2\2]A\3\2\2\2]G\3"+
		"\2\2\2]L\3\2\2\2]U\3\2\2\2^\7\3\2\2\2_`\7\b\2\2`a\7#\2\2ab\7\31\2\2bs"+
		"\5\16\b\2cd\7\t\2\2de\7#\2\2ek\5\20\t\2fg\7\n\2\2gh\7#\2\2hj\5\20\t\2"+
		"if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ls\3\2\2\2mk\3\2\2\2no\7\13\2"+
		"\2op\7#\2\2pq\7\26\2\2qs\5\16\b\2r_\3\2\2\2rc\3\2\2\2rn\3\2\2\2s\t\3\2"+
		"\2\2tu\7#\2\2u\u0083\5\f\7\2v|\7\24\2\2wx\5\26\f\2xy\5\n\6\2y{\3\2\2\2"+
		"zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0083"+
		"\7\25\2\2\u0080\u0081\7\32\2\2\u0081\u0083\5\f\7\2\u0082t\3\2\2\2\u0082"+
		"v\3\2\2\2\u0082\u0080\3\2\2\2\u0083\13\3\2\2\2\u0084\u0085\7\31\2\2\u0085"+
		"\u0087\5\16\b\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\r\3\2\2"+
		"\2\u0088\u0089\7\30\2\2\u0089\u0096\5\16\b\2\u008a\u0090\7\24\2\2\u008b"+
		"\u008c\5\26\f\2\u008c\u008d\5\16\b\2\u008d\u008f\3\2\2\2\u008e\u008b\3"+
		"\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0096\7\25\2\2\u0094\u0096\t"+
		"\2\2\2\u0095\u0088\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\17\3\2\2\2\u0097\u0098\5\n\6\2\u0098\u0099\7\26\2\2\u0099\u009a\5\6\4"+
		"\2\u009a\u00a4\3\2\2\2\u009b\u009f\7\24\2\2\u009c\u009e\7#\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7\25\2\2\u00a3\u0097\3"+
		"\2\2\2\u00a3\u009b\3\2\2\2\u00a4\21\3\2\2\2\u00a5\u00ba\5\24\13\2\u00a6"+
		"\u00b5\7\24\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\5\22\n\2\u00a9\u00ab"+
		"\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00b6\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\7#"+
		"\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ac\3\2"+
		"\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\7\25\2\2\u00b8"+
		"\u00ba\t\3\2\2\u00b9\u00a5\3\2\2\2\u00b9\u00a6\3\2\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\23\3\2\2\2\u00bb\u00c0\7#\2\2\u00bc\u00bd\7\27\2\2\u00bd\u00bf"+
		"\7#\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\25\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7#\2\2"+
		"\u00c4\u00c6\7\26\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\27"+
		"\3\2\2\2\33\32\34&+/\648=U]kr|\u0082\u0086\u0090\u0095\u009f\u00a3\u00ac"+
		"\u00b2\u00b5\u00b9\u00c0\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}