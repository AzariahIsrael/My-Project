package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {

	public Checkout(WebDriver driver1) {
		
	}

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement Checkout;
	
	public Object getcheck;
	
	
}
