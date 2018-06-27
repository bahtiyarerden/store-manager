package tr.edu.ege.store_manager.mediator.query.execution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import tr.edu.ege.store_manager.mediator.query.decomposition.QueryAssignment;
import tr.edu.ege.store_manager.wrapper.store.AbstractWrapper;
import tr.edu.ege.store_manager.wrapper.store.WrapperFactory;
import tr.edu.ege.store_manager.wrapper.store.Wrappers;

public class QueryDistributor {
	private Map<String, Wrappers> wrappers = new HashMap<String, Wrappers>();

	public QueryDistributor() {
		wrappers.put("mongodb", Wrappers.MongoDB);
		wrappers.put("redis", Wrappers.Redis);
		wrappers.put("neo4j", Wrappers.Neo4j);
	}

	public String distribute(List<QueryAssignment> queryAssignments) {
		JsonArray resultArr = new JsonArray();
		for (QueryAssignment assignment : queryAssignments) {
			System.out.println(assignment);
			AbstractWrapper wrapper = WrapperFactory.create(wrappers.get(assignment.getConnection()));
			resultArr.add(new Gson().fromJson(wrapper.executeTransform(assignment), JsonObject.class));
		}
		return resultArr.toString();
	}

}
