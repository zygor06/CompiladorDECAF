// Generated from /home/aluno/compilador/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DecafParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DecafParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(DecafParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(DecafParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(DecafParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(DecafParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(DecafParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(DecafParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(DecafParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(DecafParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(DecafParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(DecafParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(DecafParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(DecafParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(DecafParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(DecafParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(DecafParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(DecafParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(DecafParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(DecafParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DecafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(DecafParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(DecafParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(DecafParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(DecafParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#variableId}.
	 * @param ctx the parse tree
	 */
	void enterVariableId(DecafParser.VariableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#variableId}.
	 * @param ctx the parse tree
	 */
	void exitVariableId(DecafParser.VariableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DecafParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DecafParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(DecafParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(DecafParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(DecafParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(DecafParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(DecafParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(DecafParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(DecafParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(DecafParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DecafParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DecafParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(DecafParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(DecafParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(DecafParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(DecafParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DecafParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DecafParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(DecafParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(DecafParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#arrayCall}.
	 * @param ctx the parse tree
	 */
	void enterArrayCall(DecafParser.ArrayCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#arrayCall}.
	 * @param ctx the parse tree
	 */
	void exitArrayCall(DecafParser.ArrayCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(DecafParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(DecafParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DecafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DecafParser.LiteralContext ctx);
}