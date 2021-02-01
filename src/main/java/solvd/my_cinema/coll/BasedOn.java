package solvd.my_cinema.coll;


import org.apache.log4j.Logger;



public class BasedOn extends Unreal{
	private final static Logger LOGGER = Logger.getLogger(BasedOn.class);	
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
	       LOGGER.info("Film title = "+this.getTitle());
	       LOGGER.info("Premiere date = "+this.getYear());
	       LOGGER.info("Based on "+event);

	   }
}