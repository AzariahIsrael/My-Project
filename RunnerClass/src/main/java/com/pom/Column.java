package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Column {

	public Column(WebDriver driver1) {
		
	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement column;
	public Object getcolumn;
	
}
