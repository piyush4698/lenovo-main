package JhyothyMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jyothy_HomePage
{
	  @FindBy(xpath="")private WebElement ProfileImage;	
	  @FindBy(xpath="//div[@class=\"dropdown-user-details-name\"]")private WebElement Username;
	   
	   
	  public Jyothy_HomePage (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   
	   public String getJyothyhomepageUserID() 
	   {
		String actUserID =Username.getText();  //WEBELEMNT HA TEXT gheun detoy text eka variable madhe store madhe karun detoy
		return actUserID;       //he text aplyala POM class madhe verify karayc nahi ahe te aplyla tets class madhe karayc ahe
		//so eka  class chi value dusarya class madhe ghyaychi asel tar  method with return type use karu shakato
	}
}
