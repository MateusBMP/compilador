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
		ASSIGN=1, GOTO=2, DECLARE=3, DIVIDE=4, ELSE=5, END=6, FI=7, IF=8, INIT=9, 
		MINUS=10, MULTIPLY=11, PRINT=12, SUM=13, OPERATOR=14, INTEGER=15, IDENTIFIER=16, 
		NEWLINE=17, SPACE=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "GOTO", "DECLARE", "DIVIDE", "ELSE", "END", "FI", "IF", "INIT", 
			"MINUS", "MULTIPLY", "PRINT", "SUM", "OPERATOR", "INTEGER", "IDENTIFIER", 
			"NEWLINE", "SPACE"
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
		"\u0004\u0000\u0012\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\rz\b\r\u0001\u000e\u0003\u000e}\b\u000e\u0001\u000e\u0004\u000e"+
		"\u0080\b\u000e\u000b\u000e\f\u000e\u0081\u0001\u000f\u0004\u000f\u0085"+
		"\b\u000f\u000b\u000f\f\u000f\u0086\u0001\u0010\u0003\u0010\u008a\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004\u0002\u0000++--\u0001"+
		"\u000009\u0001\u0000az\u0002\u0000\t\t  \u0097\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003,\u0001"+
		"\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000"+
		"\u0000\t@\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000\rI\u0001"+
		"\u0000\u0000\u0000\u000fL\u0001\u0000\u0000\u0000\u0011O\u0001\u0000\u0000"+
		"\u0000\u0013T\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017"+
		"c\u0001\u0000\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001by\u0001"+
		"\u0000\u0000\u0000\u001d|\u0001\u0000\u0000\u0000\u001f\u0084\u0001\u0000"+
		"\u0000\u0000!\u0089\u0001\u0000\u0000\u0000#\u008d\u0001\u0000\u0000\u0000"+
		"%&\u0005A\u0000\u0000&\'\u0005S\u0000\u0000\'(\u0005S\u0000\u0000()\u0005"+
		"I\u0000\u0000)*\u0005G\u0000\u0000*+\u0005N\u0000\u0000+\u0002\u0001\u0000"+
		"\u0000\u0000,-\u0005G\u0000\u0000-.\u0005O\u0000\u0000./\u0005T\u0000"+
		"\u0000/0\u0005O\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005D\u0000"+
		"\u000023\u0005E\u0000\u000034\u0005C\u0000\u000045\u0005L\u0000\u0000"+
		"56\u0005A\u0000\u000067\u0005R\u0000\u000078\u0005E\u0000\u00008\u0006"+
		"\u0001\u0000\u0000\u00009:\u0005D\u0000\u0000:;\u0005I\u0000\u0000;<\u0005"+
		"V\u0000\u0000<=\u0005I\u0000\u0000=>\u0005D\u0000\u0000>?\u0005E\u0000"+
		"\u0000?\b\u0001\u0000\u0000\u0000@A\u0005E\u0000\u0000AB\u0005L\u0000"+
		"\u0000BC\u0005S\u0000\u0000CD\u0005E\u0000\u0000D\n\u0001\u0000\u0000"+
		"\u0000EF\u0005E\u0000\u0000FG\u0005N\u0000\u0000GH\u0005D\u0000\u0000"+
		"H\f\u0001\u0000\u0000\u0000IJ\u0005F\u0000\u0000JK\u0005I\u0000\u0000"+
		"K\u000e\u0001\u0000\u0000\u0000LM\u0005I\u0000\u0000MN\u0005F\u0000\u0000"+
		"N\u0010\u0001\u0000\u0000\u0000OP\u0005I\u0000\u0000PQ\u0005N\u0000\u0000"+
		"QR\u0005I\u0000\u0000RS\u0005T\u0000\u0000S\u0012\u0001\u0000\u0000\u0000"+
		"TU\u0005M\u0000\u0000UV\u0005I\u0000\u0000VW\u0005N\u0000\u0000WX\u0005"+
		"U\u0000\u0000XY\u0005S\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005"+
		"M\u0000\u0000[\\\u0005U\u0000\u0000\\]\u0005L\u0000\u0000]^\u0005T\u0000"+
		"\u0000^_\u0005I\u0000\u0000_`\u0005P\u0000\u0000`a\u0005L\u0000\u0000"+
		"ab\u0005Y\u0000\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005P\u0000\u0000"+
		"de\u0005R\u0000\u0000ef\u0005I\u0000\u0000fg\u0005N\u0000\u0000gh\u0005"+
		"T\u0000\u0000h\u0018\u0001\u0000\u0000\u0000ij\u0005S\u0000\u0000jk\u0005"+
		"U\u0000\u0000kl\u0005M\u0000\u0000l\u001a\u0001\u0000\u0000\u0000mn\u0005"+
		"E\u0000\u0000nz\u0005Q\u0000\u0000op\u0005N\u0000\u0000pz\u0005E\u0000"+
		"\u0000qr\u0005L\u0000\u0000rz\u0005T\u0000\u0000st\u0005L\u0000\u0000"+
		"tz\u0005E\u0000\u0000uv\u0005G\u0000\u0000vz\u0005T\u0000\u0000wx\u0005"+
		"G\u0000\u0000xz\u0005E\u0000\u0000ym\u0001\u0000\u0000\u0000yo\u0001\u0000"+
		"\u0000\u0000yq\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yu\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z\u001c\u0001\u0000\u0000"+
		"\u0000{}\u0007\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~\u0080\u0007\u0001\u0000\u0000"+
		"\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u001e\u0001\u0000\u0000\u0000\u0083\u0085\u0007\u0002\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		" \u0001\u0000\u0000\u0000\u0088\u008a\u0005\r\u0000\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\n\u0000\u0000\u008c\"\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0007\u0003\u0000\u0000\u008e$\u0001\u0000"+
		"\u0000\u0000\u0006\u0000y|\u0081\u0086\u0089\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}