package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static final Properties properties = new Properties();
	static {
		try {
			FileInputStream file = new FileInputStream("src/main/resources/config.properties");
			properties.load(file);
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Returns the value of the given key
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
}