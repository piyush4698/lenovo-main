package JhyothyMAster;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.jyothy.pageobject.Jyothy_LoginPage;

public class TC01_VerifyLoginandUsername extends BaseClass
{
	//open url
	@Test(enabled=false)
	public void VerifyLoginandUsername()
	{
		//open url
		driver.get(baseurl);
		logger.info("url opened");
		
	Jyothy_LoginPage Login=new Jyothy_LoginPage(driver);
	Login.inpjyothyUsername("PiyushTest");
	logger.info("Username entered in Login section.");
	
	Login.inpjyothyPassword("Welcome@123");
	logger.info("Password entered in Login section.");
		
	Login.ClickjyothyRemember();
	logger.info("clicked on Remember Check box");
	Login.ClickjyothyLoginButton();
	logger.info("clicked on Login button");
		
		
		
	}
}
