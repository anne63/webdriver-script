package Lesson;


import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.gargoylesoftware.htmlunit.javascript.host.Window;


public class ElementOperation02 {
	public static void main(String[] args) throws Exception {  
        
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
           
        WebDriver driver = new ChromeDriver();  
     
        driver.manage().window().maximize();  
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
        driver.get("http://news.google.com");  
       
        Thread.sleep(1000);
        
        
        WebElement element = driver.findElement(By.xpath("//*/body[@id='yDmH0d']/c-wiz[@class='zQTmif SSPGKf qid0K']/div[@class='T4LgNb']/div[@class='FVeGwb CVnAc']/div[@class='ajwQHc BL5WZb RELBvb fV8ehb']/div[@class='tsldL Oc0wGc RELBvb']/main[@class='HKt8rc CGNRMc']/c-wiz[@class='Erv9te']/div[@class='lBwEZb BL5WZb xP6mwf']/div[47]/div[1]/article[1]/a[1]"));
        
        
      	JavascriptExecutor je = (JavascriptExecutor) driver;

      
      	je.executeScript("arguments[0].scrollIntoView(true);",element);
      	
      	
      	Thread.sleep(3000);
      	
      	driver.quit();
        
    }  
}