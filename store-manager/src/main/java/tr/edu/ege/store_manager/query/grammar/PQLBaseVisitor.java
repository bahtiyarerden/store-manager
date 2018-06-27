// Generated from PQL.g4 by ANTLR 4.3
package tr.edu.ege.store_manager.query.grammar;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import tr.edu.ege.store_manager.mediator.query.decomposition.QueryAssignment;
import tr.edu.ege.store_manager.query.grammar.PQLParser.Result_columnContext;
import tr.edu.ege.store_manager.query.grammar.PQLParser.Subquery_stmtContext;

/**
 * This class provides an empty implementation of {@link PQLVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class PQLBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements PQLVisitor<T> {
	private List<QueryAssignment> assignments = new ArrayList<QueryAssignment>();

	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitError_message(@NotNull PQLParser.Error_messageContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSubjoin_stmt(@NotNull PQLParser.Subjoin_stmtContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDatabase_name(@NotNull PQLParser.Database_nameContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitJoin_pointer(@NotNull PQLParser.Join_pointerContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResult_column(@NotNull PQLParser.Result_columnContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParse(@NotNull PQLParser.ParseContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitError(@NotNull PQLParser.ErrorContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSubquery_stmt(@NotNull PQLParser.Subquery_stmtContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTable_name(@NotNull PQLParser.Table_nameContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAny_name(@NotNull PQLParser.Any_nameContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAlias(@NotNull PQLParser.AliasContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSub_query_content(@NotNull PQLParser.Sub_query_contentContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSql_stmt(@NotNull PQLParser.Sql_stmtContext ctx) {
		for (Subquery_stmtContext subQueryStmt : ctx.select_stmt().subquery_stmt()) {
			QueryAssignment queryAssignment = new QueryAssignment();
			List<String> resultColumns = new ArrayList<String>();
			String subQuery = subQueryStmt.sub_query().getText().substring(1, subQueryStmt.sub_query().getText().length()-1);
			queryAssignment.setQuery(subQuery);
			queryAssignment.setConnection(subQueryStmt.database_name().getText());
			queryAssignment.setQueryAlias(subQueryStmt.alias().getText());
			for (Result_columnContext resultColumn : ctx.select_stmt().result_column()) {
				if (subQueryStmt.alias().getText().trim().equals(resultColumn.alias().getText().trim())) {
					resultColumns.add(resultColumn.join_variable().getText());
				}
			}
			queryAssignment.setResultColumns(resultColumns);

			assignments.add(queryAssignment);
		}
		return visitChildren(ctx);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T visit(ParseTree tree) {
		super.visit(tree);
		return (T) assignments;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSelect_stmt(@NotNull PQLParser.Select_stmtContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSub_query(@NotNull PQLParser.Sub_queryContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitJoin_variable(@NotNull PQLParser.Join_variableContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitKeyword(@NotNull PQLParser.KeywordContext ctx) { return visitChildren(ctx); }
}