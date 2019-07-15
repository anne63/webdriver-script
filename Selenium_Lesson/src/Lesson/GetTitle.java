package Lesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
class GetTitle {

public static void main(String[] args) throws Exception {  
        
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.yahoo.com");
		Thread.sleep(200);
		
		String title = driver.getTitle();
		System.out.println("Yahoo");
		Thread.sleep(2000);
		
		driver.close();
		
		assert title == "Yahoo";
     }
}
