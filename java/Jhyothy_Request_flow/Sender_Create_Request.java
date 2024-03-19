package Jhyothy_Request_flow;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Sender_Create_Request 
{
    @FindBy(xpath = "")private WebElement SendSample;
    @FindBy(xpath = "")private WebElement SampleRequest;
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
	
	//select SendSample    // CR-->>> Create Request
	public void ClickJyothyCRSendSample()
	{
		SendSample.click();
			
	}
		
	//select Raised Sample Request    // CR-->>> Create Request
	public void ClickJyothyCRRaisedSampleRequest()
	{
		SampleRequest.click();	
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
		
	}
	
	//Location Type
	public void SelectJyothyCRLocationType()
	{
		
	}
	
	//Department
	public void SelectJyothyCRDepartment()
	{
		
	}
	
	//Purpose
	public void intJyothyCRPurpose()
	{
		
	}
	
	//Sample Description
	public void intJyothyCRSampleDescription()
	{
		
	}
	
	//Packing Method
	public void SelectJyothyCRPackingMethod()
	{
		
	}
	
	//Attachment
	public void FileJyothyCRAttachment()
	{
		
	}

}
