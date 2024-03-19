package Libraryfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility_class 
{
	//ethe aapn static method gheto karan aplyala test class madhe easily call karata yavi mhanun
	// karan ethe aapn aplya garaje nusar method call karato
	//yat saglya excel sheet, screenshot, etc sglya method call karto ani tya garaje nusar test class madhe call karto
	//but ethe aplyal method with return type use karavi lagte
	

	//@Author name :sanjay
	//this method is use to get test data from excel sheet
	//need to pass 2 inputs; 1 rowindex	2:column index  
	  
	public static String getTD(int Rowindex , int columnindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\30AprilmumMaven\\Testdata\\30Apr mum.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		 String value = sh.getRow(Rowindex).getCell(columnindex).getStringCellValue();
		return value;		
		
	}
	
	//Jyothy
	public static String getTD01(int Rowindex , int columnindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\30AprilmumMaven\\Testdata\\30Apr mum.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Jyothy");
		 String value = sh.getRow(Rowindex).getCell(columnindex).getStringCellValue();
		return value;		
		
	}
	
	
	
	//Author

	public static void capturescreenshot (WebDriver driver, int TestID) throws IOException //convert webdriver object into takes screen shot interface
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\30AprilmumMaven\\screenshot"+ TestID+".jpg");
		
		FileHandler.copy(src, dest);
}
	
      public static String getpf(String key) throws IOException
    {
	   FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\30AprilmumMaven\\propertyfile.properties");
    	  
	   Properties p=new Properties();
	   p.load(file);
	      String value = p.getProperty(key);
	       return value;
		
    	  
     }
	
	
}
