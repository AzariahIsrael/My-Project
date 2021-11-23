	package com.RunnerClass;

	import java.awt.AWTException; 
	import java.io.File;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

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
import com.sdp.Page_Object_Manager;

	public class Runner_Class extends Base_Class {

		
			private static final WebDriver driver = null;

			public static WebDriver driver1 = Base_Class.getBrowser("Chrome");

			public static Home_Page mi = new Home_Page(driver1);
			
			public static Login_Page Login = new Login_Page(driver1);
			
			public static Signin_Btn Signin = new Signin_Btn(driver1);
			
			public static Choose_Women Women = new Choose_Women(driver1);
			
			public static Image_Option image = new Image_Option(driver1);
			
			public static Submit_Option Submit = new Submit_Option(driver1);
			
			public static Checkout check = new Checkout(driver1);
			
			public static Column col = new Column(driver1);
			
			public static Address add = new Address(driver1);
			
			public static Proceed procd = new Proceed(driver1);
			
			public static Carrier carr = new Carrier(driver1);
			
			public static Cheque chq = new Cheque(driver1);
			
			public static Final_Submit sub = new Final_Submit(driver1);
					
			
//			public static void main(String[]args) 
			{
				
					getUrl("http://automationpractice.com/");

					maximize();
					
					clickonElement(mi.getSignin_Btn());
					
					inputvalueElement(Login.getEmail(), "azariah.israel46@gmail.com");
					
					inputvalueElement(Login.getPassword(), "Azariah@46");

					clickonElement(Signin.getSignin_Btn);
					
					clickonElement(Women.getWomen);
					
					clickonElement(image.getimage);
					
					clickonElement(Submit.getSubmit);
					
					clickonElement(check.getcheck);
					
					clickonElement(col.getcolumn);
					
					clickonElement(add.getAddress);
					
					clickonElement(procd.getProceed);
					
					clickonElement(carr.getCarrier);
					
					clickonElement(chq.getcheque);
					
					clickonElement(sub.getsubmit);
					
					takeScreenShot();
					
						
					
			}

			private static void getUrl(String string) {
				// TODO Auto-generated method stub
				
			}

			private void maximize() {
				// TODO Auto-generated method stub
				
			}

			private static void inputvalueElement(Object email, String string) {
				// TODO Auto-generated method stub
				
			}

			private static void clickonElement(Object getSignin_Btn) {
				// TODO Auto-generated method stub
				
			}

			private static void takeScreenShot() {
				
				
			}					
				

}
