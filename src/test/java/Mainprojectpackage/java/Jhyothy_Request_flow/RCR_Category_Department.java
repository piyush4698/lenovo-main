package Jhyothy_Request_flow;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RCR_Category_Department 
{
	
    @FindBy(xpath = "")private WebElement ReceiveSample;
	@FindBy(xpath = "")private WebElement RSC;
	@FindBy(xpath = "")private WebElement SampleCategory;
	@FindBy(xpath = "")private WebElement Brand;
	@FindBy(xpath = "")private WebElement Category;
	@FindBy(xpath = "")private WebElement LocationType;
	@FindBy(xpath = "")private WebElement Department;
	@FindBy(xpath = "")private WebElement Purpose;
	@FindBy(xpath = "")private WebElement SampleDescription;
	@FindBy(xpath = "")private WebElement PackingMethod;
	@FindBy(xpath = "")private WebElement Attachment;
	
	
	
	
	

	public void name()
	{
		
	}
	
	//select ReceivedSample    // CR-->>> Create Request
	public void ClickJyothyCRReceivedSample()
	{
		 ReceiveSample.click();
	}
		
	//select Raised Sample Request    // CR-->>> Create Request
	public void ClickJyothyCRRaisedSampleRequest()
	{
		RSC.click();		
	}
	
	//select Sample category    // CR-->>> Create Request
	public void SelectJyothyCRSampleCategory()
	{
		 Select dropdown = new Select(SampleCategory);
	     dropdown.selectByVisibleText("");
	}
	
	//Select Brand
	public void SelectJyothyCRBrand()
	{
		 Select dropdown = new Select(Brand);
	     dropdown.selectByVisibleText("");
		
	}
	
	//Category
	public void SelectJyothyCRCategory()
	{
		 Select dropdown = new Select(Category);
	     dropdown.selectByVisibleText("");
	}
	
	public void SelectJyothyCRLocationType()
	{
		 Select dropdown = new Select(LocationType);
	     dropdown.selectByVisibleText("");
	}
	
	public void SelectJyothyCRDepartment()
	{
		 Select dropdown = new Select(Department);
	     dropdown.selectByVisibleText("");
	}
	
	
	public void intJyothyCRPurpose(String purpose)
	{
		Purpose.sendKeys(purpose);
		
	}
	
	public void intJyothyCRSampleDescription(String SampleDescription)
	{
		Purpose.sendKeys(SampleDescription);
	}
	
	public void SelectJyothyCRPackingMethod()
	{
		Select dropdown = new Select(PackingMethod);
	     dropdown.selectByVisibleText("");
		
	}
	
	public void FileJyothyCRAttachment()
	{
		
	}
	

}
