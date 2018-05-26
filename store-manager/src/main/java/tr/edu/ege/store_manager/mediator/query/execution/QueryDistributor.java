package tr.edu.ege.store_manager.mediator.query.execution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tr.edu.ege.store_manager.mediator.query.decomposition.QueryAssignment;
import tr.edu.ege.store_manager.wrapper.store.AbstractWrapper;
import tr.edu.ege.store_manager.wrapper.store.WrapperFactory;
import tr.edu.ege.store_manager.wrapper.store.Wrappers;

public class QueryDistributor {
	private Map<String, Wrappers> wrappers = new HashMap<String, Wrappers>();

	public QueryDistributor() {
		wrappers.put("mongodb", Wrappers.MongoDB);
		wrappers.put("redis", Wrappers.Redis);
		wrappers.put("janus", Wrappers.Janus);
	}

	public void distribute(List<QueryAssignment> queryAssignments) {
		for (QueryAssignment assignment : queryAssignments) {
			AbstractWrapper wrapper = WrapperFactory.create(wrappers.get(assignment.getConnection()));
			wrapper.executeTransform(assignment);
		}
	}

}
