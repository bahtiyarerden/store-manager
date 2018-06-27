package tr.edu.ege.store_manager.mediator.query.decomposition;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import tr.edu.ege.store_manager.mediator.query.execution.QueryDistributor;
import tr.edu.ege.store_manager.query.grammar.PQLBaseVisitor;
import tr.edu.ege.store_manager.query.grammar.PQLLexer;
import tr.edu.ege.store_manager.query.grammar.PQLParser;
import tr.edu.ege.store_manager.query.grammar.PQLParser.ParseContext;

public class QueryParser {

	private InputStream query;

	public QueryParser(String query) {
		this.query = new ByteArrayInputStream(query.getBytes());
	}

	public void parse() {
		try {
			CharStream charStream = new ANTLRInputStream(query);
			PQLLexer pqlLexer = new PQLLexer(charStream);
			PQLParser pqlParser = new PQLParser(new CommonTokenStream(pqlLexer));
			ParseContext context = pqlParser.parse();

			PQLBaseVisitor<List<QueryAssignment>> visitor = new PQLBaseVisitor<List<QueryAssignment>>();
			List<QueryAssignment> queryAssignments = visitor.visit(context);
			QueryDistributor qDist = new QueryDistributor();
			String result = qDist.distribute(queryAssignments);
			System.out.println(result);
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
