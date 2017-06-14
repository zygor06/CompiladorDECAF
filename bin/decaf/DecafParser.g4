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
 
program
    :   CLASS classBody
    ;
 
classBody
    :   LBRACE classBodyDeclaration* RBRACE
;

classBodyDeclaration
    :   SEMI
    |   block
    |   memberDeclaration
;


memberDeclaration
    :   methodDeclaration
    |   localVariableDeclarationStatement
;

methodDeclaration
    :   (typeType|VOID) (IDENTIFIER | MAIN) formalParameters (methodBody|SEMI)
;

methodBody
    :   block
;

formalParameters
    :   LPAREN formalParameterList? RPAREN
;

formalParameterList
    :   formalParameter (COMMA formalParameter)*
    ;

formalParameter
    :   typeType (IDENTIFIER)
;

typeType
    :    primitiveType   
    ;

primitiveType
    :   INT
    |   BOOLEAN
    ;
 


// BLOCK

block
    :   LBRACE blockStatement* RBRACE
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;



localVariableDeclarationStatement
    :    typeType variableId (COMMA variableId)* SEMI
;

variableId
    :   IDENTIFIER (LBRACK INTEGER_LITERAL RBRACK)?
    ;



statement
    :   block
    |   IF parExpression statement (ELSE statement)?
    |   FOR forControl statement
    |   WHILE parExpression statement
    |   RETURN expression? SEMI
    |   BREAK IDENTIFIER? SEMI
    |   CALLOUT LPAREN (expressionList)* RPAREN SEMI
    |   CONTINUE IDENTIFIER? SEMI
    |   SEMI
    |   statementExpression SEMI
;

forControl
    :   forInit COMMA forUpdate
;

forInit
    :   expression
    ;

forUpdate
    :   expression
;



// EXPRESSIONS

parExpression
    :   LPAREN expression RPAREN
    ;

expression
    :   primary
    |   expression (INC | DEC)
    |   (ADD|SUB|INC|DEC) expression
    |   (TILDE|EXCLAMATION) expression
    |   expression (MUL|DIV|MOD) expression
    |   expression (ADD|SUB) expression
    |   expression (LE | GE | GT | LT) expression
    |   expression EQUAL expression
    |   <assoc=right> expression ASSIGN expression
    ;

expressionList
    :   expression (COMMA expression)*
;

statementExpression
    :   expression
;

primary
    :   LPAREN expression RPAREN
    |   literal
    |   IDENTIFIER
    |   methodCall
    |   arrayCall
;

methodCall
    :   IDENTIFIER LPAREN (expressionList)? RPAREN
    ;

arrayCall
    :   IDENTIFIER LBRACK index RBRACK
    ;

index
    :   expression
    ;

literal
    :   INTEGER_LITERAL
    |   CHAR_LITERAL
    |   STRING_LITERAL
    |   BOOLEAN_LITERAL
    |   NULL_LITERAL
    ;