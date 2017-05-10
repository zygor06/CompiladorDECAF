lexer grammar DecafLexer;

@header {
package decaf;
}

options
{
  language=Java;
}

tokens
{
  TK_class
}

//Separators

//LCURLY : '{';
//RCURLY : '}';

// DECAF Grammar LEXER

// Keywords

BOOLEAN       : 'boolean';
BREAK         : 'break';
CALLOUT       : 'callout';
CLASS         : 'class';
CONTINUE      : 'continue';
DO 			  : 'do';
ELSE          : 'else';
FOR           : 'for';
IF            : 'if';
RETURN        : 'return';
VOID          : 'void';
WHILE         : 'while';


//Integer literals

INTEGER_LITERAL : 
		DECIMAL_INTEGER_LITERAL |
		HEX_INTEGER_LITERAL |
		OCTAL_INTEGER_LITERAL ;

fragment
DECIMAL_INTEGER_LITERAL : DECIMAL_NUMERAL;

fragment
DECIMAL_NUMERAL : '0' |	NON_ZERO_DIGIT (DIGITS)*;

fragment
DIGITS : DIGIT (DIGIT)? ;

fragment
DIGIT : '0' | NON_ZERO_DIGIT;

fragment
NON_ZERO_DIGIT : [1-9];

fragment
HEX_INTEGER_LITERAL : HEX_NUMERAL;

fragment
HEX_NUMERAL: '0x' (HEX_DIGIT)+ | 'OX' (HEX_DIGIT)+;

fragment
HEX_DIGIT : [0-9a-fA-F];

fragment
OCTAL_INTEGER_LITERAL : OCTAL_NUMERAL;

fragment
OCTAL_NUMERAL : '0' OCTAL_DIGITS;

fragment
OCTAL_DIGITS : OCTAL_DIGIT (OCTAL_DIGIT)* ;

fragment
OCTAL_DIGIT : [0-7];


// Boolean Literal

BOOLEAN_LITERAL : 'true' | 'false';


// Character literals


CHAR_LITERAL : '\'' SINGLE_CHARACTER '\'' | '\'' ESCAPE_SEQUENCE '\'';

fragment
SINGLE_CHARACTER : ~["'\\];

//String Literals

STRING_LITERAL : '"' STRING_CHARACTERS? '"';

fragment 
STRING_CHARACTERS : STRING_CHARACTER+ ;

fragment
STRING_CHARACTER : ~['"\\] | ESCAPE_SEQUENCE;

// Escape Sequences for char and strings

fragment
ESCAPE_SEQUENCE : '\\' [tnfr"'\\];


//NULL

NULL_LITERAL : 'null';


// Operators

ASSIGN          : '='  ;
GT              : '>'  ;
LT              : '<'  ;
TILDE           : '~'  ;
QUESTION        : '?'  ;
COLON           : ':'  ;
EQUAL           : '==' ;
LE              : '<=' ;
GE              : '>=' ;
NOT_EQUAL       : '!=' ;
AND             : '&&' ;
OR              : '||' ;
INC             : '++' ;
DEC             : '--' ;
ADD             : '+'  ;
SUB             : '-'  ;
MUL             : '*'  ;
DIV             : '/'  ;
BIT_AND         : '&'  ;
BIT_OR          : '|'  ;
MOD             : '%'  ;

// Separators

LPAREN          : '('  ;
RPAREN          : ')'  ;
LBRACE          : '{'  ;
RBRACE          : '}'  ;
LBRACK          : '['  ;
RBRACK          : ']'  ;
SEMI            : ';'  ;
COMMA           : ','  ;

// Modifiers


PUBLIC      : 'public';
PROTECTED   : 'protected';
PRIVATE     : 'private';
STATIC      : 'static';
ABSTRACT    : 'abstract';
FINAL       : 'final';

// Primitive Types


INT         : 'int';
FLOAT       : 'float';
CHAR        : 'char';
BOOLEAN     : 'boolean';
LONG        : 'long';
ARRAY       : 'array';

// Identifiers

IDENTIFIER : DECAF_LETTER DECAF_LETTER_OR_DIGIT*;

fragment
DECAF_LETTER : [a-zA-Z_];

fragment
DECAF_LETTER_OR_DIGIT: [a-zA-Z0-9_];

//Whitespaces and comments 

WS  :  [ \t\r\n\u000C]+ -> skip;

SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip;