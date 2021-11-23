package Selenium_Mini_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Actions {

	public Actions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://amazon.in");
		
		driver.manage().window().maximize();

		WebElement Logo =driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]/div/a/div"));
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		j.executeScript("arguments[0].scrollIntoView();",Logo);
		
		Thread.sleep(3000);
		
		j.executeScript("window.scrollBy(0,-3000)"); 
		
		j.executeScript("window.scrollBy(0,1000)");
		
}

	public Actions contextClick(WebElement gmail_Btn) {
		// TODO Auto-generated method stub
		return null;
	}

	public Actions build() {
		// TODO Auto-generated method stub
		return null;
	}

	public void perform() {
		// TODO Auto-generated method stub
		
	}

	public Actions moveToElement(Object women) {
		// TODO Auto-generated method stub
		return null;
	}

	public Actions dragAndDrop(WebElement from, WebElement to) {
		// TODO Auto-generated method stub
		return null;
	}

//	public Object contextClick(WebElement gmail_Btn) {
//		// TODO Auto-generated method stub
//		return null;

}

