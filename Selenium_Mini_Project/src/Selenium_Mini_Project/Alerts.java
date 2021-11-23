package Selenium_Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();

		WebElement alertbox = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		
		alertbox.click();
		
		driver.switchTo().alert().accept();
		
		WebElement confirmalert = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
	
		confirmalert.click();
		
		driver.switchTo().alert().accept();
		
		WebElement confirmprompt = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
	
		confirmprompt.click();
		
		driver.switchTo().alert().dismiss();
	}
}
