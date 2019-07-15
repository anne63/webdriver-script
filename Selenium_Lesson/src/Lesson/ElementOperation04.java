package Lesson;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class ElementOperation04 {
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver"); 
	        WebDriver driver = new ChromeDriver();  
	        driver.manage().window().maximize();  
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.sojump.com/m/2792226.aspx/"); 
        Thread.sleep(1000);
        
        /* Put all radio btn in a list.. 
         * ArrayList<WebElement>
         */
        ArrayList<WebElement> answer_options = (ArrayList<WebElement>) driver.findElements(By.xpath("//*/div[@id='divQuestion']/fieldset/div/div/div/span/input/../a"));
        
        for(WebElement ele : answer_options){
        	ele.click();
        	Thread.sleep(2000);	
        	
        	//driver.quit();
	}
  }
}