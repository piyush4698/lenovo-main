package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jyothy_Masters_SampleCategory 
{
	
	   @FindBy(xpath="//a[@id=\\\"header-Masters\\")private WebElement MS;
	   @FindBy(xpath="//a[@id=\"ID1677\"]") private WebElement SSC;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement SC;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public Jyothy_Masters_SampleCategory (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothySampleCategory()
	   {
		
		 SSC.click();
	
	   }
	   
	   public void clickJyothyCreateSampleCategory()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothySampleCategory(String Samplecategory) 
	   {
		   SC.sendKeys(Samplecategory);
	
	   }
	   //Submit SC
	   public void clickJyothySampleCategorySubmit() 
	   {
		Submit.click();
	   }

}
