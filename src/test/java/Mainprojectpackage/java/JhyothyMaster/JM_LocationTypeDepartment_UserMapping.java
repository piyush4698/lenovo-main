package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JM_LocationTypeDepartment_UserMapping 
{
	 @FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
	@FindBy(xpath="//a[@id=\"ID1685\"]") private WebElement LTDU;
	@FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	@FindBy(xpath="") private WebElement LT;
	@FindBy(xpath="") private WebElement DN;
	@FindBy(xpath="") private WebElement SN;
	@FindBy(xpath="") private WebElement RN;
	@FindBy(xpath="") private WebElement RM;
	@FindBy(xpath="") private WebElement KAM;
	@FindBy(xpath="") private WebElement Submit;


	public JM_LocationTypeDepartment_UserMapping  (WebDriver driver)
	{
		   PageFactory.initElements(driver, this);
		   
	}
	
	  //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothYLocationTypeDepartment_UserMapping()
	   {
	   	Select LTDU1=new Select(LTDU);
	   	 LTDU1.selectByValue("");

	   }
	   
	   public void SelectJyothyLocationType()
	   {
			Select LT1=new Select(LT);
		   	 LT1.selectByValue("");
	   	 

	   }
	   
	   public void SelectJyothyDepartmentName()
	   {
		   Select DN1=new Select(DN);
		   	 DN1.selectByValue("");
	   	 

	   }
	   
	   public void SelectJyothySenderName()
	   {
		   Select SN1=new Select(SN);
		   	 SN1.selectByValue("");

	   }
	   
	   public void SelectJyothyRequestorName()
	   {
		   Select RN1=new Select(RN);
		   	 RN1.selectByValue("");
	   	 

	   }
	   
	   public void SelectJyothyReportingManager()
	   {
		   Select RM1=new Select(RM);
		   	 RM1.selectByValue("");
	   	 

	   }
	   
	   public void inpJyothyKAMUsers(String KAMusers)
	   {
	   	
	   	 KAM.sendKeys(KAMusers);

	   }
	   
	   //Submit SC
	   public void clickJyothyLocation_TypeSubmit() 
	   {
		Submit.click();
	   }
	   
}	

