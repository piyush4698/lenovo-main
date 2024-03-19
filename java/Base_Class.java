import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{	
		WebDriver driver; 
		
		@Test
		public void initializeBrowser() 
		 { 
		 System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize(); 
		 driver.get("https://slapps.jyothylabs.com/"); 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		 }
		
	}

