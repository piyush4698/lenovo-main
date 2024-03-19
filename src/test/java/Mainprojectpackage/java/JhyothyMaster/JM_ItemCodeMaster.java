package JhyothyMaster;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JM_ItemCodeMaster 
{
	
@FindBy(xpath="//a[@id=\"header-Masters\"]")private WebElement MS;
@FindBy(xpath="//a[@id=\"ID1954\"]") private WebElement ICM;
@FindBy(xpath="//button[@class=\"btn btn-primary btn-icon\"]") private WebElement Create;
@FindBy(xpath = "")private WebElement MC;
@FindBy(xpath = "")private WebElement MD;
@FindBy(xpath = "")private WebElement MT;
@FindBy(xpath = "")private WebElement SC;
@FindBy(xpath = "")private WebElement BD;
@FindBy(xpath = "")private WebElement CT;
@FindBy(xpath="") private WebElement Submit;


public JM_ItemCodeMaster (WebDriver driver)
{
	   PageFactory.initElements(driver, this);
	   
}

//select master
public void clickJyothyMasterTab()
{
	 MS.click();

}

public void clickJyothyItemCodeMaster()
{
	
	 ICM.click();

}


public void ClickJyothyItemCode()
{
	Create.click();
}

public void inpJyothyMaterialCode(String MaterialCode)
{
	MC.sendKeys(MaterialCode);
}

public void inpJyothyMaterialDescription(String MaterialDescription)
{
  MD.sendKeys(MaterialDescription);
}

public void SelectJyothyMaterialType()
{
	Select MT1=new Select(MT);
	 MT1.selectByValue("");	
}

public void SelectJyothySampleCateogory()
{
	Select SC1=new Select(SC);
 	 SC1.selectByValue("");	
}

public void SelectJyothyBrand()
{
	Select BD1=new Select(BD);
	 BD1.selectByValue("");	
}

public void SelectJyothyCategory()
{
	Select CT1=new Select(CT);
	 CT1.selectByValue("");
}

public void ClickJyothySaveChanges() 
{
	SC.click();
}




}
