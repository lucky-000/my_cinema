package solvd.my_cinema.coll;



public class BasedOn extends Unreal{
	
	private String event;
	
	public BasedOn() {
		
	}
	
	public BasedOn(String title, int year) {
	super(title,year);
	}
//--------------------------------------------	
	
//------------------------------------------	
	public void setEvent(String event) {
		this.event=event;
	}
	public String getEvent() {
		return event;
	}
	
//---------------------------------------------
	   public void printFields(){
	       System.out.println("Film title = "+this.getTitle());
	       System.out.println("Premiere date = "+this.getYear());
	       System.out.println("Based on "+event);

	   }
}