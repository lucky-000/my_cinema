package solvd.my_cinema.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
public String  readFromFile(String path) {
		
		
		File file = new File(path);
		
		Scanner scanner = null;

		try {

			scanner = new Scanner(file);
			
			return scanner.nextLine();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} finally {
			scanner.close();
		}
		
		return "default";
		
	}
}
