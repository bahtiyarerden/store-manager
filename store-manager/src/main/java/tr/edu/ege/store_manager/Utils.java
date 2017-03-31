package tr.edu.ege.store_manager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {

	public static String readSchema(String schema) {
		ClassLoader classLoader = new Utils().getClass().getClassLoader();
		try {
			String filePath = classLoader.getResource(schema).getFile();
			byte[] bytes = Files.readAllBytes(Paths.get(filePath));
			return new String(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
