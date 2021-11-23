package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_Practice {

	static org.apache.log4j.Logger Log = Logger.getLogger(Logger_Practice.class);
	
	public static void main(String[]args) {
		
		BasicConfigurator.configure();
		
		Log.debug("Debug");
		
		Log.info("Information");
		
		Log.warn("Warning");
		
		Log.error("Error");
		
		Log.fatal("Fatal");
		
		
	
		
		
		
		
	}
	
	
}
