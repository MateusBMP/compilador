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
		T__0=1, T__1=2, DECLARE=3, ASSIGN=4, SUM=5, MINUS=6, MULTIPLY=7, DIVIDE=8, 
		PRINT=9, INTEGER=10, IDENTIFIER=11, NEWLINE=12, SPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "DECLARE", "ASSIGN", "SUM", "MINUS", "MULTIPLY", "DIVIDE", 
			"PRINT", "INTEGER", "IDENTIFIER", "NEWLINE", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INIT NLG'", "'END NLG'", "'DECLARE'", "'ASSIGN'", "'SUM'", "'MINUS'", 
			"'MULTIPLY'", "'DIVIDE'", "'PRINT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DECLARE", "ASSIGN", "SUM", "MINUS", "MULTIPLY", "DIVIDE", 
			"PRINT", "INTEGER", "IDENTIFIER", "NEWLINE", "SPACE"
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
		"\u0004\u0000\ro\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0003\t"+
		"]\b\t\u0001\t\u0004\t`\b\t\u000b\t\f\ta\u0001\n\u0004\ne\b\n\u000b\n\f"+
		"\nf\u0001\u000b\u0003\u000bj\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u0001\u0000\u0004\u0002\u0000++--\u0001\u000009\u0001\u0000az\u0002"+
		"\u0000\t\t  r\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000"+
		"\u0003$\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u00074"+
		"\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000b?\u0001\u0000"+
		"\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000\u0000"+
		"\u0011U\u0001\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000\u0000\u0015"+
		"d\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019m\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005I\u0000\u0000\u001c\u001d\u0005N\u0000"+
		"\u0000\u001d\u001e\u0005I\u0000\u0000\u001e\u001f\u0005T\u0000\u0000\u001f"+
		" \u0005 \u0000\u0000 !\u0005N\u0000\u0000!\"\u0005L\u0000\u0000\"#\u0005"+
		"G\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005E\u0000\u0000%&\u0005"+
		"N\u0000\u0000&\'\u0005D\u0000\u0000\'(\u0005 \u0000\u0000()\u0005N\u0000"+
		"\u0000)*\u0005L\u0000\u0000*+\u0005G\u0000\u0000+\u0004\u0001\u0000\u0000"+
		"\u0000,-\u0005D\u0000\u0000-.\u0005E\u0000\u0000./\u0005C\u0000\u0000"+
		"/0\u0005L\u0000\u000001\u0005A\u0000\u000012\u0005R\u0000\u000023\u0005"+
		"E\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0005A\u0000\u000056\u0005"+
		"S\u0000\u000067\u0005S\u0000\u000078\u0005I\u0000\u000089\u0005G\u0000"+
		"\u00009:\u0005N\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005S\u0000"+
		"\u0000<=\u0005U\u0000\u0000=>\u0005M\u0000\u0000>\n\u0001\u0000\u0000"+
		"\u0000?@\u0005M\u0000\u0000@A\u0005I\u0000\u0000AB\u0005N\u0000\u0000"+
		"BC\u0005U\u0000\u0000CD\u0005S\u0000\u0000D\f\u0001\u0000\u0000\u0000"+
		"EF\u0005M\u0000\u0000FG\u0005U\u0000\u0000GH\u0005L\u0000\u0000HI\u0005"+
		"T\u0000\u0000IJ\u0005I\u0000\u0000JK\u0005P\u0000\u0000KL\u0005L\u0000"+
		"\u0000LM\u0005Y\u0000\u0000M\u000e\u0001\u0000\u0000\u0000NO\u0005D\u0000"+
		"\u0000OP\u0005I\u0000\u0000PQ\u0005V\u0000\u0000QR\u0005I\u0000\u0000"+
		"RS\u0005D\u0000\u0000ST\u0005E\u0000\u0000T\u0010\u0001\u0000\u0000\u0000"+
		"UV\u0005P\u0000\u0000VW\u0005R\u0000\u0000WX\u0005I\u0000\u0000XY\u0005"+
		"N\u0000\u0000YZ\u0005T\u0000\u0000Z\u0012\u0001\u0000\u0000\u0000[]\u0007"+
		"\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]_\u0001\u0000\u0000\u0000^`\u0007\u0001\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\u0014\u0001\u0000\u0000\u0000ce\u0007\u0002\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000g\u0016\u0001\u0000\u0000\u0000hj\u0005"+
		"\r\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000kl\u0005\n\u0000\u0000l\u0018\u0001\u0000\u0000\u0000"+
		"mn\u0007\u0003\u0000\u0000n\u001a\u0001\u0000\u0000\u0000\u0005\u0000"+
		"\\afi\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}