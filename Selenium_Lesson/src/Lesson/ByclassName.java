package Lesson;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
  
public class ByclassName {  
  
    public static void main(String[] args) throws Exception {  
          
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
           
        WebDriver driver = new ChromeDriver();  
     
        driver.manage().window().maximize();  
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
        driver.get("https://www.baidu.com");  
        
        driver.findElement(By.className("s_ipt")).sendKeys("Java");
       
        //driver.findElement(By.className("bg s_btn_wr")).click();
        
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);
        
        driver.quit();
    }
}
