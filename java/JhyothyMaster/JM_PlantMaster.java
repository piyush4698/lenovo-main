package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JM_PlantMaster {

	
	 @FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
	   @FindBy(xpath="//a[@id=\"ID1953\"]") private WebElement Pack;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public JM_PlantMaster (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothyPlantMaster()
	   {
		
		 Pack.click();
	
	   }
	   
	   public void clickJyothyCreatePlantMaster()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothyPlantMaster(String PlantMaster) 
	   {
		   Create.sendKeys(PlantMaster);
	
	   }
	   //Submit SC
	   public void clickJyothyPlantMasterSubmit() 
	   {
		Submit.click();
	   }
}
