package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JM_UserMaster
{
	 @FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
	   @FindBy(xpath="//a[@id=\"ID1675\"]") private WebElement UM;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public JM_UserMaster (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothyUserMaster()
	   {
		
		 UM.click();
	
	   }
	   
	   public void clickJyothyCreateUserMaster()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothyUserMaster(String UserMaster) 
	   {
		   Create.sendKeys(UserMaster);
	
	   }
	   //Submit SC
	   public void clickJyothyUserMasterSubmit() 
	   {
		Submit.click();
	   }

}
