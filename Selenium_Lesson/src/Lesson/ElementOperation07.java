package Lesson;


import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementOperation07 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.yahoo.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		WebElement username = driver.findElement(By.id("login-username"));
		
		//Build a JavascriptExecutor Object
		JavascriptExecutor js01 =  (JavascriptExecutor)driver;
		username.sendKeys("abcdefg");
		
		//setAttribute style
		js01.executeScript("arguments[0].setAttribute('style' , 'background: yellow; border: 2px, solid, red;');", username);		
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(1000);
		
		/*
		WebElement psswd = driver.findElement(By.id("login-passwd"));
		
		JavascriptExecutor js02 = (JavascriptExecutor)driver;
		psswd.sendKeys("123456789");
		
		js02.executeScript("arguments[0].setAttribute('style' , 'background: pink; border: 2px, solid, purple;');",psswd);
		Thread.sleep(500); 
		
		driver.quit();	
		*/	
	}
}