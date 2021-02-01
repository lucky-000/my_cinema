package solvd.my_cinema.cinema;

import solvd.my_cinema.coll.Film;
import solvd.my_cinema.utils.JsonConverter;
import solvd.my_cinema.utils.WritingToFile;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

public final class HomeCinema extends Cinema {
	private String adress;
	private final static Logger LOGGER = Logger.getLogger(HomeCinema.class);
	

	List<Film> content;
	Set<Film> uniqContent;
	
	public HomeCinema() {
		content = new ArrayList<Film>();
		uniqContent = new HashSet<Film>();
	}

	public HomeCinema(String title) {
		super(title);
		content = new ArrayList<Film>();
		uniqContent = new HashSet<Film>();

	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}
	public void addFilm(Film film) {
		content.add(film);
		LOGGER.info("Added to ArrayList");

	}
	public void addUniqFilm(Film film) {
		uniqContent.add(film);

	}
	public void printSpectator() {
		LOGGER.info("family");
	}
	
	public final void printFields(){
		LOGGER.info("Title cinema = " + getTitle());
		LOGGER.info("URL Online Cinema = " + adress);
	       
	       
	   }
	public void delFilm(int k) {
		content.remove(k);
		LOGGER.info("Deleted with ArrayList");
	}
	
	
	@Override
	public void printInfo() {
		int index=0;
		for (Film film :content) {
			
			System.out.println(index + "." + film.toString());
			index++;
		}
		LOGGER.info(content);
	}
	
	public void writeFilmToFile(String path) {
		WritingToFile write = new WritingToFile();
		for(Film film : content) {
			
		write.writeToFile(path,film.toString());
			}
		LOGGER.info("Added to File");
	}
	public void printInfoHash() {
		
		for (Film film :uniqContent) {
			LOGGER.info(film.toString());
			
		}
	}
	public void addCinemaToJson() {
		JsonConverter jsonAction = new JsonConverter();
		jsonAction.convertJavaToJsonFile(content, "cinema.json");
		

	}
}
