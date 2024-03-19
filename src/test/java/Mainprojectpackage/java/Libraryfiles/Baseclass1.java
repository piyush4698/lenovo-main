package Libraryfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Baseclass1 
{
	public WebDriver driver;
	
	public void  initilizedbrowser()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");

	     System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	        driver=new ChromeDriver(option);
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.get("https://slapps.jyothylabs.com");
   }
	


}
