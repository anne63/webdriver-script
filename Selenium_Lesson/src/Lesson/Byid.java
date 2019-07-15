package Lesson;
 
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class Byid {
	
    public static void main(String[] args) throws Exception {  
        
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.baidu.com");
	
		//By id 
		driver.findElement(By.id("kw")).sendKeys("Java");
		Thread.sleep(2000);
		
		driver.close();
		 
	}
 
}
