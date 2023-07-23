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
		ASSIGN=1, GOTO=2, DECLARE=3, DIVIDE=4, END=5, INIT=6, MINUS=7, MULTIPLY=8, 
		PRINT=9, SUM=10, INTEGER=11, IDENTIFIER=12, NEWLINE=13, SPACE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "GOTO", "DECLARE", "DIVIDE", "END", "INIT", "MINUS", "MULTIPLY", 
			"PRINT", "SUM", "INTEGER", "IDENTIFIER", "NEWLINE", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ASSIGN'", "'GOTO'", "'DECLARE'", "'DIVIDE'", "'END'", "'INIT'", 
			"'MINUS'", "'MULTIPLY'", "'PRINT'", "'SUM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "GOTO", "DECLARE", "DIVIDE", "END", "INIT", "MINUS", 
			"MULTIPLY", "PRINT", "SUM", "INTEGER", "IDENTIFIER", "NEWLINE", "SPACE"
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
		"\u0004\u0000\u000en\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0003\n\\\b\n\u0001\n\u0004\n_\b\n\u000b\n\f"+
		"\n`\u0001\u000b\u0004\u000bd\b\u000b\u000b\u000b\f\u000be\u0001\f\u0003"+
		"\fi\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000"+
		"\u0004\u0002\u0000++--\u0001\u000009\u0001\u0000az\u0002\u0000\t\t  q"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d"+
		"\u0001\u0000\u0000\u0000\u0003$\u0001\u0000\u0000\u0000\u0005)\u0001\u0000"+
		"\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000"+
		"\u000b<\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fG\u0001"+
		"\u0000\u0000\u0000\u0011P\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000"+
		"\u0000\u0015[\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019"+
		"h\u0001\u0000\u0000\u0000\u001bl\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"A\u0000\u0000\u001e\u001f\u0005S\u0000\u0000\u001f \u0005S\u0000\u0000"+
		" !\u0005I\u0000\u0000!\"\u0005G\u0000\u0000\"#\u0005N\u0000\u0000#\u0002"+
		"\u0001\u0000\u0000\u0000$%\u0005G\u0000\u0000%&\u0005O\u0000\u0000&\'"+
		"\u0005T\u0000\u0000\'(\u0005O\u0000\u0000(\u0004\u0001\u0000\u0000\u0000"+
		")*\u0005D\u0000\u0000*+\u0005E\u0000\u0000+,\u0005C\u0000\u0000,-\u0005"+
		"L\u0000\u0000-.\u0005A\u0000\u0000./\u0005R\u0000\u0000/0\u0005E\u0000"+
		"\u00000\u0006\u0001\u0000\u0000\u000012\u0005D\u0000\u000023\u0005I\u0000"+
		"\u000034\u0005V\u0000\u000045\u0005I\u0000\u000056\u0005D\u0000\u0000"+
		"67\u0005E\u0000\u00007\b\u0001\u0000\u0000\u000089\u0005E\u0000\u0000"+
		"9:\u0005N\u0000\u0000:;\u0005D\u0000\u0000;\n\u0001\u0000\u0000\u0000"+
		"<=\u0005I\u0000\u0000=>\u0005N\u0000\u0000>?\u0005I\u0000\u0000?@\u0005"+
		"T\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005M\u0000\u0000BC\u0005"+
		"I\u0000\u0000CD\u0005N\u0000\u0000DE\u0005U\u0000\u0000EF\u0005S\u0000"+
		"\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005M\u0000\u0000HI\u0005U\u0000"+
		"\u0000IJ\u0005L\u0000\u0000JK\u0005T\u0000\u0000KL\u0005I\u0000\u0000"+
		"LM\u0005P\u0000\u0000MN\u0005L\u0000\u0000NO\u0005Y\u0000\u0000O\u0010"+
		"\u0001\u0000\u0000\u0000PQ\u0005P\u0000\u0000QR\u0005R\u0000\u0000RS\u0005"+
		"I\u0000\u0000ST\u0005N\u0000\u0000TU\u0005T\u0000\u0000U\u0012\u0001\u0000"+
		"\u0000\u0000VW\u0005S\u0000\u0000WX\u0005U\u0000\u0000XY\u0005M\u0000"+
		"\u0000Y\u0014\u0001\u0000\u0000\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000"+
		"]_\u0007\u0001\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0016\u0001"+
		"\u0000\u0000\u0000bd\u0007\u0002\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000f\u0018\u0001\u0000\u0000\u0000gi\u0005\r\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005"+
		"\n\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lm\u0007\u0003\u0000\u0000"+
		"m\u001c\u0001\u0000\u0000\u0000\u0005\u0000[`eh\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}