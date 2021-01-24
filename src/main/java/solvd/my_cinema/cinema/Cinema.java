package solvd.my_cinema.cinema;

public abstract class Cinema {
	private String title;
	public Cinema() {
		title="default name cinema";
	}
	public Cinema(String title) {
		this.title=title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void printFields(){
	       System.out.println("Cinema Title = " + title);

	   }
	public void printSpectator() {
		
		
	}
	
	public abstract void printInfo();
}
