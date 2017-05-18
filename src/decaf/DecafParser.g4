parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

// Class Definition :: Parser

classDeclaration
    :   CLASS IDENTIFIER classBody;

classBody
    :   LBRACE classBodyDeclaration* RBRACE;

classBodyDeclaration
    :   SEMI
    |   block
    |   memberDeclaration
    ;

memberDeclaration
    :   methodDeclaration
    |   classDeclaration
    ;

methodDeclaration
    :   FUNCTION IDENTIFIER formalParameters (methodBody|COMMA)
    ;


variableDeclarators
    :   variableDeclarator (COMMA variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId (ASSIGN variableInitializer)?
    ;

variableDeclaratorId
    :   IDENTIFIER (LBRACK RBRACK)*
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   LBRACE (variableInitializer (COMMA variableInitializer)* (COMMA)? )? RBRACE
    ;

typeType
    :   classType (LBRACK RBRACK)*
    |   primitiveType (LBRACK RBRACK)*
    ;

classType
    :   IDENTIFIER
    ;

primitiveType
    :   BOOLEAN
    |   CHAR
    |   BYTE
    |   INT
    |   LONG
    |   FLOAT
    |   DOUBLE
    |   ARRAY
    ;



formalParameters
    :   LPAREN formalParameterList? RPAREN
    ;

formalParameterList
    :   formalParameter (COMMA formalParameter)*
    ;

formalParameter
    :   typeType variableDeclaratorId
    ;

methodBody
    :   block
    ;

// DECLARAÇÕES

block
    :   LBRACE blockStatement* RBRACE
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration COMMA
    ;

localVariableDeclaration
    :   typeType variableDeclarators
    ;

statement
    :   block
    |   IF parExpression statement (ELSE statement)?
    |   FOR LPAREN forControl RPAREN statement
    |   WHILE parExpression statement
    |   DO statement WHILE parExpression SEMI
    |   RETURN expression? SEMI
    |   BREAK IDENTIFIER? SEMI
    |   CONTINUE IDENTIFIER? SEMI
    |   SEMI
    |   statementExpression SEMI
    //|   Identifier COLON statement
    ;

forControl
    :   enhancedForControl
    |   forInit? SEMI expression? SEMI forUpdate?
    ;

forInit
    :   localVariableDeclaration
    ;

enhancedForControl
    :   typeType variableDeclaratorId COLON expression
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSÕES


parExpression
    :   LPAREN expressionList RPAREN
    ;

expressionList
    :   expression (COMMA expression)*
    ;

statementExpression
    :   expression
    ;

expression
    :   expression DOT IDENTIFIER
    |   expression DOT THIS
    |   expression LBRACK expression RBRACK
    |   expression LPAREN expressionList? LPAREN
    |   PAREN typeType PAREN expression
    |   expression (INC | DEC)
    |   (ADD|SUB|INC|DEC) expression
    |   (TILDE|EXCLAMATION) expression
    |   expression (MUL|DIV|MOD) expression
    |   expression (ADD|SUB) expression
    |   expression (LT LT | GT GT GT | GT GT) expression
    |   expression (LE | GE | GT | LT) expression
    |   expression (EQUAL | NOT_EQUAL) expression
    |   expression BIT_AND
    |   expression BIT_XORexpression expression
    |   expression BIT_OR expression
    |   expression AND expression
    |   expression OR expression
    |   expression QUESTION expression COLON expression
    |   <assoc=right> expression
        (   ASSIGN
        |   ADD_ASSIGN
        |   SUB_ASSIGN
        |   MUL_ASSIGN
        |   DIV_ASSIGN
        |   AND_ASSIGN
        |   OR_ASSIGN
        |   XOR_ASSIGN
        |   MOD_ASSIGN
        )
        expression
    ;

creator
    :   arrayCreator
    ;

arrayCreator
    :   LBRACK
        (   RBRACK (LBRACK RBRACK)* arrayInitializer
        |   expression RBRACK (LBRACK expression RBRACK)* (LBRACK RBRACK)*
        )
    ;

