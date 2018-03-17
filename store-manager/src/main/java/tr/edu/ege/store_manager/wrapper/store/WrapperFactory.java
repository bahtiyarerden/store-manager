package tr.edu.ege.store_manager.wrapper.store;

import tr.edu.ege.store_manager.wrapper.store.document.MongoDBWrapper;
import tr.edu.ege.store_manager.wrapper.store.graph.JanusWrapper;
import tr.edu.ege.store_manager.wrapper.store.keyvalue.RedisWrapper;

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
