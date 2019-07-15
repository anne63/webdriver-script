package Lesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
class GetPageSource {

public static void main(String[] args) throws Exception {  
        
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.yahoo.com");
		Thread.sleep(1000);
		
		WebElement news_link = driver.findElement(By.linkText("News"));
		news_link.click();
		Thread.sleep(500);
		
		System.out.println(driver.getPageSource());
		
		driver.close();
		
	}

}
