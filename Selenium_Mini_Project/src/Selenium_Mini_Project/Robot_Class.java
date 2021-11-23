package Selenium_Mini_Project;

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

public class Robot_Class {
	
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azar\\eclipse-workspace\\com.selenium.hp\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://automationpractice.com/");
		
		driver.manage().window().maximize();

//		driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]")).click();
//		
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("brian_andre@aol.com");
//
//		driver.findElement(By.id("SubmitCreate")).click();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
//		
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Azariah");
//		
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Israel");
//				
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Azariah@46");
//		
//		driver.findElement(By.id("days")).sendKeys("15");
//		
//		driver.findElement(By.name("months")).sendKeys("Mar");
//		
//		Thread.sleep(3000);
//
//		WebElement year = driver.findElement(By.id("years"));
//		    
//		Select s = new Select(year);
//		    
//		s.selectByValue("1997");
//		
//		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
//		
//		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
//
//		driver.findElement(By.name("address1")).sendKeys("2400 Route 9");
//
//		driver.findElement(By.id("city")).sendKeys("Buffalo");
//
//		driver.findElement(By.xpath("//option[@value='32']")).click();
//		
//		driver.findElement(By.name("postcode")).sendKeys("12524");
//
//		driver.findElement(By.xpath(("(//input[@type='text'])[13]"))).sendKeys("8148297209");
//		
//		driver.findElement(By.name("submitAccount")).click();
		
		driver.findElement(By.xpath("//a[@title='Women']")).click();
	
		
//		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
//		tshirts.click();
		
		driver.findElement(By.xpath("//img[@itemprop='image'][1]")).click();
		
//		WebElement tab = driver.findElement(By.xpath("//li[contains(@class,'ajax')]"));
//		Actions a = new Actions(driver);
//		a.moveToElement(tab).build().perform();
//		
//		WebElement add_to_cart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
//		add_to_cart.click();

//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("(//a[@title='Add to cart'])[1]")).click();
		
//		Actions a = new Actions(driver);
//		a.moveToElement(women).build().perform();
//		
//		driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]")).click();
	
//		driver.findElement(By.xpath("//img[@itemprop='image'][1]")).click();
	
//		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
 
		WebElement fancybox = driver.findElement(By.name("Submit"));

		fancybox.click();
//
//		Thread.sleep(3000);

		
//		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();	
		
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
		
		File destination = new File("C:\\Users\\Azar\\eclipse-workspace\\Selenium_Mini_Project\\Screenshotss\\Snip1.png");
		
		org.openqa.selenium.io.FileHandler.copy(source,destination);
}

}  