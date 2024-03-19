package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JM_MaterialType {

	
	   @FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
	   @FindBy(xpath="//a[@id=\"ID1958\"]") private WebElement MT;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public JM_MaterialType (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothyMaterialType()
	   {
		
		 MT.click();
	
	   }
	   
	   public void clickJyothyCreateMaterialType()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothyMaterialType(String MaterialType) 
	   {
		   Create.sendKeys(MaterialType);
	
	   }
	   //Submit SC
	   public void clickJyothyMaterialTypeSubmit() 
	   {
		Submit.click();
	   }
	
}
