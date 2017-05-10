// Generated from /home/hygor/Downloads/compilador/src/decaf/DecafLexer.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_class=1, LCURLY=2, RCURLY=3, BOOLEAN=4, BREAK=5, CALLOUT=6, CLASS=7, 
		CONTINUE=8, DO=9, ELSE=10, FOR=11, IF=12, RETURN=13, VOID=14, WHILE=15, 
		INTEGER_LITERAL=16, BOOLEAN_LITERAL=17, CHAR_LITERAL=18, STRING_LITERAL=19, 
		NULL_LITERAL=20, ASSIGN=21, GT=22, LT=23, TILDE=24, QUESTION=25, COLON=26, 
		EQUAL=27, LE=28, GE=29, NOT_EQUAL=30, AND=31, OR=32, INC=33, DEC=34, ADD=35, 
		SUB=36, MUL=37, DIV=38, BIT_AND=39, BIT_OR=40, MOD=41, LPAREN=42, RPAREN=43, 
		LBRACE=44, RBRACE=45, LBRACK=46, RBRACK=47, SEMI=48, COMMA=49, IDENTIFIER=50, 
		WS=51, SINGLE_LINE_COMMENT=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", 
		"DO", "ELSE", "FOR", "IF", "RETURN", "VOID", "WHILE", "INTEGER_LITERAL", 
		"DECIMAL_INTEGER_LITERAL", "DECIMAL_NUMERAL", "DIGITS", "DIGIT", "NON_ZERO_DIGIT", 
		"HEX_INTEGER_LITERAL", "HEX_NUMERAL", "HEX_DIGIT", "OCTAL_INTEGER_LITERAL", 
		"OCTAL_NUMERAL", "OCTAL_DIGITS", "OCTAL_DIGIT", "BOOLEAN_LITERAL", "CHAR_LITERAL", 
		"SINGLE_CHARACTER", "STRING_LITERAL", "STRING_CHARACTERS", "STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "NULL_LITERAL", "ASSIGN", "GT", "LT", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOT_EQUAL", "AND", "OR", "INC", "DEC", 
		"ADD", "SUB", "MUL", "DIV", "BIT_AND", "BIT_OR", "MOD", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "IDENTIFIER", 
		"DECAF_LETTER", "DECAF_LETTER_OR_DIGIT", "WS", "SINGLE_LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'boolean'", "'break'", "'callout'", "'class'", 
		"'continue'", "'do'", "'else'", "'for'", "'if'", "'return'", "'void'", 
		"'while'", null, null, null, null, "'null'", "'='", "'>'", "'<'", "'~'", 
		"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'%'", "'('", "')'", 
		null, null, "'['", "']'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "BOOLEAN", "BREAK", "CALLOUT", "CLASS", 
		"CONTINUE", "DO", "ELSE", "FOR", "IF", "RETURN", "VOID", "WHILE", "INTEGER_LITERAL", 
		"BOOLEAN_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "ASSIGN", 
		"GT", "LT", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOT_EQUAL", 
		"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BIT_AND", "BIT_OR", 
		"MOD", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "IDENTIFIER", "WS", "SINGLE_LINE_COMMENT"
	};
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


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u019f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00db\n\20\3\21\3\21\3\22\3\22"+
		"\3\22\7\22\u00e2\n\22\f\22\16\22\u00e5\13\22\5\22\u00e7\n\22\3\23\3\23"+
		"\5\23\u00eb\n\23\3\24\3\24\5\24\u00ef\n\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\5\27\u00f9\n\27\3\27\3\27\3\27\3\27\5\27\u00ff\n\27\5\27"+
		"\u0101\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\7\33\u010c\n"+
		"\33\f\33\16\33\u010f\13\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u011c\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0126\n\36\3\37\3\37\3 \3 \5 \u012c\n \3 \3 \3!\6!\u0131\n!\r!\16!\u0132"+
		"\3\"\3\"\5\"\u0137\n\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@"+
		"\3A\3A\3B\3B\7B\u0185\nB\fB\16B\u0188\13B\3C\3C\3D\3D\3E\6E\u018f\nE\r"+
		"E\16E\u0190\3E\3E\3F\3F\3F\3F\7F\u0199\nF\fF\16F\u019c\13F\3F\3F\2\2G"+
		"\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27\16\31\17\33\20\35\21"+
		"\37\22!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\23;\24=\2?\25A\2"+
		"C\2E\2G\26I\27K\30M\31O\32Q\33S\34U\35W\36Y\37[ ]!_\"a#c$e%g&i\'k(m)o"+
		"*q+s,u-w.y/{\60}\61\177\62\u0081\63\u0083\64\u0085\2\u0087\2\u0089\65"+
		"\u008b\66\3\2\13\3\2\63;\5\2\62;CHch\3\2\629\5\2$$))^^\t\2$$))^^hhppt"+
		"tvv\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u019e\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2?\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f"+
		"\3\2\2\2\7\u0091\3\2\2\2\t\u0099\3\2\2\2\13\u009f\3\2\2\2\r\u00a7\3\2"+
		"\2\2\17\u00ad\3\2\2\2\21\u00b6\3\2\2\2\23\u00b9\3\2\2\2\25\u00be\3\2\2"+
		"\2\27\u00c2\3\2\2\2\31\u00c5\3\2\2\2\33\u00cc\3\2\2\2\35\u00d1\3\2\2\2"+
		"\37\u00da\3\2\2\2!\u00dc\3\2\2\2#\u00e6\3\2\2\2%\u00e8\3\2\2\2\'\u00ee"+
		"\3\2\2\2)\u00f0\3\2\2\2+\u00f2\3\2\2\2-\u0100\3\2\2\2/\u0102\3\2\2\2\61"+
		"\u0104\3\2\2\2\63\u0106\3\2\2\2\65\u0109\3\2\2\2\67\u0110\3\2\2\29\u011b"+
		"\3\2\2\2;\u0125\3\2\2\2=\u0127\3\2\2\2?\u0129\3\2\2\2A\u0130\3\2\2\2C"+
		"\u0136\3\2\2\2E\u0138\3\2\2\2G\u013b\3\2\2\2I\u0140\3\2\2\2K\u0142\3\2"+
		"\2\2M\u0144\3\2\2\2O\u0146\3\2\2\2Q\u0148\3\2\2\2S\u014a\3\2\2\2U\u014c"+
		"\3\2\2\2W\u014f\3\2\2\2Y\u0152\3\2\2\2[\u0155\3\2\2\2]\u0158\3\2\2\2_"+
		"\u015b\3\2\2\2a\u015e\3\2\2\2c\u0161\3\2\2\2e\u0164\3\2\2\2g\u0166\3\2"+
		"\2\2i\u0168\3\2\2\2k\u016a\3\2\2\2m\u016c\3\2\2\2o\u016e\3\2\2\2q\u0170"+
		"\3\2\2\2s\u0172\3\2\2\2u\u0174\3\2\2\2w\u0176\3\2\2\2y\u0178\3\2\2\2{"+
		"\u017a\3\2\2\2}\u017c\3\2\2\2\177\u017e\3\2\2\2\u0081\u0180\3\2\2\2\u0083"+
		"\u0182\3\2\2\2\u0085\u0189\3\2\2\2\u0087\u018b\3\2\2\2\u0089\u018e\3\2"+
		"\2\2\u008b\u0194\3\2\2\2\u008d\u008e\7}\2\2\u008e\4\3\2\2\2\u008f\u0090"+
		"\7\177\2\2\u0090\6\3\2\2\2\u0091\u0092\7d\2\2\u0092\u0093\7q\2\2\u0093"+
		"\u0094\7q\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\u0097\7c\2\2"+
		"\u0097\u0098\7p\2\2\u0098\b\3\2\2\2\u0099\u009a\7d\2\2\u009a\u009b\7t"+
		"\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7m\2\2\u009e\n"+
		"\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7v\2\2"+
		"\u00a6\f\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7c"+
		"\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7u\2\2\u00ac\16\3\2\2\2\u00ad\u00ae"+
		"\7e\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5\20\3\2\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7q\2\2\u00b8\22\3\2\2"+
		"\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd"+
		"\7g\2\2\u00bd\24\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1"+
		"\7t\2\2\u00c1\26\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7h\2\2\u00c4\30"+
		"\3\2\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7v\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7p\2\2\u00cb\32\3\2\2\2\u00cc"+
		"\u00cd\7x\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7f\2\2"+
		"\u00d0\34\3\2\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7"+
		"k\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\36\3\2\2\2\u00d7\u00db"+
		"\5!\21\2\u00d8\u00db\5+\26\2\u00d9\u00db\5\61\31\2\u00da\u00d7\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db \3\2\2\2\u00dc\u00dd\5"+
		"#\22\2\u00dd\"\3\2\2\2\u00de\u00e7\7\62\2\2\u00df\u00e3\5)\25\2\u00e0"+
		"\u00e2\5%\23\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00de\3\2\2\2\u00e6\u00df\3\2\2\2\u00e7$\3\2\2\2\u00e8\u00ea\5\'\24\2"+
		"\u00e9\u00eb\5\'\24\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb&\3"+
		"\2\2\2\u00ec\u00ef\7\62\2\2\u00ed\u00ef\5)\25\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef(\3\2\2\2\u00f0\u00f1\t\2\2\2\u00f1*\3\2\2\2\u00f2"+
		"\u00f3\5-\27\2\u00f3,\3\2\2\2\u00f4\u00f5\7\62\2\2\u00f5\u00f6\7z\2\2"+
		"\u00f6\u00f8\3\2\2\2\u00f7\u00f9\5/\30\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u0101\3\2\2\2\u00fa\u00fb\7Q\2\2\u00fb\u00fc\7Z\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00ff\5/\30\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00fa\3\2\2\2\u0101"+
		".\3\2\2\2\u0102\u0103\t\3\2\2\u0103\60\3\2\2\2\u0104\u0105\5\63\32\2\u0105"+
		"\62\3\2\2\2\u0106\u0107\7\62\2\2\u0107\u0108\5\65\33\2\u0108\64\3\2\2"+
		"\2\u0109\u010d\5\67\34\2\u010a\u010c\5\67\34\2\u010b\u010a\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\66\3\2\2"+
		"\2\u010f\u010d\3\2\2\2\u0110\u0111\t\4\2\2\u01118\3\2\2\2\u0112\u0113"+
		"\7v\2\2\u0113\u0114\7t\2\2\u0114\u0115\7w\2\2\u0115\u011c\7g\2\2\u0116"+
		"\u0117\7h\2\2\u0117\u0118\7c\2\2\u0118\u0119\7n\2\2\u0119\u011a\7u\2\2"+
		"\u011a\u011c\7g\2\2\u011b\u0112\3\2\2\2\u011b\u0116\3\2\2\2\u011c:\3\2"+
		"\2\2\u011d\u011e\7)\2\2\u011e\u011f\5=\37\2\u011f\u0120\7)\2\2\u0120\u0126"+
		"\3\2\2\2\u0121\u0122\7)\2\2\u0122\u0123\5E#\2\u0123\u0124\7)\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u0121\3\2\2\2\u0126<\3\2\2\2"+
		"\u0127\u0128\n\5\2\2\u0128>\3\2\2\2\u0129\u012b\7$\2\2\u012a\u012c\5A"+
		"!\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\7$\2\2\u012e@\3\2\2\2\u012f\u0131\5C\"\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133B\3\2\2\2"+
		"\u0134\u0137\n\5\2\2\u0135\u0137\5E#\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137D\3\2\2\2\u0138\u0139\7^\2\2\u0139\u013a\t\6\2\2\u013aF"+
		"\3\2\2\2\u013b\u013c\7p\2\2\u013c\u013d\7w\2\2\u013d\u013e\7n\2\2\u013e"+
		"\u013f\7n\2\2\u013fH\3\2\2\2\u0140\u0141\7?\2\2\u0141J\3\2\2\2\u0142\u0143"+
		"\7@\2\2\u0143L\3\2\2\2\u0144\u0145\7>\2\2\u0145N\3\2\2\2\u0146\u0147\7"+
		"\u0080\2\2\u0147P\3\2\2\2\u0148\u0149\7A\2\2\u0149R\3\2\2\2\u014a\u014b"+
		"\7<\2\2\u014bT\3\2\2\2\u014c\u014d\7?\2\2\u014d\u014e\7?\2\2\u014eV\3"+
		"\2\2\2\u014f\u0150\7>\2\2\u0150\u0151\7?\2\2\u0151X\3\2\2\2\u0152\u0153"+
		"\7@\2\2\u0153\u0154\7?\2\2\u0154Z\3\2\2\2\u0155\u0156\7#\2\2\u0156\u0157"+
		"\7?\2\2\u0157\\\3\2\2\2\u0158\u0159\7(\2\2\u0159\u015a\7(\2\2\u015a^\3"+
		"\2\2\2\u015b\u015c\7~\2\2\u015c\u015d\7~\2\2\u015d`\3\2\2\2\u015e\u015f"+
		"\7-\2\2\u015f\u0160\7-\2\2\u0160b\3\2\2\2\u0161\u0162\7/\2\2\u0162\u0163"+
		"\7/\2\2\u0163d\3\2\2\2\u0164\u0165\7-\2\2\u0165f\3\2\2\2\u0166\u0167\7"+
		"/\2\2\u0167h\3\2\2\2\u0168\u0169\7,\2\2\u0169j\3\2\2\2\u016a\u016b\7\61"+
		"\2\2\u016bl\3\2\2\2\u016c\u016d\7(\2\2\u016dn\3\2\2\2\u016e\u016f\7~\2"+
		"\2\u016fp\3\2\2\2\u0170\u0171\7\'\2\2\u0171r\3\2\2\2\u0172\u0173\7*\2"+
		"\2\u0173t\3\2\2\2\u0174\u0175\7+\2\2\u0175v\3\2\2\2\u0176\u0177\7}\2\2"+
		"\u0177x\3\2\2\2\u0178\u0179\7\177\2\2\u0179z\3\2\2\2\u017a\u017b\7]\2"+
		"\2\u017b|\3\2\2\2\u017c\u017d\7_\2\2\u017d~\3\2\2\2\u017e\u017f\7=\2\2"+
		"\u017f\u0080\3\2\2\2\u0180\u0181\7.\2\2\u0181\u0082\3\2\2\2\u0182\u0186"+
		"\5\u0085C\2\u0183\u0185\5\u0087D\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0084\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0189\u018a\t\7\2\2\u018a\u0086\3\2\2\2\u018b\u018c\t\b"+
		"\2\2\u018c\u0088\3\2\2\2\u018d\u018f\t\t\2\2\u018e\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0193\bE\2\2\u0193\u008a\3\2\2\2\u0194\u0195\7\61\2\2\u0195"+
		"\u0196\7\61\2\2\u0196\u019a\3\2\2\2\u0197\u0199\n\n\2\2\u0198\u0197\3"+
		"\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\bF\2\2\u019e\u008c\3\2"+
		"\2\2\24\2\u00da\u00e3\u00e6\u00ea\u00ee\u00f8\u00fe\u0100\u010d\u011b"+
		"\u0125\u012b\u0132\u0136\u0186\u0190\u019a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}