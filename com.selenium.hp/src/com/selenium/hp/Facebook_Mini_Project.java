package com.selenium.hp;

	import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Mini_Project {

	public static void main(String[]args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");

		ChromeOptions fb = new ChromeOptions();
		
		fb.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Brian");

		driver.findElement(By.name("lastname")).sendKeys("Andre");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8148297209");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Azariah@46");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select(day);
		
		s.selectByValue("15");
		
		WebElement month = driver.findElement(By.id("month"));
		
	    Select s1 = new Select(month);
	    
	    s.selectByIndex(3);
	    
	    WebElement year = driver.findElement(By.id("year"));
	    
	    Select s2 = new Select(year);
	    
	    s2.selectByVisibleText("1997");
	    
	    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	    
	    driver.findElement(By.name("websubmit")).click();
	    
	    TakesScreenshot fb1 = (TakesScreenshot) driver;
		
		File source = fb1.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Screenshots\\Facebook.png");
		
		org.openqa.selenium.io.FileHandler.copy(source, destination);
		
	}
	
}	
	