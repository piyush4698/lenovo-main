package Jhothy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01_User_Login {
 
	
	public static void main(String[] args)
	{
	  System.setProperty("webdriver.chrome.driver", "");
	
	   WebDriver driver=new ChromeDriver();
	   //Launch URL
	   driver.navigate().to("https://slapps.jyothylabs.com/");
	   
	  //Enter Username
	   driver.findElement(By.xpath("")).sendKeys("");
	   
	   driver.findElement(By.xpath("")).sendKeys("");
	   
	   driver.findElement(By.xpath("")).click();
	   
	   
	   String Acturl = driver.getCurrentUrl();
	   String Expurl="";
	   
	   if(Acturl.equals(Expurl))
	   {
		   System.out.println("Valid URL");
	   }
	   else
	   {
		   System.out.println("Invalid URL");
	   }
	   
	   
	   String Actusername=driver.getTitle();
	   String Expusername="";
	   
	   if(Actusername.equals(Expusername))
	   {
	      System.out.println("Username is Valid");
       }
	   else
	   {
		System.out.println("Username is Invalid");   
	   }
	   
	   
	   }

}
