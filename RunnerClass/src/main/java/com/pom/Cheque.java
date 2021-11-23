package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cheque {

	public Cheque(WebDriver driver1) {

	}

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement cheque;
	public Object getcheque;
	
	
}
