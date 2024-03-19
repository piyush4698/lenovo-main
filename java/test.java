import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
   public static void main(String[] args) throws IOException {
	

	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("incognito");
	 options.setAcceptInsecureCerts(true);
	 options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
	 WebDriver driver= new ChromeDriver(options);
	 
		//Launch Url
		driver.get("https://uatvuijon.anchor-world.com:8005/admin/login");
	
	    driver.findElement(By.xpath("//input[@id=\"user_email\"]")).sendKeys("piyush.marodkar@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@id=\"user_password\"]")).sendKeys("Piyush@1234567");
		
	    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    
	  
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    File dest = new File("C:\\Users\\piyush.marodkar\\Desktop\\Scrrenshot01\\Scrrenshot13.jpg");
	    
	    org.openqa.selenium.io.FileHandler.copy(src, dest);
	    

   }
}
