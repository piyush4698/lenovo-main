package JhyothyMAster;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Libraryfiles.Baseclass1;
import Libraryfiles.utility_class;
import module1Login.Jyothy_HomePage;
import module1Login.Jyothy_Login;

public class Test_Login extends Baseclass1
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
}