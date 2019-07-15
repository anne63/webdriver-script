package Lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;


public class ElementOperation01 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		
		
		String handle = driver.getWindowHandle();
		
		
		 WebElement setHome_link1 = driver.findElement(By.partialLinkText("Gmail"));
	        setHome_link1.click();
	        Thread.sleep(1000);
	        
	     WebElement setHome_link2 = driver.findElement(By.partialLinkText("Sign in"));
	        setHome_link2.click();
	        Thread.sleep(2000); 
	        
	        System.out.println(driver.getWindowHandles());
		
	driver.quit();	
	}
}
