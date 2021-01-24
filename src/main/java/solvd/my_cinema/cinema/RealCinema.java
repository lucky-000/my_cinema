package solvd.my_cinema.cinema;

import solvd.my_cinema.coll.Movies;
import java.util.LinkedList;
import java.util.List;

public class RealCinema extends Cinema {
	private String adress;
	private String title;
	
	List<Movies> rolling;
	
	
	public RealCinema() {
		rolling = new LinkedList<Movies>();
	}

	public RealCinema(String title) {
		super(title);
		rolling = new LinkedList<Movies>();

	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}

	public String getAdress() {
		return adress;
	}
	
	public void addMovies(Movies movie) {
		rolling.add(movie);
	}
	
	public void printSpectator() {
		System.out.println("_____________");
		System.out.println("Ñinemagoers ");
		System.out.println("_____________");
	}
	public void workingCinema() {
		System.out.println("The cinema is working");
	}
	
	public void workingCinema(boolean isWorking) {
		if (isWorking) {
			System.out.println("The cinema is open from 9:00 to 23:00");
		}else {
			System.out.println("The cinema is close from 23:00 to 9:00");
		}
		
	}
	

	
	public void printFields(){
		System.out.println("Title cinema = " + title);
	       System.out.println("URL Online Cinema = " + adress);


	   }
	
	
	@Override
	public void printInfo() {
		for (Movies movie :rolling) {
			System.out.println(movie.toString());
		}


	}

}