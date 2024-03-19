package Jhothy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_05_Receive_Sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "");
		
		WebDriver driver=new ChromeDriver();
		
		   // Launch URL
		   driver.navigate().to("https://slapps.jyothylabs.com/");
		   
		  // Enter Username
		   driver.findElement(By.xpath("//input[@aria-label=\"Email Address\"]")).sendKeys("");
		  // Enter Password
		   driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("");
		  // Login Tab 
		   driver.findElement(By.xpath("//button[@value=\"login\"]")).click();
		   
		   // Select Receive Sample
		   driver.findElement(By.xpath("")).click();
		  // Select Sample Delivery  
		   driver.findElement(By.xpath("")).click();
		   
		   // Validate Control Sequence Number Spelling
		   String ActCSN=driver.findElement(By.xpath("")).getText();
		   String ExpCSN="Control Sequence Number";
		   if(ActCSN.endsWith(ExpCSN))
		   {
             System.out.println("CSN spelling is Correct");			   
		   } 
		   else
		   {
			   System.out.println("CSN spelling is Incorrect ");
		   }
		   
		   // Validate Place holder of control sequence number
		   
		   
		  String ActPlaceholder= driver.findElement(By.xpath("")).getText();
		   
		  String ExpPlaceholder="";
		 
		   if(ActPlaceholder.endsWith(ExpPlaceholder))
		   {
			   System.out.println("Place Holder is Valid");
		   }	   
		   else
		   {
			   System.out.println("Place Holder is Invalid");
		   }
		  
		   
		   // Enter Control Sequence Number
		   driver.findElement(By.xpath("")).sendKeys("");
		   
		   
		   
		   // Verify
		   driver.findElement(By.xpath("")).click();
		   
           // Validate Acknowledge is open
		   driver.findElement(By.xpath("")).getText();
		     
		   // 
		   
		   
	}
	
	
}
