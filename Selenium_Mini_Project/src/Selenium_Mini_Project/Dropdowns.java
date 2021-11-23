package Selenium_Mini_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.name("States"));
		
		Select s = new Select(drop);
		
		s.selectByValue("Florida");
		
		s.selectByVisibleText("Texas");
		
		s.selectByValue("Washington");
				
		boolean multi = s.isMultiple();
		
		System.out.println(multi);
		
		System.out.println("------------------------------------------------------------------------");
		
	    List<WebElement> options = s.getOptions();
	    
	    for (WebElement webElement: options) {
	    	
	    	System.out.println(webElement.getText());
	    }

	    System.out.println("------------------------------------------------------------------------");
	    
	    List<WebElement> as = s.getAllSelectedOptions();
	    
	    for (WebElement webElement : as) {
	    	
	    	System.out.println(webElement.getText());
	    	
	    	   }
	    
	    
	    	
	}
}

