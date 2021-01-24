package solvd.my_cinema.coll;



public class Real extends FeatureFilm{

	private String event;
	
	public Real() {
		
	}
	
	public Real(String title, int year) {
		super(title,year);
	}

	public void setEvent(String event) {
		this.event=event;
	}
	public String getEvent() {
		return event;
	}
	


	public String toString() {
		return "Real Film:"+ this.getTitle() +this.getYear();
	}
}
