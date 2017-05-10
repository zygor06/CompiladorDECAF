parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

// CLASS DECLARATION

classDeclaration : CLASS IDENTIFIER LBRACE classStatement RBRACE;

classStatement
    :propertyModifiers variableInitializer SEMI
    |memberModifiers? FUNCTION IDENTIFIER LPAREN parameterList RPAREN methodBody
    ;

methodBody
    :SEMI
    |blockStatement
    ;

propertyModifiers
    :memberModifiers
    |primitiveTypes
    ;

memberModifiers
    : memberModifier+
    ;

variableInitializer
    : IDENTIFIER (ASSIGN constantInititalizer)?
    ;

constantInititalizer
    : constant
    | ARRAY '(' (constantArrayItemList ','?)? ')'
    | '[' (constantArrayItemList ','?)? ']'
    | ('+'|'-') constantInititalizer
    ;

constantArrayItemList
    : constantArrayItem (',' constantArrayItem)*
    ;

constantArrayItem
    : constantInititalizer (':' constantInititalizer)?
    ;

constant
    : NULL
    | literalConstant
    ;

literalConstant
    : INTEGER_LITERAL
    | BOOLEAN_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | CHAR_LITERAL
    ;




memberModifier
    : PUBLIC
    | PROTECTED
    | PRIVATE
    | STATIC
    | ABSTRACT
    | FINAL
    ;

primitiveTypes
    : INT
    | FLOAT
    | CHAR
    | BOOLEAN
    | LONG
    | ARRAY
    ;