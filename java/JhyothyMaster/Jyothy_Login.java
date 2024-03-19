package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jyothy_Login
{
	  @FindBy(xpath="//input[@aria-label=\"Email Address\"]")private WebElement UN;
	   @FindBy(xpath="//input[@aria-label=\"Password\"]") private WebElement PSW;
	   @FindBy(xpath="//button[@type=\"submit\"]") private WebElement login;
	
	
	  public Jyothy_Login (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   
	   public void inpJyothyLoginpageusername(String username )
	   {
		 UN.sendKeys(username);
	
	   }
	   
	   public void inpJyothyLoginpagepassword(String password) 
	   {
		 PSW.sendKeys( password);
	
	   }
	   
	   public void clickJyothyLoginpagelogin() 
	   {
		login.click();
	}

}
