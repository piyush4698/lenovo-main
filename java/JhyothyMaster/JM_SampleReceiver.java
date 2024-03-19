package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JM_SampleReceiver {

	 @FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
	   @FindBy(xpath="//a[@id=\"ID1683\"]") private WebElement SR;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public JM_SampleReceiver (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothySampleReceiver()
	   {
		
		 SR.click();
	
	   }
	   
	   public void clickJyothyCreateSampleReceiver ()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothySampleReceiver (String SampleReceiver) 
	   {
		   Create.sendKeys(SampleReceiver);
	
	   }
	   //Submit SC
	   public void clickJyothySampleReceiverSubmit() 
	   {
		Submit.click();
	   }
	
}
