package Lesson;


import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.gargoylesoftware.htmlunit.javascript.host.Window;


import org.junit.jupiter.api.Test;

public class ElementOperation05 {
public static void main(String[] args) throws Exception {  
        
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
           
        WebDriver driver = new ChromeDriver();  
     
        driver.manage().window().maximize();  
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
        driver.get("https://www.yahoo.com/");  
        Thread.sleep(500);

		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("login-username")).sendKeys("abc");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(500);
		
		String error_message = driver.findElement(By.id("username-error")).getText();
		assert (error_message == "Sorry, we don't recognize this account.");
		Thread.sleep(5000);
		
		driver.quit(); 
		
		
	}
}