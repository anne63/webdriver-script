package Lesson;


import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class takeScreenshotRobot {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "/Users/ann/eclipse-workspace/Selenium_Lesson/bin/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://wwww.baidu.com");
	Thread.sleep(1000);
	
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	
	try{
		
		ImageIO.write(image, "png", new File(".\\Screenshots\\screen_robot.png")); 
		
	}catch(IOException e){
		
		System.out.println(e.getMessage());
	}
  
  }
	
}
