package Lesson;
 
import java.util.concurrent.TimeUnit;  
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
  
public class Navigation {  
  
    public static void main(String[] args) throws Exception {  
          
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
           
        WebDriver driver = new ChromeDriver();  
     
        driver.manage().window().maximize();  
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
        driver.get("https://www.google.com");  
        
        Thread.sleep(2000);
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
        
        driver.navigate().to("http://news.google.com");
        Thread.sleep(2000);    
        
        driver.navigate().back();
        Thread.sleep(2000);
        
        driver.navigate().forward();
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        driver.close();
    }  
  
}  
