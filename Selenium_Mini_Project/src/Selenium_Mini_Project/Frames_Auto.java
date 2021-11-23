package Selenium_Mini_Project;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Frames_Auto {
		
		public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			driver.get("http://demo.automationtesting.in/Frames.html");
			
			driver.manage().window().maximize();
			
			driver.switchTo().frame("singleframe");
			
			WebElement singleframe = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			
			singleframe.sendKeys("Single Frame");
		
	
		}
		
	}		