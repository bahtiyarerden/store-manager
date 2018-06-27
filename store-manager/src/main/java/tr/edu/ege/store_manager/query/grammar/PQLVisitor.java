// Generated from PQL.g4 by ANTLR 4.3
package tr.edu.ege.store_manager.query.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(@NotNull PQLParser.Error_messageContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#subjoin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubjoin_stmt(@NotNull PQLParser.Subjoin_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(@NotNull PQLParser.Database_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#join_pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_pointer(@NotNull PQLParser.Join_pointerContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(@NotNull PQLParser.Result_columnContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull PQLParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(@NotNull PQLParser.ErrorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#subquery_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_stmt(@NotNull PQLParser.Subquery_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull PQLParser.Table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(@NotNull PQLParser.Any_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(@NotNull PQLParser.AliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#sub_query_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_query_content(@NotNull PQLParser.Sub_query_contentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(@NotNull PQLParser.Sql_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull PQLParser.Select_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#sub_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_query(@NotNull PQLParser.Sub_queryContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#join_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_variable(@NotNull PQLParser.Join_variableContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull PQLParser.KeywordContext ctx);
}