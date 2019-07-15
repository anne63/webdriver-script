package Lesson;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
  
public class BytagName {  
  
    public static void main(String[] args) throws Exception {  
          
        System.setProperty("webdriver.gecko.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
           
        WebDriver driver = new FirefoxDriver();  
     
        driver.manage().window().maximize();  
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
        driver.get("http://www.baidu.com");  
        
        
        driver.findElement(By.tagName("body")).sendKeys(Keys.F11);
        
        Thread.sleep(5000);
        driver.quit();
        
        
    }
}
