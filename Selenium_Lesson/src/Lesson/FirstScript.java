package Lesson;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class FirstScript {
 
	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");  
         
	     WebDriver driver = new ChromeDriver();  
	        
	     driver.manage().window().maximize();  
	         
	     driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);     
	    
	     driver.get("https://www.yahoo.com");  
	     
	     
	     try{
	    	 String yahoo_title = "Yahoo";
	    	 assert yahoo_title == driver.getTitle();
	    	 System.out.println("Test passed!");
	    	 
	     }catch(Exception e){
	    	 e.printStackTrace();
	     }
	          
	     driver.quit();  
	}
 
}
