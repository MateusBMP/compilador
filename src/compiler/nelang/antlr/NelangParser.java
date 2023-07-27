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
		ASSIGN=1, GOTO=2, DECLARE=3, DIVIDE=4, ELSE=5, END=6, EXPECT=7, EXPORT=8, 
		FI=9, IF=10, INIT=11, MINUS=12, MULTIPLY=13, PRINT=14, SUM=15, WHILE=16, 
		OPERATOR=17, INTEGER=18, IDENTIFIER=19, NEWLINE=20, SPACE=21;
	public static final int
		RULE_nelang = 0, RULE_label = 1, RULE_initLabel = 2, RULE_endLabel = 3, 
		RULE_statement = 4, RULE_endLine = 5, RULE_declaration = 6, RULE_expect = 7, 
		RULE_export = 8, RULE_assignment = 9, RULE_sum = 10, RULE_minus = 11, 
		RULE_multiply = 12, RULE_divide = 13, RULE_print = 14, RULE_goto = 15, 
		RULE_if = 16, RULE_else = 17, RULE_while = 18, RULE_compare = 19, RULE_valuePosition = 20, 
		RULE_identifierAsValue = 21, RULE_integerAsValue = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"nelang", "label", "initLabel", "endLabel", "statement", "endLine", "declaration", 
			"expect", "export", "assignment", "sum", "minus", "multiply", "divide", 
			"print", "goto", "if", "else", "while", "compare", "valuePosition", "identifierAsValue", 
			"integerAsValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ASSIGN'", "'GOTO'", "'DECLARE'", "'DIVIDE'", "'ELSE'", "'END'", 
			"'EXPECT'", "'EXPORT'", "'FI'", "'IF'", "'INIT'", "'MINUS'", "'MULTIPLY'", 
			"'PRINT'", "'SUM'", "'WHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "GOTO", "DECLARE", "DIVIDE", "ELSE", "END", "EXPECT", 
			"EXPORT", "FI", "IF", "INIT", "MINUS", "MULTIPLY", "PRINT", "SUM", "WHILE", 
			"OPERATOR", "INTEGER", "IDENTIFIER", "NEWLINE", "SPACE"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INIT || _la==SPACE) {
				{
				{
				setState(46);
				label();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(54);
				match(SPACE);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			initLabel();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2225566L) != 0)) {
				{
				{
				setState(61);
				statement();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public List<EndLineContext> endLine() {
			return getRuleContexts(EndLineContext.class);
		}
		public EndLineContext endLine(int i) {
			return getRuleContext(EndLineContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(INIT);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				match(SPACE);
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(75);
			match(IDENTIFIER);
			setState(77); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(76);
					endLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode EOF() { return getToken(NelangParser.EOF, 0); }
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public List<EndLineContext> endLine() {
			return getRuleContexts(EndLineContext.class);
		}
		public EndLineContext endLine(int i) {
			return getRuleContext(EndLineContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(END);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				match(SPACE);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(87);
			match(IDENTIFIER);
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
			case SPACE:
				{
				setState(89); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(88);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(91); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(93);
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
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public List<EndLineContext> endLine() {
			return getRuleContexts(EndLineContext.class);
		}
		public EndLineContext endLine(int i) {
			return getRuleContext(EndLineContext.class,i);
		}
		public ExpectContext expect() {
			return getRuleContext(ExpectContext.class,0);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
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
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
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
		int _la;
		try {
			int _alt;
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(96);
					match(SPACE);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				declaration();
				setState(104); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(103);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(106); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(108);
					match(SPACE);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				expect();
				setState(116); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(115);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(118); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(120);
					match(SPACE);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				export();
				setState(128); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(127);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(130); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(132);
					match(SPACE);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				assignment();
				setState(140); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(139);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(142); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(144);
					match(SPACE);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				sum();
				setState(152); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(151);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(154); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(156);
					match(SPACE);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				minus();
				setState(164); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(163);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(166); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(168);
					match(SPACE);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				multiply();
				setState(176); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(175);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(178); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(180);
					match(SPACE);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				divide();
				setState(188); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(187);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(190); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(192);
					match(SPACE);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				print();
				setState(200); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(199);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(202); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(204);
					match(SPACE);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				goto_();
				setState(212); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(211);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(214); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(216);
					match(SPACE);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				if_();
				setState(224); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(223);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(226); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(228);
					match(SPACE);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				while_();
				setState(236); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(235);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(238); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(242);
				match(SPACE);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(NelangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NelangParser.IDENTIFIER, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(DECLARE);
			setState(257); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(251);
						match(SPACE);
						}
						}
						setState(254); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE );
					setState(256);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(259); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ExpectContext extends ParserRuleContext {
		public TerminalNode EXPECT() { return getToken(NelangParser.EXPECT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(NelangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NelangParser.IDENTIFIER, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public ExpectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterExpect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitExpect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitExpect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpectContext expect() throws RecognitionException {
		ExpectContext _localctx = new ExpectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expect);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(EXPECT);
			setState(268); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(263); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(262);
						match(SPACE);
						}
						}
						setState(265); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE );
					setState(267);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(270); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(NelangParser.EXPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(NelangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NelangParser.IDENTIFIER, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(NelangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NelangParser.SPACE, i);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_export);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(EXPORT);
			setState(279); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(273);
						match(SPACE);
						}
						}
						setState(276); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE );
					setState(278);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(281); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 18, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ASSIGN);
			setState(285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(284);
				match(SPACE);
				}
				}
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(289);
			match(IDENTIFIER);
			setState(291); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				match(SPACE);
				}
				}
				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(295);
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
		enterRule(_localctx, 20, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(SUM);
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(298);
				match(SPACE);
				}
				}
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(303);
			match(IDENTIFIER);
			setState(305); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(304);
				match(SPACE);
				}
				}
				setState(307); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(309);
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
		enterRule(_localctx, 22, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(MINUS);
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				match(SPACE);
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(317);
			match(IDENTIFIER);
			setState(319); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(318);
				match(SPACE);
				}
				}
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(323);
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
		enterRule(_localctx, 24, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(MULTIPLY);
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				match(SPACE);
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(331);
			match(IDENTIFIER);
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				match(SPACE);
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(337);
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
		enterRule(_localctx, 26, RULE_divide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(DIVIDE);
			setState(341); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				match(SPACE);
				}
				}
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(345);
			match(IDENTIFIER);
			setState(347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(346);
				match(SPACE);
				}
				}
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(351);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(NelangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NelangParser.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 28, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(PRINT);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(354);
						match(SPACE);
						}
						}
						setState(357); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE );
					setState(359);
					match(IDENTIFIER);
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 30, RULE_goto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(GOTO);
			setState(367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(366);
				match(SPACE);
				}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(371);
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
		enterRule(_localctx, 32, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(IF);
			setState(375); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(374);
				match(SPACE);
				}
				}
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(379);
			compare();
			setState(381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(380);
				match(SPACE);
				}
				}
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(385);
			goto_();
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(386);
					match(SPACE);
					}
					}
					setState(389); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(391);
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
		enterRule(_localctx, 34, RULE_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(ELSE);
			setState(396); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(395);
				match(SPACE);
				}
				}
				setState(398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(400);
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(NelangParser.WHILE, 0); }
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
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NelangListener ) ((NelangListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NelangVisitor ) return ((NelangVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(WHILE);
			setState(404); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(403);
				match(SPACE);
				}
				}
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(408);
			compare();
			setState(410); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(409);
				match(SPACE);
				}
				}
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(414);
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
		enterRule(_localctx, 38, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			valuePosition();
			setState(418); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(417);
				match(SPACE);
				}
				}
				setState(420); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(422);
			match(OPERATOR);
			setState(424); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(423);
				match(SPACE);
				}
				}
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(428);
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
		enterRule(_localctx, 40, RULE_valuePosition);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				identifierAsValue();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
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
		enterRule(_localctx, 42, RULE_identifierAsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		enterRule(_localctx, 44, RULE_integerAsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
		"\u0004\u0001\u0015\u01b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000"+
		"\f\u00003\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u00018\b\u0001"+
		"\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001?\b\u0001"+
		"\n\u0001\f\u0001B\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0004\u0002H\b\u0002\u000b\u0002\f\u0002I\u0001\u0002\u0001\u0002\u0004"+
		"\u0002N\b\u0002\u000b\u0002\f\u0002O\u0001\u0003\u0001\u0003\u0004\u0003"+
		"T\b\u0003\u000b\u0003\f\u0003U\u0001\u0003\u0001\u0003\u0004\u0003Z\b"+
		"\u0003\u000b\u0003\f\u0003[\u0001\u0003\u0003\u0003_\b\u0003\u0001\u0004"+
		"\u0005\u0004b\b\u0004\n\u0004\f\u0004e\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004i\b\u0004\u000b\u0004\f\u0004j\u0001\u0004\u0005\u0004n\b"+
		"\u0004\n\u0004\f\u0004q\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004u\b"+
		"\u0004\u000b\u0004\f\u0004v\u0001\u0004\u0005\u0004z\b\u0004\n\u0004\f"+
		"\u0004}\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0081\b\u0004\u000b"+
		"\u0004\f\u0004\u0082\u0001\u0004\u0005\u0004\u0086\b\u0004\n\u0004\f\u0004"+
		"\u0089\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u008d\b\u0004\u000b"+
		"\u0004\f\u0004\u008e\u0001\u0004\u0005\u0004\u0092\b\u0004\n\u0004\f\u0004"+
		"\u0095\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0099\b\u0004\u000b"+
		"\u0004\f\u0004\u009a\u0001\u0004\u0005\u0004\u009e\b\u0004\n\u0004\f\u0004"+
		"\u00a1\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00a5\b\u0004\u000b"+
		"\u0004\f\u0004\u00a6\u0001\u0004\u0005\u0004\u00aa\b\u0004\n\u0004\f\u0004"+
		"\u00ad\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00b1\b\u0004\u000b"+
		"\u0004\f\u0004\u00b2\u0001\u0004\u0005\u0004\u00b6\b\u0004\n\u0004\f\u0004"+
		"\u00b9\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00bd\b\u0004\u000b"+
		"\u0004\f\u0004\u00be\u0001\u0004\u0005\u0004\u00c2\b\u0004\n\u0004\f\u0004"+
		"\u00c5\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00c9\b\u0004\u000b"+
		"\u0004\f\u0004\u00ca\u0001\u0004\u0005\u0004\u00ce\b\u0004\n\u0004\f\u0004"+
		"\u00d1\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00d5\b\u0004\u000b"+
		"\u0004\f\u0004\u00d6\u0001\u0004\u0005\u0004\u00da\b\u0004\n\u0004\f\u0004"+
		"\u00dd\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00e1\b\u0004\u000b"+
		"\u0004\f\u0004\u00e2\u0001\u0004\u0005\u0004\u00e6\b\u0004\n\u0004\f\u0004"+
		"\u00e9\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00ed\b\u0004\u000b"+
		"\u0004\f\u0004\u00ee\u0003\u0004\u00f1\b\u0004\u0001\u0005\u0005\u0005"+
		"\u00f4\b\u0005\n\u0005\f\u0005\u00f7\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0004\u0006\u00fd\b\u0006\u000b\u0006\f\u0006\u00fe"+
		"\u0001\u0006\u0004\u0006\u0102\b\u0006\u000b\u0006\f\u0006\u0103\u0001"+
		"\u0007\u0001\u0007\u0004\u0007\u0108\b\u0007\u000b\u0007\f\u0007\u0109"+
		"\u0001\u0007\u0004\u0007\u010d\b\u0007\u000b\u0007\f\u0007\u010e\u0001"+
		"\b\u0001\b\u0004\b\u0113\b\b\u000b\b\f\b\u0114\u0001\b\u0004\b\u0118\b"+
		"\b\u000b\b\f\b\u0119\u0001\t\u0001\t\u0004\t\u011e\b\t\u000b\t\f\t\u011f"+
		"\u0001\t\u0001\t\u0004\t\u0124\b\t\u000b\t\f\t\u0125\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0004\n\u012c\b\n\u000b\n\f\n\u012d\u0001\n\u0001\n\u0004\n"+
		"\u0132\b\n\u000b\n\f\n\u0133\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u013a\b\u000b\u000b\u000b\f\u000b\u013b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u0140\b\u000b\u000b\u000b\f\u000b\u0141\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0004\f\u0148\b\f\u000b\f\f\f\u0149\u0001\f\u0001"+
		"\f\u0004\f\u014e\b\f\u000b\f\f\f\u014f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0004\r\u0156\b\r\u000b\r\f\r\u0157\u0001\r\u0001\r\u0004\r\u015c\b\r"+
		"\u000b\r\f\r\u015d\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u0164\b\u000e\u000b\u000e\f\u000e\u0165\u0001\u000e\u0005\u000e\u0169"+
		"\b\u000e\n\u000e\f\u000e\u016c\t\u000e\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u0170\b\u000f\u000b\u000f\f\u000f\u0171\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u0178\b\u0010\u000b\u0010\f\u0010\u0179"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u017e\b\u0010\u000b\u0010\f\u0010"+
		"\u017f\u0001\u0010\u0001\u0010\u0004\u0010\u0184\b\u0010\u000b\u0010\f"+
		"\u0010\u0185\u0001\u0010\u0003\u0010\u0189\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0004\u0011\u018d\b\u0011\u000b\u0011\f\u0011\u018e\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0004\u0012\u0195\b\u0012\u000b\u0012\f"+
		"\u0012\u0196\u0001\u0012\u0001\u0012\u0004\u0012\u019b\b\u0012\u000b\u0012"+
		"\f\u0012\u019c\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0004\u0013"+
		"\u01a3\b\u0013\u000b\u0013\f\u0013\u01a4\u0001\u0013\u0001\u0013\u0004"+
		"\u0013\u01a9\b\u0013\u000b\u0013\f\u0013\u01aa\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u01b1\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,\u0000\u0000\u01e8\u00001\u0001\u0000\u0000\u0000\u00029\u0001\u0000"+
		"\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000"+
		"\b\u00f0\u0001\u0000\u0000\u0000\n\u00f5\u0001\u0000\u0000\u0000\f\u00fa"+
		"\u0001\u0000\u0000\u0000\u000e\u0105\u0001\u0000\u0000\u0000\u0010\u0110"+
		"\u0001\u0000\u0000\u0000\u0012\u011b\u0001\u0000\u0000\u0000\u0014\u0129"+
		"\u0001\u0000\u0000\u0000\u0016\u0137\u0001\u0000\u0000\u0000\u0018\u0145"+
		"\u0001\u0000\u0000\u0000\u001a\u0153\u0001\u0000\u0000\u0000\u001c\u0161"+
		"\u0001\u0000\u0000\u0000\u001e\u016d\u0001\u0000\u0000\u0000 \u0175\u0001"+
		"\u0000\u0000\u0000\"\u018a\u0001\u0000\u0000\u0000$\u0192\u0001\u0000"+
		"\u0000\u0000&\u01a0\u0001\u0000\u0000\u0000(\u01b0\u0001\u0000\u0000\u0000"+
		"*\u01b2\u0001\u0000\u0000\u0000,\u01b4\u0001\u0000\u0000\u0000.0\u0003"+
		"\u0002\u0001\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000045\u0005\u0000\u0000\u00015\u0001\u0001"+
		"\u0000\u0000\u000068\u0005\u0015\u0000\u000076\u0001\u0000\u0000\u0000"+
		"8;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<@\u0003\u0004"+
		"\u0002\u0000=?\u0003\b\u0004\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0003\u0006\u0003\u0000"+
		"D\u0003\u0001\u0000\u0000\u0000EG\u0005\u000b\u0000\u0000FH\u0005\u0015"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KM\u0005\u0013\u0000\u0000LN\u0003\n\u0005\u0000ML\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000P\u0005\u0001\u0000\u0000\u0000QS\u0005\u0006\u0000\u0000RT\u0005"+
		"\u0015\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000W^\u0005\u0013\u0000\u0000XZ\u0003\n\u0005\u0000YX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\_\u0001\u0000\u0000\u0000]_\u0005\u0000\u0000\u0001^Y\u0001"+
		"\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u0007\u0001\u0000\u0000"+
		"\u0000`b\u0005\u0015\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fh\u0003\f\u0006\u0000gi\u0003"+
		"\n\u0005\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u00f1\u0001\u0000\u0000"+
		"\u0000ln\u0005\u0015\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0003\u000e\u0007\u0000"+
		"su\u0003\n\u0005\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u00f1\u0001\u0000"+
		"\u0000\u0000xz\u0005\u0015\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0080\u0003\u0010"+
		"\b\u0000\u007f\u0081\u0003\n\u0005\u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u00f1\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0005\u0015\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008c\u0003\u0012\t\u0000"+
		"\u008b\u008d\u0003\n\u0005\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u00f1\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0005\u0015\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0096\u0098\u0003\u0014\n\u0000\u0097\u0099"+
		"\u0003\n\u0005\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u00f1\u0001\u0000\u0000\u0000\u009c\u009e\u0005"+
		"\u0015\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0003\u0016\u000b\u0000\u00a3\u00a5\u0003"+
		"\n\u0005\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00f1\u0001\u0000\u0000\u0000\u00a8\u00aa\u0005\u0015"+
		"\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b0\u0003\u0018\f\u0000\u00af\u00b1\u0003\n\u0005"+
		"\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00f1\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005\u0015\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0003\u001a\r\u0000\u00bb\u00bd\u0003\n\u0005\u0000"+
		"\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00f1\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005\u0015\u0000\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c8\u0003\u001c\u000e\u0000\u00c7\u00c9\u0003\n\u0005\u0000\u00c8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00f1\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\u0015\u0000\u0000\u00cd"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d4\u0003\u001e\u000f\u0000\u00d3\u00d5\u0003\n\u0005\u0000\u00d4\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00f1"+
		"\u0001\u0000\u0000\u0000\u00d8\u00da\u0005\u0015\u0000\u0000\u00d9\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0003 \u0010\u0000\u00df\u00e1\u0003\n\u0005\u0000\u00e0\u00df\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e6\u0005\u0015\u0000\u0000\u00e5\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003"+
		"$\u0012\u0000\u00eb\u00ed\u0003\n\u0005\u0000\u00ec\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f0c\u0001\u0000\u0000\u0000\u00f0o\u0001\u0000\u0000\u0000"+
		"\u00f0{\u0001\u0000\u0000\u0000\u00f0\u0087\u0001\u0000\u0000\u0000\u00f0"+
		"\u0093\u0001\u0000\u0000\u0000\u00f0\u009f\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ab\u0001\u0000\u0000\u0000\u00f0\u00b7\u0001\u0000\u0000\u0000\u00f0"+
		"\u00c3\u0001\u0000\u0000\u0000\u00f0\u00cf\u0001\u0000\u0000\u0000\u00f0"+
		"\u00db\u0001\u0000\u0000\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f1"+
		"\t\u0001\u0000\u0000\u0000\u00f2\u00f4\u0005\u0015\u0000\u0000\u00f3\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0005\u0014\u0000\u0000\u00f9\u000b\u0001\u0000\u0000\u0000\u00fa\u0101"+
		"\u0005\u0003\u0000\u0000\u00fb\u00fd\u0005\u0015\u0000\u0000\u00fc\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0102\u0005\u0013\u0000\u0000\u0101\u00fc"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0101"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\r\u0001"+
		"\u0000\u0000\u0000\u0105\u010c\u0005\u0007\u0000\u0000\u0106\u0108\u0005"+
		"\u0015\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0005"+
		"\u0013\u0000\u0000\u010c\u0107\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u000f\u0001\u0000\u0000\u0000\u0110\u0117\u0005"+
		"\b\u0000\u0000\u0111\u0113\u0005\u0015\u0000\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0118\u0005\u0013\u0000\u0000\u0117\u0112\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u0011\u0001\u0000"+
		"\u0000\u0000\u011b\u011d\u0005\u0001\u0000\u0000\u011c\u011e\u0005\u0015"+
		"\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0005\u0013"+
		"\u0000\u0000\u0122\u0124\u0005\u0015\u0000\u0000\u0123\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0003(\u0014\u0000\u0128\u0013\u0001\u0000\u0000"+
		"\u0000\u0129\u012b\u0005\u000f\u0000\u0000\u012a\u012c\u0005\u0015\u0000"+
		"\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0005\u0013\u0000"+
		"\u0000\u0130\u0132\u0005\u0015\u0000\u0000\u0131\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0003(\u0014\u0000\u0136\u0015\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u0005\f\u0000\u0000\u0138\u013a\u0005\u0015\u0000\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0005\u0013\u0000\u0000\u013e"+
		"\u0140\u0005\u0015\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0003(\u0014\u0000\u0144\u0017\u0001\u0000\u0000\u0000\u0145\u0147"+
		"\u0005\r\u0000\u0000\u0146\u0148\u0005\u0015\u0000\u0000\u0147\u0146\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b\u014d\u0005\u0013\u0000\u0000\u014c\u014e\u0005"+
		"\u0015\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0003"+
		"(\u0014\u0000\u0152\u0019\u0001\u0000\u0000\u0000\u0153\u0155\u0005\u0004"+
		"\u0000\u0000\u0154\u0156\u0005\u0015\u0000\u0000\u0155\u0154\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000"+
		"\u0000\u0000\u0159\u015b\u0005\u0013\u0000\u0000\u015a\u015c\u0005\u0015"+
		"\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0003(\u0014"+
		"\u0000\u0160\u001b\u0001\u0000\u0000\u0000\u0161\u016a\u0005\u000e\u0000"+
		"\u0000\u0162\u0164\u0005\u0015\u0000\u0000\u0163\u0162\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0169\u0005\u0013\u0000\u0000\u0168\u0163\u0001\u0000\u0000"+
		"\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u001d\u0001\u0000\u0000"+
		"\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u016f\u0005\u0002\u0000"+
		"\u0000\u016e\u0170\u0005\u0015\u0000\u0000\u016f\u016e\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0005\u0013\u0000\u0000\u0174\u001f\u0001\u0000\u0000"+
		"\u0000\u0175\u0177\u0005\n\u0000\u0000\u0176\u0178\u0005\u0015\u0000\u0000"+
		"\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000"+
		"\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017d\u0003&\u0013\u0000\u017c"+
		"\u017e\u0005\u0015\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
		"\u0188\u0003\u001e\u000f\u0000\u0182\u0184\u0005\u0015\u0000\u0000\u0183"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\u0189\u0003\"\u0011\u0000\u0188\u0183"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189!\u0001"+
		"\u0000\u0000\u0000\u018a\u018c\u0005\u0005\u0000\u0000\u018b\u018d\u0005"+
		"\u0015\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001"+
		"\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0003"+
		"\u001e\u000f\u0000\u0191#\u0001\u0000\u0000\u0000\u0192\u0194\u0005\u0010"+
		"\u0000\u0000\u0193\u0195\u0005\u0015\u0000\u0000\u0194\u0193\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198\u019a\u0003&\u0013\u0000\u0199\u019b\u0005\u0015\u0000"+
		"\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000"+
		"\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0003\u001e\u000f"+
		"\u0000\u019f%\u0001\u0000\u0000\u0000\u01a0\u01a2\u0003(\u0014\u0000\u01a1"+
		"\u01a3\u0005\u0015\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a8\u0005\u0011\u0000\u0000\u01a7\u01a9\u0005\u0015\u0000\u0000\u01a8"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0003(\u0014\u0000\u01ad\'"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b1\u0003*\u0015\u0000\u01af\u01b1\u0003"+
		",\u0016\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000"+
		"\u0000\u0000\u01b1)\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\u0013\u0000"+
		"\u0000\u01b3+\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\u0012\u0000\u0000"+
		"\u01b5-\u0001\u0000\u0000\u0000?19@IOU[^cjov{\u0082\u0087\u008e\u0093"+
		"\u009a\u009f\u00a6\u00ab\u00b2\u00b7\u00be\u00c3\u00ca\u00cf\u00d6\u00db"+
		"\u00e2\u00e7\u00ee\u00f0\u00f5\u00fe\u0103\u0109\u010e\u0114\u0119\u011f"+
		"\u0125\u012d\u0133\u013b\u0141\u0149\u014f\u0157\u015d\u0165\u016a\u0171"+
		"\u0179\u017f\u0185\u0188\u018e\u0196\u019c\u01a4\u01aa\u01b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}