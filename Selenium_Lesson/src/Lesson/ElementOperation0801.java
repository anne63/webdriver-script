package Lesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ElementOperation0801 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com/");  
	       
        Thread.sleep(2000);
        
        //Settings
        WebElement settings = driver.findElement(By.xpath("//*[@id='u1']/a[8]"));
        
        Actions action = new Actions(driver);
        action.moveToElement(settings).perform();
        
        driver.findElement(By.linkText("�߼�����")).click();
	    
	    driver.quit();
	}
}