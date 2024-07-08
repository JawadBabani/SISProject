package sis.project.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

private static Properties prop;
	
	/**
	 * This method is used to read the properties file
	 * @param filePath
	 */
	public static void readProperties(String filePath) {
		
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream(filePath);		
			prop = new Properties();
			prop.load(fis);
		
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		
		} catch (IOException e) {		
			e.printStackTrace();
		
		}			
		
	}

	/**
	 * This method is used to the value for a specific key in the properties file
	 * 
	 * @param key
	 * @return String value
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
