package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException, Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title='Women']")).click();

		driver.findElement(By.xpath("//img[@itemprop='image'][1]")).click();

		driver.switchTo().frame(0);

		WebElement fancybox = driver.findElement(By.name("Submit"));

		fancybox.click();

		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();

		driver.findElement(By.id("email")).sendKeys("azariah.israel46@gmail.com");

		driver.findElement(By.name("passwd")).sendKeys("Azariah@46");

		driver.findElement(By.id("SubmitLogin")).click();

		driver.findElement(By.name("processAddress")).click();

		driver.findElement(By.id("cgv")).click();

		driver.findElement(By.name("processCarrier")).click();

		driver.findElement(By.xpath("//a[@class='cheque']")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		TakesScreenshot mp1 = (TakesScreenshot) driver;

		File source = mp1.getScreenshotAs(OutputType.FILE);

		File destination = new File(
				"C:\\Users\\Azar\\eclipse-workspace\\Selenium_Mini_Project\\Screenshotss\\Snip1.png");

		org.openqa.selenium.io.FileHandler.copy(source, destination);

	}

	public static WebDriver getBrowser(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}