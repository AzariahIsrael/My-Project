package com.RunnerClass;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.Home_Page;
import com.pom.Login_Page;

public class Runner_Class extends Base_Class {

	
		public static WebDriver driver1 = Base_Class.getBrowser("Chrome");
		
		public static Home_Page mi = new Home_Page(driver1);
		
		public static Login_Page Login = new Login_Page(driver1);
		
		public static void main(String[]args) {
			
				getUrl("http://automationpractice.com/");
				
				clickonElement(mi.getSignin_Btn());
				
				inputvalueElement(Login.getEmail(), "azariah.israel46@gmail.com");
				
				inputvalueElement(Login.getPassword(), "Azariah@46");

				clickonElement(Login.getSignin_Btn);
				
				clickonElement(Login.getWomen);
				
				clickonElement(Login.getimage);
				
				clickonElement(Login.getSubmit);
				
				clickonElement(Login.getCheckout);
				
				clickonElement(Login.getcolumn);
				
				clickonElement(Login.getAddress);
				
				clickonElement(Login.getProceed);
				
				clickonElement(Login.getCarrier);
				
				clickonElement(Login.getcheque);
				
				clickonElement(Login.getsubmit);
				
				takeScreenShot();
				
					
				
				
			
				
		private static void inputvalueElement(Object email, String string) {
			// TODO Auto-generated method stub
			
		}

		private static void clickonElement(WebElement signin_Btn) {
			// TODO Auto-generated method stub
			
		}

		private static void getUrl(String string) {
			// TODO Auto-generated method stub
			
		}

		}

