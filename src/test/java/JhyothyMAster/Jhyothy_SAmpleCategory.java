package JhyothyMAster;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libraryfiles.utility_class;
import module1Login.Jyothy_HomePage;
import module1Login.Jyothy_Login;

public class Jhyothy_SAmpleCategory {

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
	public void createsamplecategory() throws EncryptedDocumentException, IOException 
	{    TestID=102;
		
		String actUserID=home.getJyothyhomepageUserID();
		  String expuserID=utility_class.getTD(3, 2);
		assertEquals(actUserID,expuserID, "Failed both results are Different" ); 
		 
	}
	
	
}
