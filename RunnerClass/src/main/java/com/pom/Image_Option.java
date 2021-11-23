package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Image_Option {

	public Image_Option(WebDriver driver1) {
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//img[@itemprop='image'][1]")
	private WebElement image;

	public Object getimage;
	
}
