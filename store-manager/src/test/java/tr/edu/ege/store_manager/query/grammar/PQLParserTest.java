package tr.edu.ege.store_manager.query.grammar;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.junit.Test;

public class PQLParserTest {

	@Test(expected = RuntimeException.class)
	public void wrongGrammer() throws Exception {
		InputStream query = new ByteArrayInputStream("SELECT * FROM { [ksddsmfldm]@akldmasl }".getBytes());
		CharStream charStream = new ANTLRInputStream(query);
		PQLLexer pqlLexer = new PQLLexer(charStream);
		PQLParser pqlParser = new PQLParser(new CommonTokenStream(pqlLexer));
		pqlParser.parse();
	}
}
