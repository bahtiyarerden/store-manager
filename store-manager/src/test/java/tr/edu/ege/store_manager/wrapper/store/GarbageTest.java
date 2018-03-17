package tr.edu.ege.store_manager.wrapper.store;

import static org.junit.Assert.*;

import org.junit.Test;

import tr.edu.ege.store_manager.wrapper.store.interfaces.JanusStore;

public class GarbageTest {

	@Test
	public void connectJanus() throws Exception {
		JanusStore instance = JanusStore.getInstance();
		instance.close();
	}

}
