package Lesson;


import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.sun.java.util.jar.pack.Package.File;

import org.junit.jupiter.api.Test;

public class takeScreenshot {
public static void main(String[] args) throws Exception {  
        System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");           
        WebDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://wwww.baidu.com");
        Thread.sleep(1000);
        
        File src= ((takesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        try {
            
        	FileUtils.copyFile(src, new File(".\\Screenshots\\screen.png"));
        }
         
        catch (IOException e)
         {
        	System.out.println(e.getMessage());
         
         }
		
	}
}