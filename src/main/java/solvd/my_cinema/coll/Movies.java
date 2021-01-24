package solvd.my_cinema.coll;



public class Movies implements Film {

	private String title;
	private int year;
	
	public Movies() {
		
	}
	public Movies(String title, int year) {
		this.title=title;
		this.year=year;
	}
	
	
	public void printTitle() {
		// TODO Auto-generated method stub
		
	}
	public void setTitle(String title) {
		this.title=title;
	}

	public void setYear(int year) {
		this.year=year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}


}
