package JhyothyMAster;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libraryfiles.Baseclass1;
import Libraryfiles.utility_class;
import module1Login.Jyothy_HomePage;
import module1Login.Jyothy_Login;


public class Jyothy_Test_Login extends Baseclass1
{
	Jyothy_Login Login;
	Jyothy_HomePage home;
    Sheet sh;
    int TestID;

    @BeforeClass
	public void openbrowser () throws EncryptedDocumentException, IOException 
	{
    	initilizedbrowser2();
    	Login=new Jyothy_Login(driver);
		home=new  Jyothy_HomePage(driver);
	}
    
    @BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException 
	{  
		
	 Login.inpJyothyLoginpageusername(utility_class.getpf("UN"));
	 Login.inpJyothyLoginpagepassword(utility_class.getpf("PSW"));
	 Login.clickJyothyLoginpagelogin();
	 
	
		
	}
	@Test
	public void verifyuserID() throws EncryptedDocumentException, IOException 
	{    TestID=101;
		
		String actUserID=home.getJyothyhomepageUserID();
		  String expuserID=utility_class.getTD(2, 0);
		assertEquals(actUserID,expuserID, "Failed both results are Different" ); 
		 
		driver.close();
	}
	
	
	@Test
	public void CreateSamplecategory() throws EncryptedDocumentException, IOException 
	{    TestID=102;
		
	
	 Login.inpJyothyLoginpageusername(utility_class.getpf("UN"));
	 Login.inpJyothyLoginpagepassword(utility_class.getpf("PSW"));
	 Login.clickJyothyLoginpagelogin();
	 
	 
		String actUserID=home.getJyothyhomepageUserID();
		  String expuserID=utility_class.getTD(3, 2);
		assertEquals(actUserID,expuserID, "Failed both results are Different" ); 
		 
	}
	
	
	
	
	
//    @Test
//	public void verifyuserID()
//	{
//		home.verifykitehomepageusername(sh.getRow(0).getCell(3).getStringCellValue());
//	}
//	
	@AfterMethod
	public void logoutToApp(ITestResult result) throws IOException//jo result ahe to RESULT navachya object madhe store karel jo pan result ahe to Itestresultnavacha iterface gate karel
	{       // fail==fail than screenshot capture
		  // pass==fail than screenshot not capture
		if(result.getStatus()==ITestResult.FAILURE)//status get by getstatus method tyala failure sobat compaire karav lagel
		{
			utility_class.capturescreenshot(driver, TestID);
		}	
			
			
			
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}

	
    
}
