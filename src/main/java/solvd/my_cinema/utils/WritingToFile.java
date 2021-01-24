package solvd.my_cinema.utils;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class WritingToFile {
	public void writeToFile(String path, String value) {
		try {
			PrintWriter printWrite = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
			printWrite.println(value);
			printWrite.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
