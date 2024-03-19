package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JM_Packing_Method {

	 @FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
	   @FindBy(xpath="//a[@id=\"ID1682\"]") private WebElement PM;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public JM_Packing_Method (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothyPacking_Method()
	   {
		
		 PM.click();
	
	   }
	   
	   public void clickJyothyCreatePacking_Method()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothyPacking_Method(String Packing_Method) 
	   {
		   Create.sendKeys(Packing_Method);
	
	   }
	   //Submit SC
	   public void clickJyothyPacking_MethodSubmit() 
	   {
		Submit.click();
	   }
	
}
