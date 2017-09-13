package tr.edu.ege.store_manager.wrappers;

import static org.junit.Assert.*;

import org.junit.Test;

import tr.edu.ege.store_manager.store.JanusStore;

public class GarbageTest {

	@Test
	public void connectJanus() throws Exception {
		JanusStore instance = JanusStore.getInstance();
		instance.close();
	}

}
