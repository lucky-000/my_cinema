package solvd.my_cinema.cinema;

import solvd.my_cinema.coll.Film;
import solvd.my_cinema.utils.WritingToFile;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class HomeCinema extends Cinema {
	private String adress;
	

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

	}
	public void addUniqFilm(Film film) {
		uniqContent.add(film);

	}
	public void printSpectator() {
		System.out.println("family");
	}
	
	public final void printFields(){
		System.out.println("Title cinema = " + getTitle());
	       System.out.println("URL Online Cinema = " + adress);
	       
	       
	   }
	public void delFilm(int k) {
		content.remove(k);
	}
	
	
	@Override
	public void printInfo() {
		int index=0;
		for (Film film :content) {
			System.out.println(index + "." + film.toString());
			index++;
		}
	}
	public void writeFile(String path) {
		
		try {
			FileWriter writer = new FileWriter(path);
		for(Film film : content) {

		writer.write( film.toString() );
		}
		writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeFilmToFile(String path) {
		WritingToFile write = new WritingToFile();
		for(Film film : content) {
			
		write.writeToFile("src/com/lucky/film/file.txt",film.toString());
			}
	}
	public void printInfoHash() {
		
		for (Film film :uniqContent) {
			System.out.println( film.toString());
			
		}
	}
}
