import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Jyothy_lab.te;

public class TestNg_Test {

	@Test
	public void name() 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://slapps.jyothylabs.com/Home");
		
		
	}
	
}
