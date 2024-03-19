package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JM_Location_Type {
	 @FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
	   @FindBy(xpath="//a[@id=\"ID1680\"]") private WebElement LT;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public JM_Location_Type  (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothyLocation_Type()
	   {
		
		 LT.click();
	
	   }
	   
	   public void clickJyothyCreateLocation_Type()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothyLocation_Type(String Location_Type) 
	   {
		   Create.sendKeys(Location_Type);
	
	   }
	   //Submit SC
	   public void clickJyothyLocation_TypeSubmit() 
	   {
		Submit.click();
	   }
}
