package tr.edu.ege.store_manager.wrapper.transformation.document;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.jena.graph.NodeFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFactory;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.sparql.core.Var;
import org.apache.jena.sparql.engine.binding.Binding;
import org.apache.jena.sparql.engine.binding.BindingHashMap;
import org.apache.jena.sparql.resultset.JSONOutput;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.util.JSON;

import tr.edu.ege.store_manager.wrapper.QueryIteratorWrap;
import tr.edu.ege.store_manager.wrapper.transformation.TransformerStrategy;

public class MongoDBTransformerStrategy extends TransformerStrategy {

	@Override
	public String transform(String result, List<String> variables) {
		BasicDBList list = (BasicDBList) JSON.parse(result);
		List<Binding> bindings = new ArrayList<Binding>();

		for (Object object : list) {
			BasicDBObject document = (BasicDBObject) object;
			BindingHashMap bindingHashMap = new BindingHashMap();
			for (String var : variables) {
				bindingHashMap.add(Var.alloc(var), NodeFactory.createLiteral(document.getString(var)));
			}
			bindings.add(bindingHashMap);
		}

		QueryIteratorWrap iteratorWrap = new QueryIteratorWrap(bindings);
		ResultSet resultSet = ResultSetFactory.create(iteratorWrap, variables);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ResultSetFormatter.outputAsJSON(outputStream, resultSet);

		return new String(outputStream.toByteArray());
	}

}
