package Lesson;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class ElementOperation03 {
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
	        WebDriver driver = new ChromeDriver(); 
	        driver.manage().window().maximize(); 
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
		driver.get("http://data.pharmacodia.com/web/homePage/index?ns=1&ts=1&str=YWSJ");  
	       
        Thread.sleep(1000);
        
        driver.switchTo().frame("rightMain");
       
        WebElement drug_type_huaxue = driver.findElement(By.xpath("//*/span[@title='��ѧҩ']"));
        drug_type_huaxue.click();
        Thread.sleep(1000);
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.xpath("//*[@id='noLoginAlert']/div/button")).click();

		
		driver.quit();
	}
}



