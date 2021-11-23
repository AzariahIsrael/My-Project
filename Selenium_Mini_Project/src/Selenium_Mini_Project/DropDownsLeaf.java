package Selenium_Mini_Project;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class DropDownsLeaf {
		
		public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			
			driver.manage().window().maximize();
			
			WebElement drop = driver.findElement(By.id("dropdown1"));
			
			Select s = new Select(drop);
			
			s.selectByVisibleText("Selenium");
			
			driver.findElement(By.xpath("(//option[@value='2'])[2]	")).click();
			
			WebElement dr = driver.findElement(By.id("dropdown3"));
			
			Select s1 = new Select(dr);
			
			s1.selectByValue("3");
			
			WebElement si = driver.findElement(By.xpath("//select[@class='dropdown']"));

			Select s2 = new Select(si);
			
			s2.selectByValue("4");
			
			driver.findElement(By.xpath("(//option[@value='2'])[5]")).click();
	
			driver.findElement(By.xpath("(//option[@value='1'])[6]")).click();
		}
		
	}		
			
