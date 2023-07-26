// Generated from ./src/compiler/nelang/Nelang.g4 by ANTLR 4.13.0
package compiler.nelang.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NelangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, GOTO=2, DECLARE=3, DIVIDE=4, ELSE=5, END=6, EXPECT=7, EXPORT=8, 
		FI=9, IF=10, INIT=11, MINUS=12, MULTIPLY=13, PRINT=14, SUM=15, OPERATOR=16, 
		INTEGER=17, IDENTIFIER=18, NEWLINE=19, SPACE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "GOTO", "DECLARE", "DIVIDE", "ELSE", "END", "EXPECT", "EXPORT", 
			"FI", "IF", "INIT", "MINUS", "MULTIPLY", "PRINT", "SUM", "OPERATOR", 
			"INTEGER", "IDENTIFIER", "NEWLINE", "SPACE"
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


	public NelangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Nelang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u008c\b\u000f\u0001"+
		"\u0010\u0003\u0010\u008f\b\u0010\u0001\u0010\u0004\u0010\u0092\b\u0010"+
		"\u000b\u0010\f\u0010\u0093\u0001\u0011\u0004\u0011\u0097\b\u0011\u000b"+
		"\u0011\f\u0011\u0098\u0001\u0012\u0003\u0012\u009c\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0004\u0002\u0000++--\u0001"+
		"\u000009\u0001\u0000az\u0002\u0000\t\t  \u00a9\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u00030\u0001\u0000\u0000"+
		"\u0000\u00055\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t"+
		"D\u0001\u0000\u0000\u0000\u000bI\u0001\u0000\u0000\u0000\rM\u0001\u0000"+
		"\u0000\u0000\u000fT\u0001\u0000\u0000\u0000\u0011[\u0001\u0000\u0000\u0000"+
		"\u0013^\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017f"+
		"\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000\u0000\u001bu\u0001\u0000"+
		"\u0000\u0000\u001d{\u0001\u0000\u0000\u0000\u001f\u008b\u0001\u0000\u0000"+
		"\u0000!\u008e\u0001\u0000\u0000\u0000#\u0096\u0001\u0000\u0000\u0000%"+
		"\u009b\u0001\u0000\u0000\u0000\'\u009f\u0001\u0000\u0000\u0000)*\u0005"+
		"A\u0000\u0000*+\u0005S\u0000\u0000+,\u0005S\u0000\u0000,-\u0005I\u0000"+
		"\u0000-.\u0005G\u0000\u0000./\u0005N\u0000\u0000/\u0002\u0001\u0000\u0000"+
		"\u000001\u0005G\u0000\u000012\u0005O\u0000\u000023\u0005T\u0000\u0000"+
		"34\u0005O\u0000\u00004\u0004\u0001\u0000\u0000\u000056\u0005D\u0000\u0000"+
		"67\u0005E\u0000\u000078\u0005C\u0000\u000089\u0005L\u0000\u00009:\u0005"+
		"A\u0000\u0000:;\u0005R\u0000\u0000;<\u0005E\u0000\u0000<\u0006\u0001\u0000"+
		"\u0000\u0000=>\u0005D\u0000\u0000>?\u0005I\u0000\u0000?@\u0005V\u0000"+
		"\u0000@A\u0005I\u0000\u0000AB\u0005D\u0000\u0000BC\u0005E\u0000\u0000"+
		"C\b\u0001\u0000\u0000\u0000DE\u0005E\u0000\u0000EF\u0005L\u0000\u0000"+
		"FG\u0005S\u0000\u0000GH\u0005E\u0000\u0000H\n\u0001\u0000\u0000\u0000"+
		"IJ\u0005E\u0000\u0000JK\u0005N\u0000\u0000KL\u0005D\u0000\u0000L\f\u0001"+
		"\u0000\u0000\u0000MN\u0005E\u0000\u0000NO\u0005X\u0000\u0000OP\u0005P"+
		"\u0000\u0000PQ\u0005E\u0000\u0000QR\u0005C\u0000\u0000RS\u0005T\u0000"+
		"\u0000S\u000e\u0001\u0000\u0000\u0000TU\u0005E\u0000\u0000UV\u0005X\u0000"+
		"\u0000VW\u0005P\u0000\u0000WX\u0005O\u0000\u0000XY\u0005R\u0000\u0000"+
		"YZ\u0005T\u0000\u0000Z\u0010\u0001\u0000\u0000\u0000[\\\u0005F\u0000\u0000"+
		"\\]\u0005I\u0000\u0000]\u0012\u0001\u0000\u0000\u0000^_\u0005I\u0000\u0000"+
		"_`\u0005F\u0000\u0000`\u0014\u0001\u0000\u0000\u0000ab\u0005I\u0000\u0000"+
		"bc\u0005N\u0000\u0000cd\u0005I\u0000\u0000de\u0005T\u0000\u0000e\u0016"+
		"\u0001\u0000\u0000\u0000fg\u0005M\u0000\u0000gh\u0005I\u0000\u0000hi\u0005"+
		"N\u0000\u0000ij\u0005U\u0000\u0000jk\u0005S\u0000\u0000k\u0018\u0001\u0000"+
		"\u0000\u0000lm\u0005M\u0000\u0000mn\u0005U\u0000\u0000no\u0005L\u0000"+
		"\u0000op\u0005T\u0000\u0000pq\u0005I\u0000\u0000qr\u0005P\u0000\u0000"+
		"rs\u0005L\u0000\u0000st\u0005Y\u0000\u0000t\u001a\u0001\u0000\u0000\u0000"+
		"uv\u0005P\u0000\u0000vw\u0005R\u0000\u0000wx\u0005I\u0000\u0000xy\u0005"+
		"N\u0000\u0000yz\u0005T\u0000\u0000z\u001c\u0001\u0000\u0000\u0000{|\u0005"+
		"S\u0000\u0000|}\u0005U\u0000\u0000}~\u0005M\u0000\u0000~\u001e\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005E\u0000\u0000\u0080\u008c\u0005Q\u0000\u0000"+
		"\u0081\u0082\u0005N\u0000\u0000\u0082\u008c\u0005E\u0000\u0000\u0083\u0084"+
		"\u0005L\u0000\u0000\u0084\u008c\u0005T\u0000\u0000\u0085\u0086\u0005L"+
		"\u0000\u0000\u0086\u008c\u0005E\u0000\u0000\u0087\u0088\u0005G\u0000\u0000"+
		"\u0088\u008c\u0005T\u0000\u0000\u0089\u008a\u0005G\u0000\u0000\u008a\u008c"+
		"\u0005E\u0000\u0000\u008b\u007f\u0001\u0000\u0000\u0000\u008b\u0081\u0001"+
		"\u0000\u0000\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u0085\u0001"+
		"\u0000\u0000\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008c \u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0000"+
		"\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0092\u0007\u0001"+
		"\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\"\u0001\u0000\u0000\u0000\u0095\u0097\u0007\u0002\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099$\u0001\u0000\u0000\u0000\u009a\u009c\u0005\r\u0000\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\n\u0000\u0000\u009e"+
		"&\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0003\u0000\u0000\u00a0(\u0001"+
		"\u0000\u0000\u0000\u0006\u0000\u008b\u008e\u0093\u0098\u009b\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}