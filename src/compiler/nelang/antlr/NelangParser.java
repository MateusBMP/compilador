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
		FI=9, IF=10, INIT=11, MINUS=12, MULTIPLY=13, PRINT=14, SUM=15, OPERATOR=16, 
		INTEGER=17, IDENTIFIER=18, NEWLINE=19, SPACE=20;
	public static final int
		RULE_nelang = 0, RULE_label = 1, RULE_initLabel = 2, RULE_endLabel = 3, 
		RULE_statement = 4, RULE_endLine = 5, RULE_declaration = 6, RULE_expect = 7, 
		RULE_export = 8, RULE_assignment = 9, RULE_sum = 10, RULE_minus = 11, 
		RULE_multiply = 12, RULE_divide = 13, RULE_print = 14, RULE_goto = 15, 
		RULE_if = 16, RULE_else = 17, RULE_compare = 18, RULE_valuePosition = 19, 
		RULE_identifierAsValue = 20, RULE_integerAsValue = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"nelang", "label", "initLabel", "endLabel", "statement", "endLine", "declaration", 
			"expect", "export", "assignment", "sum", "minus", "multiply", "divide", 
			"print", "goto", "if", "else", "compare", "valuePosition", "identifierAsValue", 
			"integerAsValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ASSIGN'", "'GOTO'", "'DECLARE'", "'DIVIDE'", "'ELSE'", "'END'", 
			"'EXPECT'", "'EXPORT'", "'FI'", "'IF'", "'INIT'", "'MINUS'", "'MULTIPLY'", 
			"'PRINT'", "'SUM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "GOTO", "DECLARE", "DIVIDE", "ELSE", "END", "EXPECT", 
			"EXPORT", "FI", "IF", "INIT", "MINUS", "MULTIPLY", "PRINT", "SUM", "OPERATOR", 
			"INTEGER", "IDENTIFIER", "NEWLINE", "SPACE"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INIT || _la==SPACE) {
				{
				{
				setState(44);
				label();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(52);
				match(SPACE);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			initLabel();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1111454L) != 0)) {
				{
				{
				setState(59);
				statement();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
			setState(67);
			match(INIT);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				match(SPACE);
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(73);
			match(IDENTIFIER);
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74);
					endLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
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
			setState(79);
			match(END);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				match(SPACE);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(85);
			match(IDENTIFIER);
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
			case SPACE:
				{
				setState(87); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(86);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(89); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(91);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(94);
					match(SPACE);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				declaration();
				setState(102); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(101);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(104); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				expect();
				setState(114); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(113);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(116); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(118);
					match(SPACE);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				export();
				setState(126); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(125);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(128); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(130);
					match(SPACE);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				assignment();
				setState(138); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(137);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(140); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(142);
					match(SPACE);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				sum();
				setState(150); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(149);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(152); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(154);
					match(SPACE);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				minus();
				setState(162); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(161);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(164); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(166);
					match(SPACE);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				multiply();
				setState(174); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(173);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(176); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(178);
					match(SPACE);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				divide();
				setState(186); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(185);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(188); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(190);
					match(SPACE);
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				print();
				setState(198); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(197);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(200); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(202);
					match(SPACE);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				goto_();
				setState(210); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(209);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(212); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(214);
					match(SPACE);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				if_();
				setState(222); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(221);
						endLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(224); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(236);
			match(DECLARE);
			setState(243); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(237);
						match(SPACE);
						}
						}
						setState(240); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE );
					setState(242);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(245); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
			setState(247);
			match(EXPECT);
			setState(254); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(248);
						match(SPACE);
						}
						}
						setState(251); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE );
					setState(253);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(256); 
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
			setState(258);
			match(EXPORT);
			setState(265); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(260); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(259);
						match(SPACE);
						}
						}
						setState(262); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE );
					setState(264);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(267); 
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
			setState(269);
			match(ASSIGN);
			setState(271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(270);
				match(SPACE);
				}
				}
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(275);
			match(IDENTIFIER);
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				match(SPACE);
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(281);
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
			setState(283);
			match(SUM);
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
			setState(297);
			match(MINUS);
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
			setState(311);
			match(MULTIPLY);
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
			setState(325);
			match(DIVIDE);
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
			setState(339);
			match(PRINT);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
			setState(351);
			match(GOTO);
			setState(353); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(352);
				match(SPACE);
				}
				}
				setState(355); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(357);
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
			setState(359);
			match(IF);
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(360);
				match(SPACE);
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(365);
			compare();
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
			goto_();
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(372);
					match(SPACE);
					}
					}
					setState(375); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(377);
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
			setState(380);
			match(ELSE);
			setState(382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(381);
				match(SPACE);
				}
				}
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(386);
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
		enterRule(_localctx, 36, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			valuePosition();
			setState(390); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(389);
				match(SPACE);
				}
				}
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(394);
			match(OPERATOR);
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
		enterRule(_localctx, 38, RULE_valuePosition);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				identifierAsValue();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
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
		enterRule(_localctx, 40, RULE_identifierAsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
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
		enterRule(_localctx, 42, RULE_integerAsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
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
		"\u0004\u0001\u0014\u019b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u00019\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001\n\u0001\f\u0001@\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002F\b"+
		"\u0002\u000b\u0002\f\u0002G\u0001\u0002\u0001\u0002\u0004\u0002L\b\u0002"+
		"\u000b\u0002\f\u0002M\u0001\u0003\u0001\u0003\u0004\u0003R\b\u0003\u000b"+
		"\u0003\f\u0003S\u0001\u0003\u0001\u0003\u0004\u0003X\b\u0003\u000b\u0003"+
		"\f\u0003Y\u0001\u0003\u0003\u0003]\b\u0003\u0001\u0004\u0005\u0004`\b"+
		"\u0004\n\u0004\f\u0004c\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004g\b"+
		"\u0004\u000b\u0004\f\u0004h\u0001\u0004\u0005\u0004l\b\u0004\n\u0004\f"+
		"\u0004o\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004s\b\u0004\u000b\u0004"+
		"\f\u0004t\u0001\u0004\u0005\u0004x\b\u0004\n\u0004\f\u0004{\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u007f\b\u0004\u000b\u0004\f\u0004\u0080"+
		"\u0001\u0004\u0005\u0004\u0084\b\u0004\n\u0004\f\u0004\u0087\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u008b\b\u0004\u000b\u0004\f\u0004\u008c"+
		"\u0001\u0004\u0005\u0004\u0090\b\u0004\n\u0004\f\u0004\u0093\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u0097\b\u0004\u000b\u0004\f\u0004\u0098"+
		"\u0001\u0004\u0005\u0004\u009c\b\u0004\n\u0004\f\u0004\u009f\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u00a3\b\u0004\u000b\u0004\f\u0004\u00a4"+
		"\u0001\u0004\u0005\u0004\u00a8\b\u0004\n\u0004\f\u0004\u00ab\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u00af\b\u0004\u000b\u0004\f\u0004\u00b0"+
		"\u0001\u0004\u0005\u0004\u00b4\b\u0004\n\u0004\f\u0004\u00b7\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u00bb\b\u0004\u000b\u0004\f\u0004\u00bc"+
		"\u0001\u0004\u0005\u0004\u00c0\b\u0004\n\u0004\f\u0004\u00c3\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u00c7\b\u0004\u000b\u0004\f\u0004\u00c8"+
		"\u0001\u0004\u0005\u0004\u00cc\b\u0004\n\u0004\f\u0004\u00cf\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u00d3\b\u0004\u000b\u0004\f\u0004\u00d4"+
		"\u0001\u0004\u0005\u0004\u00d8\b\u0004\n\u0004\f\u0004\u00db\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u00df\b\u0004\u000b\u0004\f\u0004\u00e0"+
		"\u0003\u0004\u00e3\b\u0004\u0001\u0005\u0005\u0005\u00e6\b\u0005\n\u0005"+
		"\f\u0005\u00e9\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0004\u0006\u00ef\b\u0006\u000b\u0006\f\u0006\u00f0\u0001\u0006\u0004"+
		"\u0006\u00f4\b\u0006\u000b\u0006\f\u0006\u00f5\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u00fa\b\u0007\u000b\u0007\f\u0007\u00fb\u0001\u0007\u0004"+
		"\u0007\u00ff\b\u0007\u000b\u0007\f\u0007\u0100\u0001\b\u0001\b\u0004\b"+
		"\u0105\b\b\u000b\b\f\b\u0106\u0001\b\u0004\b\u010a\b\b\u000b\b\f\b\u010b"+
		"\u0001\t\u0001\t\u0004\t\u0110\b\t\u000b\t\f\t\u0111\u0001\t\u0001\t\u0004"+
		"\t\u0116\b\t\u000b\t\f\t\u0117\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n"+
		"\u011e\b\n\u000b\n\f\n\u011f\u0001\n\u0001\n\u0004\n\u0124\b\n\u000b\n"+
		"\f\n\u0125\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0004\u000b\u012c\b"+
		"\u000b\u000b\u000b\f\u000b\u012d\u0001\u000b\u0001\u000b\u0004\u000b\u0132"+
		"\b\u000b\u000b\u000b\f\u000b\u0133\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0004\f\u013a\b\f\u000b\f\f\f\u013b\u0001\f\u0001\f\u0004\f\u0140\b"+
		"\f\u000b\f\f\f\u0141\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u0148\b\r"+
		"\u000b\r\f\r\u0149\u0001\r\u0001\r\u0004\r\u014e\b\r\u000b\r\f\r\u014f"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000e\u0156\b\u000e\u000b"+
		"\u000e\f\u000e\u0157\u0001\u000e\u0005\u000e\u015b\b\u000e\n\u000e\f\u000e"+
		"\u015e\t\u000e\u0001\u000f\u0001\u000f\u0004\u000f\u0162\b\u000f\u000b"+
		"\u000f\f\u000f\u0163\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004"+
		"\u0010\u016a\b\u0010\u000b\u0010\f\u0010\u016b\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u0170\b\u0010\u000b\u0010\f\u0010\u0171\u0001\u0010\u0001"+
		"\u0010\u0004\u0010\u0176\b\u0010\u000b\u0010\f\u0010\u0177\u0001\u0010"+
		"\u0003\u0010\u017b\b\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u017f\b"+
		"\u0011\u000b\u0011\f\u0011\u0180\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0004\u0012\u0187\b\u0012\u000b\u0012\f\u0012\u0188\u0001\u0012"+
		"\u0001\u0012\u0004\u0012\u018d\b\u0012\u000b\u0012\f\u0012\u018e\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0195\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*\u0000\u0000\u01c8\u0000/\u0001\u0000\u0000\u0000\u0002"+
		"7\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006O\u0001"+
		"\u0000\u0000\u0000\b\u00e2\u0001\u0000\u0000\u0000\n\u00e7\u0001\u0000"+
		"\u0000\u0000\f\u00ec\u0001\u0000\u0000\u0000\u000e\u00f7\u0001\u0000\u0000"+
		"\u0000\u0010\u0102\u0001\u0000\u0000\u0000\u0012\u010d\u0001\u0000\u0000"+
		"\u0000\u0014\u011b\u0001\u0000\u0000\u0000\u0016\u0129\u0001\u0000\u0000"+
		"\u0000\u0018\u0137\u0001\u0000\u0000\u0000\u001a\u0145\u0001\u0000\u0000"+
		"\u0000\u001c\u0153\u0001\u0000\u0000\u0000\u001e\u015f\u0001\u0000\u0000"+
		"\u0000 \u0167\u0001\u0000\u0000\u0000\"\u017c\u0001\u0000\u0000\u0000"+
		"$\u0184\u0001\u0000\u0000\u0000&\u0194\u0001\u0000\u0000\u0000(\u0196"+
		"\u0001\u0000\u0000\u0000*\u0198\u0001\u0000\u0000\u0000,.\u0003\u0002"+
		"\u0001\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000023\u0005\u0000\u0000\u00013\u0001\u0001\u0000"+
		"\u0000\u000046\u0005\u0014\u0000\u000054\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:>\u0003\u0004\u0002"+
		"\u0000;=\u0003\b\u0004\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0003\u0006\u0003\u0000B\u0003"+
		"\u0001\u0000\u0000\u0000CE\u0005\u000b\u0000\u0000DF\u0005\u0014\u0000"+
		"\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0005"+
		"\u0012\u0000\u0000JL\u0003\n\u0005\u0000KJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\u0005\u0001\u0000\u0000\u0000OQ\u0005\u0006\u0000\u0000PR\u0005\u0014"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"U\\\u0005\u0012\u0000\u0000VX\u0003\n\u0005\u0000WV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[]\u0005\u0000\u0000\u0001\\W\u0001"+
		"\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0007\u0001\u0000\u0000"+
		"\u0000^`\u0005\u0014\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u0003\f\u0006\u0000eg\u0003"+
		"\n\u0005\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u00e3\u0001\u0000\u0000"+
		"\u0000jl\u0005\u0014\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0003\u000e\u0007\u0000"+
		"qs\u0003\n\u0005\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u00e3\u0001\u0000"+
		"\u0000\u0000vx\u0005\u0014\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0003\u0010\b\u0000"+
		"}\u007f\u0003\n\u0005\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u00e3\u0001\u0000\u0000\u0000\u0082\u0084\u0005\u0014"+
		"\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\u0003\u0012\t\u0000\u0089\u008b\u0003\n\u0005"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u00e3\u0001\u0000\u0000\u0000\u008e\u0090\u0005\u0014\u0000"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0096\u0003\u0014\n\u0000\u0095\u0097\u0003\n\u0005\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u00e3\u0001\u0000\u0000\u0000\u009a\u009c\u0005\u0014\u0000\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0003\u0016\u000b\u0000\u00a1\u00a3\u0003\n\u0005\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0014\u0000\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ae\u0003\u0018\f\u0000\u00ad\u00af\u0003\n\u0005\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00e3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005\u0014\u0000\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00ba"+
		"\u0003\u001a\r\u0000\u00b9\u00bb\u0003\n\u0005\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00e3\u0001"+
		"\u0000\u0000\u0000\u00be\u00c0\u0005\u0014\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c6\u0003"+
		"\u001c\u000e\u0000\u00c5\u00c7\u0003\n\u0005\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00e3\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0005\u0014\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003\u001e"+
		"\u000f\u0000\u00d1\u00d3\u0003\n\u0005\u0000\u00d2\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d8\u0005\u0014\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00de\u0003 \u0010\u0000"+
		"\u00dd\u00df\u0003\n\u0005\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2"+
		"a\u0001\u0000\u0000\u0000\u00e2m\u0001\u0000\u0000\u0000\u00e2y\u0001"+
		"\u0000\u0000\u0000\u00e2\u0085\u0001\u0000\u0000\u0000\u00e2\u0091\u0001"+
		"\u0000\u0000\u0000\u00e2\u009d\u0001\u0000\u0000\u0000\u00e2\u00a9\u0001"+
		"\u0000\u0000\u0000\u00e2\u00b5\u0001\u0000\u0000\u0000\u00e2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00e2\u00cd\u0001\u0000\u0000\u0000\u00e2\u00d9\u0001"+
		"\u0000\u0000\u0000\u00e3\t\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005\u0014"+
		"\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005\u0013\u0000\u0000\u00eb\u000b\u0001\u0000"+
		"\u0000\u0000\u00ec\u00f3\u0005\u0003\u0000\u0000\u00ed\u00ef\u0005\u0014"+
		"\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0005\u0012"+
		"\u0000\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\r\u0001\u0000\u0000\u0000\u00f7\u00fe\u0005\u0007\u0000"+
		"\u0000\u00f8\u00fa\u0005\u0014\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u00ff\u0005\u0012\u0000\u0000\u00fe\u00f9\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u000f\u0001\u0000\u0000"+
		"\u0000\u0102\u0109\u0005\b\u0000\u0000\u0103\u0105\u0005\u0014\u0000\u0000"+
		"\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0005\u0012\u0000\u0000"+
		"\u0109\u0104\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u0011\u0001\u0000\u0000\u0000\u010d\u010f\u0005\u0001\u0000\u0000"+
		"\u010e\u0110\u0005\u0014\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0115\u0005\u0012\u0000\u0000\u0114\u0116\u0005\u0014\u0000\u0000"+
		"\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0003&\u0013\u0000\u011a"+
		"\u0013\u0001\u0000\u0000\u0000\u011b\u011d\u0005\u000f\u0000\u0000\u011c"+
		"\u011e\u0005\u0014\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121"+
		"\u0123\u0005\u0012\u0000\u0000\u0122\u0124\u0005\u0014\u0000\u0000\u0123"+
		"\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0003&\u0013\u0000\u0128\u0015"+
		"\u0001\u0000\u0000\u0000\u0129\u012b\u0005\f\u0000\u0000\u012a\u012c\u0005"+
		"\u0014\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0005"+
		"\u0012\u0000\u0000\u0130\u0132\u0005\u0014\u0000\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0003&\u0013\u0000\u0136\u0017\u0001\u0000"+
		"\u0000\u0000\u0137\u0139\u0005\r\u0000\u0000\u0138\u013a\u0005\u0014\u0000"+
		"\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0005\u0012\u0000"+
		"\u0000\u013e\u0140\u0005\u0014\u0000\u0000\u013f\u013e\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0003&\u0013\u0000\u0144\u0019\u0001\u0000\u0000\u0000"+
		"\u0145\u0147\u0005\u0004\u0000\u0000\u0146\u0148\u0005\u0014\u0000\u0000"+
		"\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d\u0005\u0012\u0000\u0000"+
		"\u014c\u014e\u0005\u0014\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0003&\u0013\u0000\u0152\u001b\u0001\u0000\u0000\u0000\u0153"+
		"\u015c\u0005\u000e\u0000\u0000\u0154\u0156\u0005\u0014\u0000\u0000\u0155"+
		"\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0005\u0012\u0000\u0000\u015a"+
		"\u0155\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c"+
		"\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d"+
		"\u001d\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f"+
		"\u0161\u0005\u0002\u0000\u0000\u0160\u0162\u0005\u0014\u0000\u0000\u0161"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0012\u0000\u0000\u0166"+
		"\u001f\u0001\u0000\u0000\u0000\u0167\u0169\u0005\n\u0000\u0000\u0168\u016a"+
		"\u0005\u0014\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016f"+
		"\u0003$\u0012\u0000\u016e\u0170\u0005\u0014\u0000\u0000\u016f\u016e\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001"+
		"\u0000\u0000\u0000\u0173\u017a\u0003\u001e\u000f\u0000\u0174\u0176\u0005"+
		"\u0014\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001"+
		"\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b\u0003"+
		"\"\u0011\u0000\u017a\u0175\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000"+
		"\u0000\u0000\u017b!\u0001\u0000\u0000\u0000\u017c\u017e\u0005\u0005\u0000"+
		"\u0000\u017d\u017f\u0005\u0014\u0000\u0000\u017e\u017d\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0003\u001e\u000f\u0000\u0183#\u0001\u0000\u0000\u0000"+
		"\u0184\u0186\u0003&\u0013\u0000\u0185\u0187\u0005\u0014\u0000\u0000\u0186"+
		"\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0005\u0010\u0000\u0000\u018b"+
		"\u018d\u0005\u0014\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0003&\u0013\u0000\u0191%\u0001\u0000\u0000\u0000\u0192\u0195\u0003"+
		"(\u0014\u0000\u0193\u0195\u0003*\u0015\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195\'\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0005\u0012\u0000\u0000\u0197)\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0005\u0011\u0000\u0000\u0199+\u0001\u0000\u0000\u0000;/7>GMSY"+
		"\\ahmty\u0080\u0085\u008c\u0091\u0098\u009d\u00a4\u00a9\u00b0\u00b5\u00bc"+
		"\u00c1\u00c8\u00cd\u00d4\u00d9\u00e0\u00e2\u00e7\u00f0\u00f5\u00fb\u0100"+
		"\u0106\u010b\u0111\u0117\u011f\u0125\u012d\u0133\u013b\u0141\u0149\u014f"+
		"\u0157\u015c\u0163\u016b\u0171\u0177\u017a\u0180\u0188\u018e\u0194";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}