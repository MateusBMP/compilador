// Generated from Nelang.g4 by ANTLR 4.13.0
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
		T__0=1, T__1=2, DECLARE=3, ASSIGN=4, SUM=5, MINUS=6, PRINT=7, INTEGER=8, 
		IDENTIFIER=9, NEWLINE=10, SPACE=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "DECLARE", "ASSIGN", "SUM", "MINUS", "PRINT", "INTEGER", 
			"IDENTIFIER", "NEWLINE", "SPACE"
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
		"\u0004\u0000\u000b[\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007I\b\u0007\u0001\u0007\u0004\u0007L\b\u0007\u000b\u0007\f\u0007"+
		"M\u0001\b\u0004\bQ\b\b\u000b\b\f\bR\u0001\t\u0003\tV\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0001\u0000\u0004\u0002\u0000++--\u0001\u000009\u0001\u0000az\u0002"+
		"\u0000\t\t  ^\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000"+
		"\u0003 \u0001\u0000\u0000\u0000\u0005(\u0001\u0000\u0000\u0000\u00070"+
		"\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b;\u0001\u0000"+
		"\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fH\u0001\u0000\u0000\u0000"+
		"\u0011P\u0001\u0000\u0000\u0000\u0013U\u0001\u0000\u0000\u0000\u0015Y"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0005I\u0000\u0000\u0018\u0019\u0005"+
		"N\u0000\u0000\u0019\u001a\u0005I\u0000\u0000\u001a\u001b\u0005T\u0000"+
		"\u0000\u001b\u001c\u0005 \u0000\u0000\u001c\u001d\u0005N\u0000\u0000\u001d"+
		"\u001e\u0005L\u0000\u0000\u001e\u001f\u0005G\u0000\u0000\u001f\u0002\u0001"+
		"\u0000\u0000\u0000 !\u0005E\u0000\u0000!\"\u0005N\u0000\u0000\"#\u0005"+
		"D\u0000\u0000#$\u0005 \u0000\u0000$%\u0005N\u0000\u0000%&\u0005L\u0000"+
		"\u0000&\'\u0005G\u0000\u0000\'\u0004\u0001\u0000\u0000\u0000()\u0005D"+
		"\u0000\u0000)*\u0005E\u0000\u0000*+\u0005C\u0000\u0000+,\u0005L\u0000"+
		"\u0000,-\u0005A\u0000\u0000-.\u0005R\u0000\u0000./\u0005E\u0000\u0000"+
		"/\u0006\u0001\u0000\u0000\u000001\u0005A\u0000\u000012\u0005S\u0000\u0000"+
		"23\u0005S\u0000\u000034\u0005I\u0000\u000045\u0005G\u0000\u000056\u0005"+
		"N\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005S\u0000\u000089\u0005"+
		"U\u0000\u00009:\u0005M\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005"+
		"M\u0000\u0000<=\u0005I\u0000\u0000=>\u0005N\u0000\u0000>?\u0005U\u0000"+
		"\u0000?@\u0005S\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005P\u0000"+
		"\u0000BC\u0005R\u0000\u0000CD\u0005I\u0000\u0000DE\u0005N\u0000\u0000"+
		"EF\u0005T\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GI\u0007\u0000\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000"+
		"\u0000\u0000JL\u0007\u0001\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\u0010\u0001\u0000\u0000\u0000OQ\u0007\u0002\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000S\u0012\u0001\u0000\u0000\u0000TV\u0005\r\u0000\u0000"+
		"UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WX\u0005\n\u0000\u0000X\u0014\u0001\u0000\u0000\u0000YZ\u0007\u0003"+
		"\u0000\u0000Z\u0016\u0001\u0000\u0000\u0000\u0005\u0000HMRU\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}