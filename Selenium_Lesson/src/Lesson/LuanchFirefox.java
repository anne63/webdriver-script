package Lesson;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class LuanchFirefox {
 
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.firefox.marionette", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
		System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");
			
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.get("https://www.firefox.com");
		
		System.out.println("This page title is�� "+ driver.getTitle());
		
		
		driver.quit();
		
	}
 
}
