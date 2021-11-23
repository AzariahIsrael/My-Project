package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog_Demo {

	static Logger Log = Logger.getLogger(PropertyLog_Demo.class);
	
	public static void main(String[]args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		Log.debug("Debug");
		
		Log.info("Information");
		
		Log.warn("Warning");
		
		Log.error("Error");
		
		Log.fatal("Fatal");
	}
			
			
	
}
