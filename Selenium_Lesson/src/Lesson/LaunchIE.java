package Lesson;
 
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 
 
  
public class LaunchIE {  
  
    public static void main(String[] args) {  
          
        System.setProperty("webdriver.ie.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
          
         
        WebDriver driver = new  InternetExplorerDriver(); 
         
        driver.manage().window().maximize();  
        
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
          
        
        driver.get("https://www.yahoo.com");  

        System.out.println("This page title is�� "+ driver.getTitle());  
          
   
        driver.quit();  
          
    }  
  
}  
