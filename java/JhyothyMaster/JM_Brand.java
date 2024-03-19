package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JM_Brand 
{

	   @FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
	   @FindBy(xpath="//a[@id=\"ID1678\"]") private WebElement BD;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement BD1;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public JM_Brand  (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothyBrand()
	   {
		
		 BD.click();
	
	   }
	   
	   public void clickJyothyCreateBrand()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothyBrand(String Brand) 
	   {
		   Create.sendKeys(Brand);
	
	   }
	   //Submit SC
	   public void clickJyothyBrandSubmit() 
	   {
		Submit.click();
	   }

}
