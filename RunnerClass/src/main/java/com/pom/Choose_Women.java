package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Choose_Women {

	
	public Choose_Women(WebDriver driver1) {
		
	}

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement Women;
	public Object getWomen;

}
