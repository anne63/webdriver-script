package Lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElements_LinkText {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		//By.linkText
		driver.findElement(By.partialLinkText("News")).click();  
		Thread.sleep(1000);
		
		driver.close();   
	    //driver.quit();
	}

}
