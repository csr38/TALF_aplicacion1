// Generated from C:/Users/cesar/IdeaProjects/TALF_aplicacion1/src/main/java/org/example\MyGrammar.g4 by ANTLR 4.12.0

  package org.example;

  import java.util.Map;
  import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, INT=25, 
		NEWLINE=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "ID", "INT", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "';'", "'while'", "'('", "')'", "'{'", "'}'", "'if'", "'else'", 
			"'put'", "'get'", "' '", "'/'", "'*'", "'+'", "'-'", "'=='", "'!='", 
			"'<='", "'>='", "'<'", "'>'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT", "NEWLINE", "WS"
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

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
		"\u0004\u0000\u001b\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017x\b"+
		"\u0017\u000b\u0017\f\u0017y\u0001\u0018\u0004\u0018}\b\u0018\u000b\u0018"+
		"\f\u0018~\u0001\u0019\u0003\u0019\u0082\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0004\u001a\u0087\b\u001a\u000b\u001a\f\u001a\u0088\u0001"+
		"\u001a\u0001\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b\u0001"+
		"\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0002\u0000\t\t  \u008f\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000"+
		"\u0003:\u0001\u0000\u0000\u0000\u0005<\u0001\u0000\u0000\u0000\u0007B"+
		"\u0001\u0000\u0000\u0000\tD\u0001\u0000\u0000\u0000\u000bF\u0001\u0000"+
		"\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000"+
		"\u0011M\u0001\u0000\u0000\u0000\u0013R\u0001\u0000\u0000\u0000\u0015V"+
		"\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\\u0001"+
		"\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001d`\u0001\u0000\u0000"+
		"\u0000\u001fb\u0001\u0000\u0000\u0000!d\u0001\u0000\u0000\u0000#g\u0001"+
		"\u0000\u0000\u0000%j\u0001\u0000\u0000\u0000\'m\u0001\u0000\u0000\u0000"+
		")p\u0001\u0000\u0000\u0000+r\u0001\u0000\u0000\u0000-t\u0001\u0000\u0000"+
		"\u0000/w\u0001\u0000\u0000\u00001|\u0001\u0000\u0000\u00003\u0081\u0001"+
		"\u0000\u0000\u00005\u0086\u0001\u0000\u0000\u000078\u0005/\u0000\u0000"+
		"89\u0005/\u0000\u00009\u0002\u0001\u0000\u0000\u0000:;\u0005;\u0000\u0000"+
		";\u0004\u0001\u0000\u0000\u0000<=\u0005w\u0000\u0000=>\u0005h\u0000\u0000"+
		">?\u0005i\u0000\u0000?@\u0005l\u0000\u0000@A\u0005e\u0000\u0000A\u0006"+
		"\u0001\u0000\u0000\u0000BC\u0005(\u0000\u0000C\b\u0001\u0000\u0000\u0000"+
		"DE\u0005)\u0000\u0000E\n\u0001\u0000\u0000\u0000FG\u0005{\u0000\u0000"+
		"G\f\u0001\u0000\u0000\u0000HI\u0005}\u0000\u0000I\u000e\u0001\u0000\u0000"+
		"\u0000JK\u0005i\u0000\u0000KL\u0005f\u0000\u0000L\u0010\u0001\u0000\u0000"+
		"\u0000MN\u0005e\u0000\u0000NO\u0005l\u0000\u0000OP\u0005s\u0000\u0000"+
		"PQ\u0005e\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005p\u0000\u0000"+
		"ST\u0005u\u0000\u0000TU\u0005t\u0000\u0000U\u0014\u0001\u0000\u0000\u0000"+
		"VW\u0005g\u0000\u0000WX\u0005e\u0000\u0000XY\u0005t\u0000\u0000Y\u0016"+
		"\u0001\u0000\u0000\u0000Z[\u0005 \u0000\u0000[\u0018\u0001\u0000\u0000"+
		"\u0000\\]\u0005/\u0000\u0000]\u001a\u0001\u0000\u0000\u0000^_\u0005*\u0000"+
		"\u0000_\u001c\u0001\u0000\u0000\u0000`a\u0005+\u0000\u0000a\u001e\u0001"+
		"\u0000\u0000\u0000bc\u0005-\u0000\u0000c \u0001\u0000\u0000\u0000de\u0005"+
		"=\u0000\u0000ef\u0005=\u0000\u0000f\"\u0001\u0000\u0000\u0000gh\u0005"+
		"!\u0000\u0000hi\u0005=\u0000\u0000i$\u0001\u0000\u0000\u0000jk\u0005<"+
		"\u0000\u0000kl\u0005=\u0000\u0000l&\u0001\u0000\u0000\u0000mn\u0005>\u0000"+
		"\u0000no\u0005=\u0000\u0000o(\u0001\u0000\u0000\u0000pq\u0005<\u0000\u0000"+
		"q*\u0001\u0000\u0000\u0000rs\u0005>\u0000\u0000s,\u0001\u0000\u0000\u0000"+
		"tu\u0005=\u0000\u0000u.\u0001\u0000\u0000\u0000vx\u0007\u0000\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z0\u0001\u0000\u0000\u0000{}\u0007\u0001"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f2\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0005\r\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\n\u0000\u0000\u00844\u0001\u0000\u0000\u0000\u0085"+
		"\u0087\u0007\u0002\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0006\u001a\u0000\u0000\u008b6\u0001\u0000\u0000\u0000\u0005\u0000"+
		"y~\u0081\u0088\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}