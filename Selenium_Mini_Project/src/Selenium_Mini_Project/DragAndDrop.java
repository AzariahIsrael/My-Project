package Selenium_Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
			
				driver.get("http://leafground.com/pages/drop.html");
				
				driver.manage().window().maximize();

				WebElement from = driver.findElement(By.id("draggable"));
				
				WebElement to = driver.findElement(By.id("droppable"));
			
				Actions act = new Actions(driver);
				
				act.dragAndDrop(from, to).build().perform();
				
				
}
}