package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin_Btn {

	
	public Signin_Btn(WebDriver driver1) {
		
	}

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement 	signin_Btn;
	public Object getSignin_Btn;
	public Object getSignin_Btn() {
		// TODO Auto-generated method stub
		return null;
	}

}
