package Lesson;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class ByXpath {
 
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
         
	     WebDriver driver = new ChromeDriver();  
	        
	     driver.manage().window().maximize();  
	         
	     driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);     
	    
	     driver.get("https://www.baidu.com");  
	     
	     driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("Java");
	     driver.findElement(By.xpath(".//*[@id='su']")).click();
	      
	     //driver.quit();  
	}
 
}
