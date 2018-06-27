package tr.edu.ege.store_manager.wrapper.transformation.graph;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.jena.graph.NodeFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFactory;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.sparql.core.Var;
import org.apache.jena.sparql.engine.binding.Binding;
import org.apache.jena.sparql.engine.binding.BindingHashMap;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import tr.edu.ege.store_manager.wrapper.QueryIteratorWrap;
import tr.edu.ege.store_manager.wrapper.transformation.TransformerStrategy;

public class Neo4jTransformerStrategy extends TransformerStrategy {

	@Override
	public String transform(String result, List<String> variables) {
		List<Binding> bindings = new ArrayList<Binding>();
		JsonArray resultArr = new Gson().fromJson(result, JsonArray.class);

		for (JsonElement resultEl : resultArr) {
			JsonObject jsonObj = (JsonObject) resultEl;
			// JsonObject resultObj = (JsonObject) resultEl;
			BindingHashMap bindingHashMap = new BindingHashMap();
			for (String var : variables) {
				bindingHashMap.add(Var.alloc(var), NodeFactory.createLiteral(jsonObj.get(var).getAsString()));
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
