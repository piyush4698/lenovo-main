package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JM_Department {

	
	 @FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
	   @FindBy(xpath="//a[@id=\"ID1681\"]") private WebElement Dept;
	   @FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
	   @FindBy(xpath="") private WebElement Submit;
	
	
	  public JM_Department (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }

	   //select master
	   public void clickJyothyMasterTab()
	   {
		 MS.click();
	
	   }
	   
	   public void clickJyothyDepartment()
	   {
		
		Dept.click();
	
	   }
	   
	   public void clickJyothyCreateDepartment()
	   {
		
		 Create.click();
	
	   }
	   
	   //select Sample category
	   public void inpJyothyDepartment(String Department) 
	   {
		   Create.sendKeys(Department);
	
	   }
	   //Submit SC
	   public void clickJyothyDepartmentSubmit() 
	   {
		Submit.click();
	   }
}
