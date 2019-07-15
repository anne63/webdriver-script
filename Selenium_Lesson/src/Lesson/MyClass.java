package Lesson;


import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyClass {
	public static void main(String[] args) throws InterruptedException {
		 
        System.setProperty("webdriver.gecko.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");           
        WebDriver driver = new FirefoxDriver();		
        
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);									
		driver.get("https://www.baidu.com/duty/");
		
		//Define the String_1st
		WebElement String_1st = driver.findElement(By.xpath("//*/div[@class='dwri_bule']/table/tbody/tr/td/p"));
				
	    //Define the String_2nd
		WebElement String_2nd = driver.findElement(By.xpath("//*/div[@class='dwri_bule']/table/tbody/tr/td/ul/li[1]"));
		
		//Actions click and hold on String_1st then move to String_2nd, release mouse
		Actions action = new Actions(driver);
		action.clickAndHold(String_1st).moveToElement(String_2nd).perform();
		action.release();
	}
}