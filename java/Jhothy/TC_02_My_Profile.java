package Jhothy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02_My_Profile
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "");
	
	   WebDriver driver=new ChromeDriver();
	   //Launch URL
	   driver.navigate().to("https://slapps.jyothylabs.com/");
	   
	  //Enter Username
	   driver.findElement(By.xpath("")).sendKeys("");
	  //Enter Password
	   driver.findElement(By.xpath("")).sendKeys("");
	  //Login Tab 
	   driver.findElement(By.xpath("")).click();
	   
	   
	   driver.findElement(By.xpath("//a[@id=\"navbarDropdownUserImage\"]")).click();
	   
	   
	   driver.findElement(By.xpath("//a[@onclick=\"myProfile()\"]")).click();
	   
	   driver.findElement(By.xpath("//button[@class=\"btn-sm btn btn-outline-primary\"]")).click();
	   
	   driver.findElement(By.xpath("")).
	   
	   
	   driver.findElement(By.xpath("")).
	   
	   
	   driver.findElement(By.xpath("")).
	   
	   
	   driver.findElement(By.xpath("")).
	   
	   
	   driver.findElement(By.xpath("")).
	   
	   
	   driver.findElement(By.xpath("")).
	   
	   
	   driver.findElement(By.xpath("")).
	   
	   
	   driver.findElement(By.xpath("")).
	   
	   
	   driver.findElement(By.xpath("")).
	   
	   
	   
	   
}
}