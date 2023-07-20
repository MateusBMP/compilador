// Generated from Nelang.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NelangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DECLARE=3, ASSIGN=4, SUM=5, MINUS=6, PRINT=7, INTEGER=8, 
		IDENTIFIER=9, NEWLINE=10, SPACE=11;
	public static final int
		RULE_nelang = 0, RULE_initNLG = 1, RULE_endNLG = 2, RULE_statement = 3, 
		RULE_endStatement = 4, RULE_declaration = 5, RULE_assignment = 6, RULE_sum = 7, 
		RULE_minus = 8, RULE_print = 9, RULE_valuePosition = 10, RULE_identifierAsValue = 11, 
		RULE_integerAsValue = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"nelang", "initNLG", "endNLG", "statement", "endStatement", "declaration", 
			"assignment", "sum", "minus", "print", "valuePosition", "identifierAsValue", 
			"integerAsValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INIT NLG'", "'END NLG'", "'DECLARE'", "'ASSIGN'", "'SUM'", "'MINUS'", 
			"'PRINT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DECLARE", "ASSIGN", "SUM", "MINUS", "PRINT", "INTEGER", 
			"IDENTIFIER", "NEWLINE", "SPACE"
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
	public String getGrammarFileName() { return "Nelang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NelangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NelangContext extends ParserRuleContext {
		public InitNLGContext initNLG() {
			return getRuleContext(InitNLGContext.class,0);
		}
		public EndNLGContext endNLG() {
			return getRuleContext(EndNLGContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NelangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nelang; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterNelang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitNelang(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitNelang(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NelangContext nelang() throws RecognitionException {
		NelangContext _localctx = new NelangContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nelang);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			initNLG();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 248L) != 0)) {
				{
				{
				setState(27);
				statement();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			endNLG();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitNLGContext extends ParserRuleContext {
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public InitNLGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initNLG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterInitNLG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitInitNLG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitInitNLG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitNLGContext initNLG() throws RecognitionException {
		InitNLGContext _localctx = new InitNLGContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initNLG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			endStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndNLGContext extends ParserRuleContext {
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NelangParser.EOF, 0); }
		public EndNLGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endNLG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterEndNLG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitEndNLG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitEndNLG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndNLGContext endNLG() throws RecognitionException {
		EndNLGContext _localctx = new EndNLGContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endNLG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__1);
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
			case SPACE:
				{
				setState(39);
				endStatement();
				}
				break;
			case EOF:
				{
				setState(40);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				declaration();
				setState(44);
				endStatement();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				assignment();
				setState(47);
				endStatement();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				sum();
				setState(50);
				endStatement();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				minus();
				setState(53);
				endStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				print();
				setState(56);
				endStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndStatementContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(NelangParser.NEWLINE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public EndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndStatementContext endStatement() throws RecognitionException {
		EndStatementContext _localctx = new EndStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_endStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(60);
				match(SPACE);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(NelangParser.DECLARE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(DECLARE);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				match(SPACE);
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(74);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(NelangParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public ValuePositionContext valuePosition() {
			return getRuleContext(ValuePositionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ASSIGN);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				match(SPACE);
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(82);
			match(IDENTIFIER);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				match(SPACE);
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(88);
			valuePosition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SumContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(NelangParser.SUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public ValuePositionContext valuePosition() {
			return getRuleContext(ValuePositionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(SUM);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(SPACE);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(96);
			match(IDENTIFIER);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				match(SPACE);
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(102);
			valuePosition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(NelangParser.MINUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public ValuePositionContext valuePosition() {
			return getRuleContext(ValuePositionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(MINUS);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				match(SPACE);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(110);
			match(IDENTIFIER);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(SPACE);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(116);
			valuePosition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(NelangParser.PRINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(PRINT);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				match(SPACE);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(124);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValuePositionContext extends ParserRuleContext {
		public IdentifierAsValueContext identifierAsValue() {
			return getRuleContext(IdentifierAsValueContext.class,0);
		}
		public IntegerAsValueContext integerAsValue() {
			return getRuleContext(IntegerAsValueContext.class,0);
		}
		public ValuePositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuePosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterValuePosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitValuePosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitValuePosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuePositionContext valuePosition() throws RecognitionException {
		ValuePositionContext _localctx = new ValuePositionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valuePosition);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				identifierAsValue();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				integerAsValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierAsValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public IdentifierAsValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierAsValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterIdentifierAsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitIdentifierAsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitIdentifierAsValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierAsValueContext identifierAsValue() throws RecognitionException {
		IdentifierAsValueContext _localctx = new IdentifierAsValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifierAsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerAsValueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(NelangParser.INTEGER, 0); }
		public IntegerAsValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerAsValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterIntegerAsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitIntegerAsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitIntegerAsValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerAsValueContext integerAsValue() throws RecognitionException {
		IntegerAsValueContext _localctx = new IntegerAsValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_integerAsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(INTEGER);
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
		"\u0004\u0001\u000b\u0087\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000\n\u0000"+
		"\f\u0000 \t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002*\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0004\u0005"+
		"\u0004>\b\u0004\n\u0004\f\u0004A\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0004\u0005G\b\u0005\u000b\u0005\f\u0005H\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0004\u0006O\b\u0006\u000b\u0006"+
		"\f\u0006P\u0001\u0006\u0001\u0006\u0004\u0006U\b\u0006\u000b\u0006\f\u0006"+
		"V\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007]\b\u0007"+
		"\u000b\u0007\f\u0007^\u0001\u0007\u0001\u0007\u0004\u0007c\b\u0007\u000b"+
		"\u0007\f\u0007d\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0004\bk\b\b\u000b"+
		"\b\f\bl\u0001\b\u0001\b\u0004\bq\b\b\u000b\b\f\br\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0004\ty\b\t\u000b\t\f\tz\u0001\t\u0001\t\u0001\n\u0001\n\u0003"+
		"\n\u0081\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0000\u0000"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0000\u0089\u0000\u001a\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000"+
		"\u0000\u0004&\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b"+
		"?\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000\fL\u0001\u0000\u0000"+
		"\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000\u0012"+
		"v\u0001\u0000\u0000\u0000\u0014\u0080\u0001\u0000\u0000\u0000\u0016\u0082"+
		"\u0001\u0000\u0000\u0000\u0018\u0084\u0001\u0000\u0000\u0000\u001a\u001e"+
		"\u0003\u0002\u0001\u0000\u001b\u001d\u0003\u0006\u0003\u0000\u001c\u001b"+
		"\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\"\u0003\u0004\u0002\u0000"+
		"\"\u0001\u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0003\b\u0004"+
		"\u0000%\u0003\u0001\u0000\u0000\u0000&)\u0005\u0002\u0000\u0000\'*\u0003"+
		"\b\u0004\u0000(*\u0005\u0000\u0000\u0001)\'\u0001\u0000\u0000\u0000)("+
		"\u0001\u0000\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+,\u0003\n\u0005"+
		"\u0000,-\u0003\b\u0004\u0000-;\u0001\u0000\u0000\u0000./\u0003\f\u0006"+
		"\u0000/0\u0003\b\u0004\u00000;\u0001\u0000\u0000\u000012\u0003\u000e\u0007"+
		"\u000023\u0003\b\u0004\u00003;\u0001\u0000\u0000\u000045\u0003\u0010\b"+
		"\u000056\u0003\b\u0004\u00006;\u0001\u0000\u0000\u000078\u0003\u0012\t"+
		"\u000089\u0003\b\u0004\u00009;\u0001\u0000\u0000\u0000:+\u0001\u0000\u0000"+
		"\u0000:.\u0001\u0000\u0000\u0000:1\u0001\u0000\u0000\u0000:4\u0001\u0000"+
		"\u0000\u0000:7\u0001\u0000\u0000\u0000;\u0007\u0001\u0000\u0000\u0000"+
		"<>\u0005\u000b\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005\n\u0000\u0000C\t\u0001"+
		"\u0000\u0000\u0000DF\u0005\u0003\u0000\u0000EG\u0005\u000b\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005\t\u0000"+
		"\u0000K\u000b\u0001\u0000\u0000\u0000LN\u0005\u0004\u0000\u0000MO\u0005"+
		"\u000b\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RT\u0005\t\u0000\u0000SU\u0005\u000b\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0003\u0014\n\u0000Y\r\u0001"+
		"\u0000\u0000\u0000Z\\\u0005\u0005\u0000\u0000[]\u0005\u000b\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0005\t\u0000"+
		"\u0000ac\u0005\u000b\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fg\u0003\u0014\n\u0000g\u000f\u0001\u0000\u0000\u0000"+
		"hj\u0005\u0006\u0000\u0000ik\u0005\u000b\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0005\t\u0000\u0000oq\u0005\u000b"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tu\u0003\u0014\n\u0000u\u0011\u0001\u0000\u0000\u0000vx\u0005\u0007\u0000"+
		"\u0000wy\u0005\u000b\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0005\t\u0000\u0000}\u0013\u0001\u0000\u0000\u0000"+
		"~\u0081\u0003\u0016\u000b\u0000\u007f\u0081\u0003\u0018\f\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0015"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\t\u0000\u0000\u0083\u0017\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085\u0019\u0001\u0000"+
		"\u0000\u0000\r\u001e):?HPV^dlrz\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}