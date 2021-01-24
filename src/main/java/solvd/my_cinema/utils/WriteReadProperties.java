package solvd.my_cinema.utils;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class WriteReadProperties {
	public String getProperties(String path, String key) {

		Properties properties = new Properties();
		FileInputStream file = null;
		try {
			file = new FileInputStream(path);
			properties.load(file);
			file.close();
			return properties.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "default";
	}

	public void setProperties(String path, String key, String value) {

		Properties properties = new Properties();

		try {
			FileOutputStream file = new FileOutputStream(path);
			properties.setProperty(key, value);
			properties.store(file, "");
			file.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	public void setPropertiesPlus(String path, String key, String value) {
		Properties properties = new Properties();	
		try {
			PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
			properties.setProperty(key, value);
			properties.store(file, "");
			file.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
