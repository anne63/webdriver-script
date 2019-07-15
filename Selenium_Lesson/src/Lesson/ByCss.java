package Lesson;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
  
public class ByCss {  
  
    public static void main(String[] args) throws Exception {  
          
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
           
        WebDriver driver = new ChromeDriver();  
     
        driver.manage().window().maximize();  
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
        driver.get("https://www.baidu.com");  
        
        driver.findElement(By.cssSelector("#kw")).sendKeys("Java");;
        driver.findElement(By.cssSelector("#su")).click();
        
        Thread.sleep(5000);
        
        driver.quit();
        
    }
}