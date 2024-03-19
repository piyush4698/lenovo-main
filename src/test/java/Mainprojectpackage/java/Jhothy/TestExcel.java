package Jhothy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step.3 Create and object of fileInputStream class with 
		//excel sheet path as input in constructor
		 
		 FileInputStream file = new FileInputStream("D:\\Automation\\SimpleLogic.xlsx");
		 
		 //Step.4 To open the excel sheet use static method create() 
		// from Workbookfactory Class
		  Workbook book = WorkbookFactory.create(file); 
		  
		  //Step.5 To open specific sheet in excel used getSheet()  method
		  
		  org.apache.poi.ss.usermodel.Sheet sh = book.getSheet("UserName"); 
		  
		  //Step.6 To identify the desired row use method getRow();
		  org.apache.poi.ss.usermodel.Row rw= sh.getRow(1); 
		  
		  //Step.7 To identify the desired cell use method getCell();
		    Cell cl = rw.getCell(1); 
		  
		  String Value = cl.getStringCellValue(); 
		  System.out.println(Value);
		 
		 
	}
	

}
