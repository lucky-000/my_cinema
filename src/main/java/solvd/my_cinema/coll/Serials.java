package solvd.my_cinema.coll;

import org.apache.log4j.Logger;

public class Serials implements Film{
	private final static Logger LOGGER = Logger.getLogger(Serials.class);
	
	private String title;
	private int year;
	private int nseason;
	private int nseries;
	
	public Serials() {
		
	}
	
	public Serials(String title, int year) {
		this.title=title;
		this.year=year;
	}
//--------------------------------------------	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
//-----------------------------------------	
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
		return year;
	}
//------------------------------------------	
	public void setNseason(int nseason) {
		this.nseason=nseason;
	}
	public int getNseason() {
		return nseason;
	}
//	---------------------------------------
	
	public void setNseries(int nseries) {
		this.nseries=nseries;
	}
	public int getNseries() {
		return nseries;
	}
//---------------------------------------------
	   public void printFields(){
		   LOGGER.info("Film title = "+title);
		   LOGGER.info("Premiere date = "+year);
		   LOGGER.info("Number of season = "+nseason);
		   LOGGER.info("Number of series = "+nseries);
	   }

	
	public void printTitle() {
		LOGGER.info("Film title = "+title);
		LOGGER.info("Premiere date = "+year);
		
	}

	@Override
	public String toString() {
		return "Serial:"+ this.title +this.year;
	}
	
}
