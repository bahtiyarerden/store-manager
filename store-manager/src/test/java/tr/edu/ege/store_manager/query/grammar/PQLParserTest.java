package tr.edu.ege.store_manager.query.grammar;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.junit.Test;

import tr.edu.ege.store_manager.mediator.query.decomposition.QueryAssignment;
import tr.edu.ege.store_manager.query.grammar.PQLParser.ParseContext;

public class PQLParserTest {

	@Test
	public void includesOneSubQuery() throws Exception {
		InputStream query = new ByteArrayInputStream(
				"SELECT query.v1, ysd.v2 FROM { [x]#y as query} JOIN { query.v1 = ysd.v2}".getBytes());
		CharStream charStream = new ANTLRInputStream(query);
		PQLLexer pqlLexer = new PQLLexer(charStream);
		PQLParser pqlParser = new PQLParser(new CommonTokenStream(pqlLexer));
		ParseContext context = pqlParser.parse();

		PQLBaseVisitor<List<QueryAssignment>> visitor = new PQLBaseVisitor<List<QueryAssignment>>();
		List<QueryAssignment> visit = visitor.visit(context);

		visit.forEach(x -> System.out.println(x.toString()));

	}

	@Test
	public void includesMultipleSubQuery() throws Exception {
		InputStream query = new ByteArrayInputStream("SELECT  q1.v1, q2.v2 FROM { [x]#y as q1, [z]#t as q2 }".getBytes());
		CharStream charStream = new ANTLRInputStream(query);
		PQLLexer pqlLexer = new PQLLexer(charStream);
		PQLParser pqlParser = new PQLParser(new CommonTokenStream(pqlLexer));
		ParseContext context = pqlParser.parse();

		PQLBaseVisitor<List<QueryAssignment>> visitor = new PQLBaseVisitor<List<QueryAssignment>>();
		List<QueryAssignment> visit = visitor.visit(context);
		
		visit.forEach(x -> System.out.println(x.toString()));
	}

	@Test(expected = RuntimeException.class)
	public void wrongGrammer() throws Exception {
		InputStream query = new ByteArrayInputStream("SELECT * FROM { [x]#y, [z]#t  }".getBytes());
		CharStream charStream = new ANTLRInputStream(query);
		PQLLexer pqlLexer = new PQLLexer(charStream);
		PQLParser pqlParser = new PQLParser(new CommonTokenStream(pqlLexer));
		pqlParser.parse();
	}
}
