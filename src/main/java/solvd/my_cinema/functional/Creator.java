package solvd.my_cinema.functional;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import solvd.my_cinema.cinema.HomeCinema;
import solvd.my_cinema.coll.Film;
import solvd.my_cinema.coll.Real;
import solvd.my_cinema.coll.Serials;
import solvd.my_cinema.exception.MyException;
import solvd.my_cinema.utils.JsonConverter;
import solvd.my_cinema.utils.ReadingFromFile;
import solvd.my_cinema.utils.WriteReadProperties;


public final class Creator {
	private final static Logger LOGGER = Logger.getLogger(Creator.class);
	private  int year;
	private  String name, keyProperties, valueProperties;
	HomeCinema cinema = new HomeCinema();
	
	public  Creator(){
		
	}
	
	public void addNameYear (String pathTxt, String pathProperties) throws MyException {
		boolean menu=true;
		Film serial = new Serials();
		Film movie = new Real();
		WriteReadProperties properties =new WriteReadProperties();
		int nowYear = Calendar.getInstance().get(Calendar.YEAR);

		
		
		do {
			
			System.out.println("Print number");
			System.out.println("1.Add Serial Title and year");
			System.out.println("2.Add Film Title and year");
			System.out.println("3.Delete film or serial");
			System.out.println("4.Print ArrayList");
			System.out.println("5.Add ListToFile");
			System.out.println("6.Read From File");
			System.out.println("7.Add Properties");
			System.out.println("8.Read Properties");
			System.out.println("9.Add List to Json File");
			System.out.println("10.Read from Json File to List");
			Scanner scaner = new Scanner(System.in);
			Scanner scanner = new Scanner(System.in);
			int choice = scaner.nextInt();
			switch(choice)
			{
			
			case 1:
				
				System.out.println("Enter name film, start year film ");	
				name = scanner.nextLine();
				try {
					year= scanner.nextInt();
					if(year!=0) {
					serial = new Serials(name,year);
					cinema.addFilm(serial);
					LOGGER.info("Serial added to ArrayList");
					}				
				} catch(InputMismatchException e)
				{
					LOGGER.error("--------Name and/or year are incorrect--------");
					
				} 
				break;
			case 2:
				System.out.println("Enter name film, start year film ");
				name = scanner.nextLine();
				try {
					year= scanner.nextInt();				
				} catch (InputMismatchException e) {
					LOGGER.error("--------Name and/or year are incorrect--------");
					}
				if((year>0)&(year<nowYear)&name!="") {
					movie = new Real(name,year);
					cinema.addFilm(movie);
					LOGGER.info("Movie added to ArrayList");
					}else {
						throw new MyException();
					}
				
				break;
			case 3:
				cinema.printInfo();
				System.out.println("Print number del");
				Scanner index = new Scanner(System.in);
				int indexFilm= index.nextInt();
				cinema.delFilm(indexFilm);
				cinema.printInfo();
				break;
			case 4:
				cinema.printInfo();
				break;
			case 5:
				cinema.writeFilmToFile(pathTxt);
				break;				
			case 6:
				ReadingFromFile readFile = new ReadingFromFile();
				LOGGER.info(readFile.readFromFile(pathTxt));	
				break;
			case 7:
				System.out.println("Write Key and Value Properties");
				keyProperties = scanner.nextLine();
				valueProperties = scanner.nextLine();
				properties.setPropertiesPlus(pathProperties, keyProperties, valueProperties);
				break;
			case 8:
				System.out.println("Print Key Properties");
				keyProperties = scanner.nextLine();
				String printPass = properties.getProperties(pathProperties, keyProperties);
				LOGGER.info(keyProperties +":" + printPass);
				break;
			case 9:
				cinema.addCinemaToJson();
				break;
			case 10:
				ReadingFromFile valueFile = new ReadingFromFile();
				LOGGER.info(valueFile.readFromFile("file.json"));
				String value = valueFile.readFromFile("file.json");
				JsonConverter jsonAction = new JsonConverter();
				Serials serial1 = jsonAction.convertJsonStrToAnimalPOJO(value);
				LOGGER.info("serial title from POJO :" + serial1.getTitle());
				LOGGER.info("serial year from POJO :" + serial1.getYear());
				LOGGER.info("serial season from POJO :" + serial1.getNseason());
				LOGGER.info("serial series from POJO :" + serial1.getNseries());
				break;
			default:
				menu=false;
				break;
				
			}	
		} while(menu);


		
	}
	
	

	
	
	
}
