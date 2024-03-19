package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JM_Category
{

	   @FindBy(xpath="//a[@id=\\\"header-Masters\\")private WebElement MS;
	   @FindBy(xpath="//a[@id=\\\"ID1679\\\"]") private WebElement CT;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public JM_Category  (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothyCategory()
	   {
		
		 CT.click();
	
	   }
	   
	   public void clickJyothyCreateCategory()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothyCategory(String Category) 
	   {
		   Create.sendKeys(Category);
	
	   }
	   //Submit SC
	   public void clickJyothyCategorySubmit() 
	   {
		Submit.click();
	   }


}
