// Generated from ./src/compiler/nelang/Nelang.g4 by ANTLR 4.13.0
package compiler.nelang.antlr;
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
		ASSIGN=1, DECLARE=2, DIVIDE=3, END=4, INIT=5, MINUS=6, MULTIPLY=7, PRINT=8, 
		SUM=9, INTEGER=10, IDENTIFIER=11, NEWLINE=12, SPACE=13;
	public static final int
		RULE_nelang = 0, RULE_label = 1, RULE_initLabel = 2, RULE_endLabel = 3, 
		RULE_statement = 4, RULE_endLine = 5, RULE_declaration = 6, RULE_assignment = 7, 
		RULE_sum = 8, RULE_minus = 9, RULE_multiply = 10, RULE_divide = 11, RULE_print = 12, 
		RULE_valuePosition = 13, RULE_identifierAsValue = 14, RULE_integerAsValue = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"nelang", "label", "initLabel", "endLabel", "statement", "endLine", "declaration", 
			"assignment", "sum", "minus", "multiply", "divide", "print", "valuePosition", 
			"identifierAsValue", "integerAsValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ASSIGN'", "'DECLARE'", "'DIVIDE'", "'END'", "'INIT'", "'MINUS'", 
			"'MULTIPLY'", "'PRINT'", "'SUM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "DECLARE", "DIVIDE", "END", "INIT", "MINUS", "MULTIPLY", 
			"PRINT", "SUM", "INTEGER", "IDENTIFIER", "NEWLINE", "SPACE"
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
		public TerminalNode EOF() { return getToken(NelangParser.EOF, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INIT) {
				{
				{
				setState(32);
				label();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public InitLabelContext initLabel() {
			return getRuleContext(InitLabelContext.class,0);
		}
		public EndLabelContext endLabel() {
			return getRuleContext(EndLabelContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			initLabel();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 974L) != 0)) {
				{
				{
				setState(41);
				statement();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			endLabel();
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
	public static class InitLabelContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(NelangParser.INIT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public EndLineContext endLine() {
			return getRuleContext(EndLineContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public InitLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterInitLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitInitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitInitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitLabelContext initLabel() throws RecognitionException {
		InitLabelContext _localctx = new InitLabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(INIT);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				match(SPACE);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(55);
			match(IDENTIFIER);
			setState(56);
			endLine();
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
	public static class EndLabelContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(NelangParser.END, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public EndLineContext endLine() {
			return getRuleContext(EndLineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NelangParser.EOF, 0); }
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public EndLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterEndLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitEndLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitEndLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndLabelContext endLabel() throws RecognitionException {
		EndLabelContext _localctx = new EndLabelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_endLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(END);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				match(SPACE);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(64);
			match(IDENTIFIER);
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
			case SPACE:
				{
				setState(65);
				endLine();
				}
				break;
			case EOF:
				{
				setState(66);
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
		public EndLineContext endLine() {
			return getRuleContext(EndLineContext.class,0);
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
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				declaration();
				setState(70);
				endLine();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				assignment();
				setState(73);
				endLine();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				sum();
				setState(76);
				endLine();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				minus();
				setState(79);
				endLine();
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				multiply();
				setState(82);
				endLine();
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				divide();
				setState(85);
				endLine();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				print();
				setState(88);
				endLine();
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
	public static class EndLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(NelangParser.NEWLINE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public EndLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterEndLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitEndLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitEndLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndLineContext endLine() throws RecognitionException {
		EndLineContext _localctx = new EndLineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(92);
				match(SPACE);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(DECLARE);
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				match(SPACE);
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(106);
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
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ASSIGN);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				match(SPACE);
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(114);
			match(IDENTIFIER);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				match(SPACE);
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(120);
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
		enterRule(_localctx, 16, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(SUM);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				match(SPACE);
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(128);
			match(IDENTIFIER);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				match(SPACE);
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(134);
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
		enterRule(_localctx, 18, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(MINUS);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				match(SPACE);
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(142);
			match(IDENTIFIER);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				match(SPACE);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(148);
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
	public static class MultiplyContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(NelangParser.MULTIPLY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public ValuePositionContext valuePosition() {
			return getRuleContext(ValuePositionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(MULTIPLY);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				match(SPACE);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(156);
			match(IDENTIFIER);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				match(SPACE);
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(162);
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
	public static class DivideContext extends ParserRuleContext {
		public TerminalNode DIVIDE() { return getToken(NelangParser.DIVIDE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public ValuePositionContext valuePosition() {
			return getRuleContext(ValuePositionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_divide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(DIVIDE);
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				match(SPACE);
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(170);
			match(IDENTIFIER);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				match(SPACE);
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(176);
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
		enterRule(_localctx, 24, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(PRINT);
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				match(SPACE);
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(184);
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
		enterRule(_localctx, 26, RULE_valuePosition);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				identifierAsValue();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
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
		enterRule(_localctx, 28, RULE_identifierAsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		enterRule(_localctx, 30, RULE_integerAsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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
		"\u0004\u0001\r\u00c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001+\b\u0001\n\u0001\f\u0001"+
		".\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002"+
		"4\b\u0002\u000b\u0002\f\u00025\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0004\u0003=\b\u0003\u000b\u0003\f\u0003>\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003D\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0005\u0005\u0005^\b\u0005\n\u0005"+
		"\f\u0005a\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004"+
		"\u0006g\b\u0006\u000b\u0006\f\u0006h\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0004\u0007o\b\u0007\u000b\u0007\f\u0007p\u0001\u0007\u0001"+
		"\u0007\u0004\u0007u\b\u0007\u000b\u0007\f\u0007v\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0004\b}\b\b\u000b\b\f\b~\u0001\b\u0001\b\u0004\b\u0083"+
		"\b\b\u000b\b\f\b\u0084\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t\u008b\b"+
		"\t\u000b\t\f\t\u008c\u0001\t\u0001\t\u0004\t\u0091\b\t\u000b\t\f\t\u0092"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n\u0099\b\n\u000b\n\f\n\u009a\u0001"+
		"\n\u0001\n\u0004\n\u009f\b\n\u000b\n\f\n\u00a0\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u00a7\b\u000b\u000b\u000b\f\u000b\u00a8\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u00ad\b\u000b\u000b\u000b\f\u000b\u00ae"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0004\f\u00b5\b\f\u000b\f\f\f"+
		"\u00b6\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00bd\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		"\u0000\u0000\u00cb\u0000#\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000"+
		"\u0000\u00041\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b"+
		"Z\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000"+
		"\u0000\u000el\u0001\u0000\u0000\u0000\u0010z\u0001\u0000\u0000\u0000\u0012"+
		"\u0088\u0001\u0000\u0000\u0000\u0014\u0096\u0001\u0000\u0000\u0000\u0016"+
		"\u00a4\u0001\u0000\u0000\u0000\u0018\u00b2\u0001\u0000\u0000\u0000\u001a"+
		"\u00bc\u0001\u0000\u0000\u0000\u001c\u00be\u0001\u0000\u0000\u0000\u001e"+
		"\u00c0\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u0000\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000(,\u0003\u0004"+
		"\u0002\u0000)+\u0003\b\u0004\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0003\u0006\u0003\u0000"+
		"0\u0003\u0001\u0000\u0000\u000013\u0005\u0005\u0000\u000024\u0005\r\u0000"+
		"\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005"+
		"\u000b\u0000\u000089\u0003\n\u0005\u00009\u0005\u0001\u0000\u0000\u0000"+
		":<\u0005\u0004\u0000\u0000;=\u0005\r\u0000\u0000<;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@C\u0005\u000b\u0000\u0000AD\u0003\n\u0005"+
		"\u0000BD\u0005\u0000\u0000\u0001CA\u0001\u0000\u0000\u0000CB\u0001\u0000"+
		"\u0000\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0003\f\u0006\u0000FG\u0003"+
		"\n\u0005\u0000G[\u0001\u0000\u0000\u0000HI\u0003\u000e\u0007\u0000IJ\u0003"+
		"\n\u0005\u0000J[\u0001\u0000\u0000\u0000KL\u0003\u0010\b\u0000LM\u0003"+
		"\n\u0005\u0000M[\u0001\u0000\u0000\u0000NO\u0003\u0012\t\u0000OP\u0003"+
		"\n\u0005\u0000P[\u0001\u0000\u0000\u0000QR\u0003\u0014\n\u0000RS\u0003"+
		"\n\u0005\u0000S[\u0001\u0000\u0000\u0000TU\u0003\u0016\u000b\u0000UV\u0003"+
		"\n\u0005\u0000V[\u0001\u0000\u0000\u0000WX\u0003\u0018\f\u0000XY\u0003"+
		"\n\u0005\u0000Y[\u0001\u0000\u0000\u0000ZE\u0001\u0000\u0000\u0000ZH\u0001"+
		"\u0000\u0000\u0000ZK\u0001\u0000\u0000\u0000ZN\u0001\u0000\u0000\u0000"+
		"ZQ\u0001\u0000\u0000\u0000ZT\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000"+
		"\u0000[\t\u0001\u0000\u0000\u0000\\^\u0005\r\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bc\u0005\f\u0000\u0000c\u000b\u0001\u0000\u0000\u0000df\u0005\u0002\u0000"+
		"\u0000eg\u0005\r\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jk\u0005\u000b\u0000\u0000k\r\u0001\u0000\u0000\u0000ln\u0005"+
		"\u0001\u0000\u0000mo\u0005\r\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rt\u0005\u000b\u0000\u0000su\u0005\r\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0003\u001a"+
		"\r\u0000y\u000f\u0001\u0000\u0000\u0000z|\u0005\t\u0000\u0000{}\u0005"+
		"\r\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0082\u0005\u000b\u0000\u0000\u0081\u0083\u0005\r\u0000"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u001a\r\u0000"+
		"\u0087\u0011\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u0006\u0000\u0000"+
		"\u0089\u008b\u0005\r\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u0090\u0005\u000b\u0000\u0000\u008f\u0091\u0005\r\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u001a\r\u0000\u0095\u0013\u0001"+
		"\u0000\u0000\u0000\u0096\u0098\u0005\u0007\u0000\u0000\u0097\u0099\u0005"+
		"\r\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u000b"+
		"\u0000\u0000\u009d\u009f\u0005\r\u0000\u0000\u009e\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0003\u001a\r\u0000\u00a3\u0015\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u0005\u0003\u0000\u0000\u00a5\u00a7\u0005\r\u0000\u0000\u00a6"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005\u000b\u0000\u0000\u00ab"+
		"\u00ad\u0005\r\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0003\u001a\r\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005"+
		"\b\u0000\u0000\u00b3\u00b5\u0005\r\u0000\u0000\u00b4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\u000b\u0000\u0000\u00b9\u0019\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bd\u0003\u001c\u000e\u0000\u00bb\u00bd\u0003\u001e"+
		"\u000f\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u001b\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u000b"+
		"\u0000\u0000\u00bf\u001d\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\n\u0000"+
		"\u0000\u00c1\u001f\u0001\u0000\u0000\u0000\u0014#,5>CZ_hpv~\u0084\u008c"+
		"\u0092\u009a\u00a0\u00a8\u00ae\u00b6\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}