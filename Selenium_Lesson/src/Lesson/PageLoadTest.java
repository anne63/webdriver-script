package Lesson;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageLoadTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		
		driver.get("http://www.icloud.com.cn");
		
	}
	

}
