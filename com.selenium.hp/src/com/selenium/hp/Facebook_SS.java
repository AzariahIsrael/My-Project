package com.selenium.hp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_SS {
	
	public static void main(String[]args) throws IOException, InterruptedException {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");

			ChromeOptions fb = new ChromeOptions();
			
			fb.addArguments("incognito");
			
			WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://en-gb.facebook.com/");
			
			driver.manage().window().maximize();
			
			TakesScreenshot fb1 = (TakesScreenshot) driver;
			
			File source = fb1.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Screenshots\\Snap1.png");
			
			org.openqa.selenium.io.FileHandler.copy(source, destination);
			
			driver.findElement(By.id("email")).sendKeys("azariah.israel46@gmail.com");
					
			driver.findElement(By.id("pass")).sendKeys("Password@46");

			driver.findElement(By.name("login")).click();
			
			Thread.sleep(8000);
			
			TakesScreenshot fb2 = (TakesScreenshot) driver;
			
			File tc= fb2.getScreenshotAs(OutputType.FILE);
			
			File dest =	new File("C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Screenshots\\Snap2.png"); 
			
			org.openqa.selenium.io.FileHandler.copy(tc,dest);			
			
			
	}
	
}

	
	
