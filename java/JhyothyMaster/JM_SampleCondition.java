package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JM_SampleCondition {

	 @FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
	   @FindBy(xpath="//a[@id=\"ID1684\"]") private WebElement SC;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public JM_SampleCondition (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothySampleCondition()
	   {
		
		 SC.click();
	
	   }
	   
	   public void clickJyothyCreateSampleCondition()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothySampleCondition(String SampleCondition) 
	   {
		   Create.sendKeys(SampleCondition);
	
	   }
	   //Submit SC
	   public void clickJyothySampleConditionSubmit() 
	   {
		Submit.click();
	   }
	
	
	
}
