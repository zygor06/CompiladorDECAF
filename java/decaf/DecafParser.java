// Generated from /home/hygor/Downloads/compilador/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
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
		WS=51, SINGLE_LINE_COMMENT=52, ID=53;
	public static final int
		RULE_program = 0;
	public static final String[] ruleNames = {
		"program"
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
		"COMMA", "IDENTIFIER", "WS", "SINGLE_LINE_COMMENT", "ID"
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

	@Override
	public String getGrammarFileName() { return "DecafParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode TK_class() { return getToken(DecafParser.TK_class, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public TerminalNode EOF() { return getToken(DecafParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(TK_class);
			setState(3);
			match(ID);
			setState(4);
			match(LCURLY);
			setState(5);
			match(RCURLY);
			setState(6);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\13\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\t\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\67"+
		"\2\2\6\7\7\4\2\2\7\b\7\5\2\2\b\t\7\2\2\3\t\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}