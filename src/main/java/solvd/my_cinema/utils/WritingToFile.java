package solvd.my_cinema.utils;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.Logger;



public class WritingToFile {
	private final static Logger LOGGER = Logger.getLogger(JsonConverter.class);
	
	public void writeToFile(String path, String value) {
		try {
			PrintWriter printWrite = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
			printWrite.println(value);
			printWrite.close();
			LOGGER.info("write to file, finished!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
