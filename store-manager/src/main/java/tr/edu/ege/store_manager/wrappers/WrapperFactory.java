package tr.edu.ege.store_manager.wrappers;

import tr.edu.ege.store_manager.wrappers.document.MongoDBWrapper;
import tr.edu.ege.store_manager.wrappers.graph.JanusWrapper;
import tr.edu.ege.store_manager.wrappers.keyvalue.RedisWrapper;

public class WrapperFactory {

	public static AbstractWrapper create(Wrappers wrapper) {
		AbstractWrapper instance = null;
		if (wrapper.equals(Wrappers.MongoDB)) {
			instance = new MongoDBWrapper();
		} else if (wrapper.equals(Wrappers.Redis)) {
			instance = new RedisWrapper();
		}else if (wrapper.equals(Wrappers.Janus)) {
			instance = new JanusWrapper();
		}
		return instance;
	}

}
