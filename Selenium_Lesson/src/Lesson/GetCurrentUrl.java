package Lesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
class GetCurrentUrl {

public static void main(String[] args) throws Exception {  
        
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.yahoo.com");
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		System.out.println(title);
		//Thread.sleep(200);
		
		WebElement news_link = driver.findElement(By.linkText("News"));
        news_link.click();
        Thread.sleep(300);
        
        String currentUrl_1 = driver.getCurrentUrl();
        System.out.println(currentUrl_1);
        driver.navigate().back();
        
        WebElement sports_link = driver.findElement(By.linkText("Sports"));
        sports_link.click();
        Thread.sleep(300);
        
        String currentUrl_2 = driver.getCurrentUrl();
        System.out.println(currentUrl_2);
        driver.navigate().back();
        Thread.sleep(300);
        
        WebElement lifestyle_link = driver.findElement(By.linkText("Lifestyle"));
        lifestyle_link.click();
        Thread.sleep(300);
        
        String currentUrl_3 = driver.getCurrentUrl();
        System.out.println(currentUrl_3);
        driver.navigate().back();
        Thread.sleep(300);
        
        assert title == "Yahoo";
        assert currentUrl_1 == "https://news.yahoo.com/";
        assert currentUrl_2 == "https://sports.yahoo.com/";
        assert currentUrl_2 == "https://www.yahoo.com/lifestyle/";
        
        
        driver.navigate().back();      
		driver.close();
		
     }
}
