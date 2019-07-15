package Lesson;
 
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class BylinkText {
	
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
	
		
		driver.findElement(By.linkText("Store")).click();
		Thread.sleep(1000);
		
	    assert driver.getCurrentUrl() == "https://store.google.com";
	    
	    driver.quit();
	}
 
}
