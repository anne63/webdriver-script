package Lesson;
 
import java.util.concurrent.TimeUnit;  
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
  
public class LuanchChrome {  
  
    public static void main(String[] args) {  
          
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
          
        WebDriver driver = new ChromeDriver();  
       
        driver.manage().window().maximize();  
        
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
          
        // get()
        driver.get("https://www.google.com");  
        //getTitle() 
        System.out.println("This page title is�� "+ driver.getTitle());  
          
       
        driver.quit();  
          
    }  
  
}  
