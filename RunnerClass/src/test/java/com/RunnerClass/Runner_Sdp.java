package com.RunnerClass;

	import java.awt.AWTException;
	import java.io.File;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.Baseclass.Base_Class;
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
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

	public class Runner_Sdp extends Base_Class {

		
			private static final WebDriver driver = null;

			public static WebDriver driver1 = Base_Class.getBrowser("Chrome");

			public static Page_Object_Manager pom = new Page_Object_Manager(driver1);
			
			public static void main(String[]args) throws Throwable {	
			
				String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
			
				getURL(url); 
				
				clickonElement(((Signin_Btn) pom.getInstancehp).getSignin_Btn());
			
//			getUrl("http://automationpractice.com/");

			maximize();
			
			String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
			inputValueElement(pom.getInstanceLogin().getEmail(), username);
			
			String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
			inputValueElement(pom.getInstanceLogin().getPassword(), password);
				
			
			clickonElement(pom.getSignin_Btn().getSignin_Btn());
			
//			inputValueElement(pom.getEmail(), "azariah.israel46@gmail.com");
			
//			inputvalueElement(pom.getPassword().getPassword(), "Azariah@46");

			clickonElement(pom.getSignin_Btn().getSignin_Btn);
			
			clickonElement(pom.getWomen().getWomen);
			
			clickonElement(pom.getimage().getimage);
			
			clickonElement(pom.getSubmit().getSubmit);
			
			clickonElement(pom.getcheck().getcheck);
			
			clickonElement(pom.getcolumn().getcolumn);
			
			clickonElement(pom.getAddress().getAddress);
			
			clickonElement(pom.getProceed().getProceed);
			
			clickonElement(pom.getCarrier().getCarrier);
			
			clickonElement(pom.getcheque().getcheque);
			
			clickonElement(pom.getsubmit().getsubmit);
			
			takeScreenShot();

}
			private static void getURL(String url) {
				// TODO Auto-generated method stub
				
			}
			private static void maximize() {
				// TODO Auto-generated method stub
				
			}
			private static void takeScreenShot() {
				// TODO Auto-generated method stub
				
			}
			private static void inputValueElement(Object object, String string) {
				// TODO Auto-generated method stub
				
			}
			private static void clickonElement(Object signin_Btn) {
				// TODO Auto-generated method stub
				
			}
			private void getUrl(String string) {
				// TODO Auto-generated method stub
				
			}
			
			}

			