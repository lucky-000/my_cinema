package solvd.my_cinema;

import java.io.File;
import solvd.my_cinema.exception.MyException;
import solvd.my_cinema.functional.Creator;


public class Executor {
	public static void main(String[] args)  throws MyException{
		String separator = File.separator;
		String pathFirst = "C:" + separator + "Users"+ separator + "myrch" + separator + "eclipse-workspace" + separator + "my_cinema" + separator +  "file.txt";
		String pathSecond = "C:" + separator + "Users"+ separator + "myrch" + separator + "eclipse-workspace" + separator + "my_cinema"+ separator  + "file.properties";
		

		
		Creator creator = new Creator();
		creator.addNameYear(pathFirst,pathSecond);

//		JsonConverter jsonAction = new JsonConverter();
//		jsonAction.convertJsonStrToAnimalPOJO(jsonStr)
		
	}
}