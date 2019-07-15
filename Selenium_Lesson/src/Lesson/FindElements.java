package Lesson;
 
import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class FindElements {
 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
        
        WebDriver driver = new ChromeDriver();  
     
        driver.manage().window().maximize();  
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
        driver.get("https://news.baidu.com");  
        
        List <WebElement> links = driver.findElements(By.xpath(".//*[@id='pane-news']/ul[1]/li/a"));
        
        for(int i=0; i<links.size(); i++){
        	System.out.println(links.get(i).getText());
        }
        
        driver.quit();
	}
 
}
