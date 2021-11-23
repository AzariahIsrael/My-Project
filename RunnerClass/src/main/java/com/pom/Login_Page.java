package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {



	public WebDriver driver; 
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(name ="passwd")
	private WebElement passwd;
	
//	@FindBy(xpath = "//button[@id='SubmitLogin']")
//	private WebElement 	signin_Btn;

//	@FindBy(xpath = "//a[@title='Women']")
//	private WebElement Women;
//	
//	@FindBy(xpath = "//img[@itemprop='image'][1]")
//	private WebElement image;
//	
//	@FindBy(name = "Submit")
//	private WebElement Submit;
//	
//	@FindBy(xpath = "//a[@title='Proceed to checkout']")
//	private WebElement Checkout;
//	
//	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
//	private WebElement column;
	
//	@FindBy(name = "processAddress")
//	private WebElement Address;
//	
//	@FindBy(id = "cgv")
//	private WebElement Proceed;
//	
//	@FindBy(name = "processCarrier")
//	private WebElement Carrier;
//	
//	@FindBy(xpath = "//a[@class='cheque']")
//	private WebElement cheque;
//	
//	@FindBy(xpath = "(//button[@type='submit'])[2]")
//	private WebElement submit;

	public Object getimage;

	public Object getSubmit;

	public Object getcheck;
	
	
	
	
	
	
	
	public Login_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
			
}
