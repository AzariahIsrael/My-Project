package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Address;
import com.pom.Carrier;
import com.pom.Checkout;
import com.pom.Cheque;
import com.pom.Choose_Women;
import com.pom.Column;
import com.pom.Final_Submit;
import com.pom.Home_Page;
import com.pom.Image_Option;
import com.pom.Login_Page;
import com.pom.Proceed;
import com.pom.Signin_Btn;
import com.pom.Submit_Option;

public class Page_Object_Manager {


	public WebDriver driver;
		
	private Home_Page mi;
	public Page_Object_Manager(WebDriver driver1) {
		
	}
	public Home_Page getEmail() {
		if (mi == null) {
			mi = new Home_Page(driver);
		}
		return mi;
	}
	
	private Login_Page Login;
	public Login_Page getPassword() {
		if (Login == null) {
			Login = new Login_Page(driver);
		}
		return Login;
	}

	private Signin_Btn Signin;
	public Signin_Btn getSignin_Btn() {
		if (Signin == null) {
			Signin = new Signin_Btn(driver);
		}
		return Signin;		
	}
	
	private Choose_Women Women;
	public Choose_Women getWomen() {
		if (Women == null) {
			Women = new Choose_Women(driver);
		}
		return Women;
	}
	
	
	private Image_Option image;
	public Image_Option getimage() {
		if (image == null) {
			image = new Image_Option(driver);
			}
		return image;
	}
	
	private Submit_Option Submit;
	public Submit_Option getSubmit() {
		if (Submit == null) {
			Submit = new Submit_Option(driver);
					
		}
		return Submit;
	}
	private Checkout check;
	public Checkout getcheck() {
		if (check == null) {
			check = new Checkout(driver);
		}
		return check;
	}
	
	
	private Column col;
	public Column getcolumn() {
		if (col == null) {
			col = new Column(driver);
		}
		return col;
	}
	
	
	private Address add;
	public Address getAddress() {
		if (add == null) {
			add = new Address(driver);
			
		}
		return add;
	}
	private Proceed procd;
	public Proceed getProceed() {
		if (procd == null) {
			procd = new Proceed(driver);
					
		}
		return procd;
	}
	private Carrier carr;
	public Carrier getCarrier() {
		if(carr == null) {
			carr = new Carrier(driver);
		}
		return carr;
	}
	private Cheque chq;
	public Cheque getcheque() {
		if(chq == null) {
			chq = new Cheque(driver);
			
		}
		return chq;
	}
	private Final_Submit sub;

	public Object getInstancehp;
	public Final_Submit getsubmit() {
		if(sub == null) {
			sub = new Final_Submit(driver);
					
		}
		return sub;
	}
	public Login_Page getInstanceLogin() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
