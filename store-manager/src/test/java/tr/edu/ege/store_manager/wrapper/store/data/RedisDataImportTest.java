package tr.edu.ege.store_manager.wrapper.store.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.Test;

import tr.edu.ege.store_manager.wrapper.store.interfaces.RedisStore;

public class RedisDataImportTest {

	private static final String FIRST_LINE_VALUE = "movieId,imdbId,tmdbId";

	@Test
	public void importData() throws Exception {
		RedisStore.getInstance().deleteRedisStore();
		// read file into stream, try-with-resources
		ClassLoader classLoader = this.getClass().getClassLoader();
		try (Stream<String> stream = Files.lines(Paths.get(classLoader.getResource("links.csv").getFile()))) {
			stream.forEach(str -> {
				if (str.equals(FIRST_LINE_VALUE))
					return; // only skips this iteration.
				String[] fields = str.split(",");
				assertNotNull(fields);
				assertTrue(fields.length == 2 || fields.length == 3);
				if (fields.length == 2) {
					RedisStore.getInstance().insertList(fields[0], fields[1]);
				} else {
					RedisStore.getInstance().insertList(fields[0], fields[1], fields[2]);
				}
			});
			assertEquals(9125, RedisStore.getInstance().getDBSize(0));
		}

	}

}
