package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Carrier {

	public Carrier(WebDriver driver1) {
		
	}

	@FindBy(name = "processCarrier")
	private WebElement Carrier;
	public Object getCarrier;
	
}
