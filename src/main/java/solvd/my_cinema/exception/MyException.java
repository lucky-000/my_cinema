package solvd.my_cinema.exception;

import org.apache.log4j.Logger;


public class MyException extends Exception{
	private final static Logger LOGGER = Logger.getLogger(MyException.class);
	
	public MyException() {
		super();
		LOGGER.error("--------Name and/or year are incorrect--------");
		
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		LOGGER.error("--------Name and/or year are incorrect--------");
			// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}