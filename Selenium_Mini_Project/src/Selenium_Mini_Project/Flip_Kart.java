package Selenium_Mini_Project;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flip_Kart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
			
				driver.get("https://www.flipkart.com/");
				
				driver.manage().window().maximize();

				driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9677186704");
				
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rocky");
				
				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//img[@alt='Travel']")).click();
							
				driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Mumbai");
				
				driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/form/div/div[1]/div[3]/div/div[1]/input")).sendKeys("Chennai");
				
				driver.findElement(By.xpath("//input[@value='30 Oct, Sat']")).click();

				
}
	
}
