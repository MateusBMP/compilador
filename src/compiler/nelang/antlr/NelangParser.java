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
		ASSIGN=1, GOTO=2, DECLARE=3, DIVIDE=4, ELSE=5, END=6, FI=7, IF=8, INIT=9, 
		MINUS=10, MULTIPLY=11, PRINT=12, SUM=13, OPERATOR=14, INTEGER=15, IDENTIFIER=16, 
		NEWLINE=17, SPACE=18;
	public static final int
		RULE_nelang = 0, RULE_label = 1, RULE_initLabel = 2, RULE_endLabel = 3, 
		RULE_statement = 4, RULE_endLine = 5, RULE_declaration = 6, RULE_assignment = 7, 
		RULE_sum = 8, RULE_minus = 9, RULE_multiply = 10, RULE_divide = 11, RULE_print = 12, 
		RULE_goto = 13, RULE_if = 14, RULE_else = 15, RULE_compare = 16, RULE_valuePosition = 17, 
		RULE_identifierAsValue = 18, RULE_integerAsValue = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"nelang", "label", "initLabel", "endLabel", "statement", "endLine", "declaration", 
			"assignment", "sum", "minus", "multiply", "divide", "print", "goto", 
			"if", "else", "compare", "valuePosition", "identifierAsValue", "integerAsValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ASSIGN'", "'GOTO'", "'DECLARE'", "'DIVIDE'", "'ELSE'", "'END'", 
			"'FI'", "'IF'", "'INIT'", "'MINUS'", "'MULTIPLY'", "'PRINT'", "'SUM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "GOTO", "DECLARE", "DIVIDE", "ELSE", "END", "FI", "IF", 
			"INIT", "MINUS", "MULTIPLY", "PRINT", "SUM", "OPERATOR", "INTEGER", "IDENTIFIER", 
			"NEWLINE", "SPACE"
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INIT) {
				{
				{
				setState(40);
				label();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
			setState(48);
			initLabel();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15646L) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
			setState(57);
			match(INIT);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				match(SPACE);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(63);
			match(IDENTIFIER);
			setState(64);
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
			setState(66);
			match(END);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				match(SPACE);
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(72);
			match(IDENTIFIER);
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
			case SPACE:
				{
				setState(73);
				endLine();
				}
				break;
			case EOF:
				{
				setState(74);
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
		public GotoContext goto_() {
			return getRuleContext(GotoContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				declaration();
				setState(78);
				endLine();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				assignment();
				setState(81);
				endLine();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				sum();
				setState(84);
				endLine();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				minus();
				setState(87);
				endLine();
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				multiply();
				setState(90);
				endLine();
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				divide();
				setState(93);
				endLine();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				print();
				setState(96);
				endLine();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				goto_();
				setState(99);
				endLine();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				if_();
				setState(102);
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(106);
				match(SPACE);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
			setState(114);
			match(DECLARE);
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
			setState(122);
			match(ASSIGN);
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
			setState(136);
			match(SUM);
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
			setState(150);
			match(MINUS);
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
			setState(164);
			match(MULTIPLY);
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
			setState(178);
			match(DIVIDE);
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
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				match(SPACE);
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(190);
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
			setState(192);
			match(PRINT);
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				match(SPACE);
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(198);
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
	public static class GotoContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(NelangParser.GOTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NelangParser.IDENTIFIER, 0); }
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public GotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoContext goto_() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_goto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(GOTO);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				match(SPACE);
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(206);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NelangParser.IF, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public GotoContext goto_() {
			return getRuleContext(GotoContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(IF);
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				match(SPACE);
				}
				}
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(214);
			compare();
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				match(SPACE);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(220);
			goto_();
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221);
					match(SPACE);
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(226);
				else_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(NelangParser.ELSE, 0); }
		public GotoContext goto_() {
			return getRuleContext(GotoContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ELSE);
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				match(SPACE);
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(235);
			goto_();
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
	public static class CompareContext extends ParserRuleContext {
		public List<ValuePositionContext> valuePosition() {
			return getRuleContexts(ValuePositionContext.class);
		}
		public ValuePositionContext valuePosition(int i) {
			return getRuleContext(ValuePositionContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(NelangParser.OPERATOR, 0); }
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			valuePosition();
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				match(SPACE);
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(243);
			match(OPERATOR);
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				match(SPACE);
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(249);
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
		enterRule(_localctx, 34, RULE_valuePosition);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				identifierAsValue();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
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
		enterRule(_localctx, 36, RULE_identifierAsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		enterRule(_localctx, 38, RULE_integerAsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		"\u0004\u0001\u0012\u0104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000"+
		"\f\u0000-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005"+
		"\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0004\u0002<\b\u0002\u000b\u0002\f\u0002=\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u0003E\b\u0003"+
		"\u000b\u0003\f\u0003F\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"L\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004i\b\u0004"+
		"\u0001\u0005\u0005\u0005l\b\u0005\n\u0005\f\u0005o\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0004\u0006u\b\u0006\u000b\u0006"+
		"\f\u0006v\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007"+
		"}\b\u0007\u000b\u0007\f\u0007~\u0001\u0007\u0001\u0007\u0004\u0007\u0083"+
		"\b\u0007\u000b\u0007\f\u0007\u0084\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0004\b\u008b\b\b\u000b\b\f\b\u008c\u0001\b\u0001\b\u0004\b\u0091\b"+
		"\b\u000b\b\f\b\u0092\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t\u0099\b\t"+
		"\u000b\t\f\t\u009a\u0001\t\u0001\t\u0004\t\u009f\b\t\u000b\t\f\t\u00a0"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n\u00a7\b\n\u000b\n\f\n\u00a8\u0001"+
		"\n\u0001\n\u0004\n\u00ad\b\n\u000b\n\f\n\u00ae\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u00b5\b\u000b\u000b\u000b\f\u000b\u00b6\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u00bb\b\u000b\u000b\u000b\f\u000b\u00bc"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0004\f\u00c3\b\f\u000b\f\f\f"+
		"\u00c4\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u00cb\b\r\u000b\r\f\r\u00cc"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000e\u00d3\b\u000e\u000b"+
		"\u000e\f\u000e\u00d4\u0001\u000e\u0001\u000e\u0004\u000e\u00d9\b\u000e"+
		"\u000b\u000e\f\u000e\u00da\u0001\u000e\u0001\u000e\u0004\u000e\u00df\b"+
		"\u000e\u000b\u000e\f\u000e\u00e0\u0001\u000e\u0003\u000e\u00e4\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u00e8\b\u000f\u000b\u000f\f\u000f"+
		"\u00e9\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004\u0010\u00f0"+
		"\b\u0010\u000b\u0010\f\u0010\u00f1\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u00f6\b\u0010\u000b\u0010\f\u0010\u00f7\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00fe\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000"+
		"\u0000\u0112\u0000+\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000"+
		"\u00049\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bh\u0001"+
		"\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000"+
		"\u000ez\u0001\u0000\u0000\u0000\u0010\u0088\u0001\u0000\u0000\u0000\u0012"+
		"\u0096\u0001\u0000\u0000\u0000\u0014\u00a4\u0001\u0000\u0000\u0000\u0016"+
		"\u00b2\u0001\u0000\u0000\u0000\u0018\u00c0\u0001\u0000\u0000\u0000\u001a"+
		"\u00c8\u0001\u0000\u0000\u0000\u001c\u00d0\u0001\u0000\u0000\u0000\u001e"+
		"\u00e5\u0001\u0000\u0000\u0000 \u00ed\u0001\u0000\u0000\u0000\"\u00fd"+
		"\u0001\u0000\u0000\u0000$\u00ff\u0001\u0000\u0000\u0000&\u0101\u0001\u0000"+
		"\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*-\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0000\u0000"+
		"\u0001/\u0001\u0001\u0000\u0000\u000004\u0003\u0004\u0002\u000013\u0003"+
		"\b\u0004\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000078\u0003\u0006\u0003\u00008\u0003\u0001\u0000"+
		"\u0000\u00009;\u0005\t\u0000\u0000:<\u0005\u0012\u0000\u0000;:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005\u0010\u0000\u0000"+
		"@A\u0003\n\u0005\u0000A\u0005\u0001\u0000\u0000\u0000BD\u0005\u0006\u0000"+
		"\u0000CE\u0005\u0012\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HK\u0005\u0010\u0000\u0000IL\u0003\n\u0005\u0000JL\u0005"+
		"\u0000\u0000\u0001KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"L\u0007\u0001\u0000\u0000\u0000MN\u0003\f\u0006\u0000NO\u0003\n\u0005"+
		"\u0000Oi\u0001\u0000\u0000\u0000PQ\u0003\u000e\u0007\u0000QR\u0003\n\u0005"+
		"\u0000Ri\u0001\u0000\u0000\u0000ST\u0003\u0010\b\u0000TU\u0003\n\u0005"+
		"\u0000Ui\u0001\u0000\u0000\u0000VW\u0003\u0012\t\u0000WX\u0003\n\u0005"+
		"\u0000Xi\u0001\u0000\u0000\u0000YZ\u0003\u0014\n\u0000Z[\u0003\n\u0005"+
		"\u0000[i\u0001\u0000\u0000\u0000\\]\u0003\u0016\u000b\u0000]^\u0003\n"+
		"\u0005\u0000^i\u0001\u0000\u0000\u0000_`\u0003\u0018\f\u0000`a\u0003\n"+
		"\u0005\u0000ai\u0001\u0000\u0000\u0000bc\u0003\u001a\r\u0000cd\u0003\n"+
		"\u0005\u0000di\u0001\u0000\u0000\u0000ef\u0003\u001c\u000e\u0000fg\u0003"+
		"\n\u0005\u0000gi\u0001\u0000\u0000\u0000hM\u0001\u0000\u0000\u0000hP\u0001"+
		"\u0000\u0000\u0000hS\u0001\u0000\u0000\u0000hV\u0001\u0000\u0000\u0000"+
		"hY\u0001\u0000\u0000\u0000h\\\u0001\u0000\u0000\u0000h_\u0001\u0000\u0000"+
		"\u0000hb\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000i\t\u0001\u0000"+
		"\u0000\u0000jl\u0005\u0012\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0011\u0000"+
		"\u0000q\u000b\u0001\u0000\u0000\u0000rt\u0005\u0003\u0000\u0000su\u0005"+
		"\u0012\u0000\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0005\u0010\u0000\u0000y\r\u0001\u0000\u0000\u0000z|\u0005\u0001"+
		"\u0000\u0000{}\u0005\u0012\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0005\u0010\u0000"+
		"\u0000\u0081\u0083\u0005\u0012\u0000\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0003\"\u0011\u0000\u0087\u000f\u0001\u0000\u0000\u0000"+
		"\u0088\u008a\u0005\r\u0000\u0000\u0089\u008b\u0005\u0012\u0000\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0005\u0010\u0000\u0000\u008f"+
		"\u0091\u0005\u0012\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0003\"\u0011\u0000\u0095\u0011\u0001\u0000\u0000\u0000\u0096\u0098"+
		"\u0005\n\u0000\u0000\u0097\u0099\u0005\u0012\u0000\u0000\u0098\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0005\u0010\u0000\u0000\u009d\u009f\u0005"+
		"\u0012\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003"+
		"\"\u0011\u0000\u00a3\u0013\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005\u000b"+
		"\u0000\u0000\u00a5\u00a7\u0005\u0012\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ac\u0005\u0010\u0000\u0000\u00ab\u00ad\u0005\u0012"+
		"\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\"\u0011"+
		"\u0000\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005\u0004\u0000"+
		"\u0000\u00b3\u00b5\u0005\u0012\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0005\u0010\u0000\u0000\u00b9\u00bb\u0005\u0012\u0000"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0003\"\u0011\u0000"+
		"\u00bf\u0017\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005\f\u0000\u0000\u00c1"+
		"\u00c3\u0005\u0012\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0005\u0010\u0000\u0000\u00c7\u0019\u0001\u0000\u0000\u0000\u00c8"+
		"\u00ca\u0005\u0002\u0000\u0000\u00c9\u00cb\u0005\u0012\u0000\u0000\u00ca"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0010\u0000\u0000\u00cf"+
		"\u001b\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005\b\u0000\u0000\u00d1\u00d3"+
		"\u0005\u0012\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8"+
		"\u0003 \u0010\u0000\u00d7\u00d9\u0005\u0012\u0000\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00e3\u0003\u001a\r\u0000\u00dd\u00df\u0005\u0012"+
		"\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003\u001e"+
		"\u000f\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u001d\u0001\u0000\u0000\u0000\u00e5\u00e7\u0005\u0005"+
		"\u0000\u0000\u00e6\u00e8\u0005\u0012\u0000\u0000\u00e7\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0003\u001a\r\u0000\u00ec\u001f\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ef\u0003\"\u0011\u0000\u00ee\u00f0\u0005\u0012\u0000\u0000"+
		"\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005\u000e\u0000\u0000"+
		"\u00f4\u00f6\u0005\u0012\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0003\"\u0011\u0000\u00fa!\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fe\u0003$\u0012\u0000\u00fc\u00fe\u0003&\u0013\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe#\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005\u0010\u0000\u0000\u0100%\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005\u000f\u0000\u0000\u0102\'\u0001\u0000\u0000\u0000"+
		"\u001c+4=FKhmv~\u0084\u008c\u0092\u009a\u00a0\u00a8\u00ae\u00b6\u00bc"+
		"\u00c4\u00cc\u00d4\u00da\u00e0\u00e3\u00e9\u00f1\u00f7\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}