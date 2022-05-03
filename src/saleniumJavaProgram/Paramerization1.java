package saleniumJavaProgram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paramerization1 {

	public static void main(String [] args) throws EncryptedDocumentException, IOException, InvalidFormatException{
		
		String path="C:\\Users\\Shubham\\Desktop\\Excel File\\Excel1.xlsx";
	 
		FileInputStream x2  =	new	FileInputStream(path);
		String value1=WorkbookFactory.create(x2).getSheet("Sheet").getRow(0).getCell(0).getStringCellValue();
		System.out.println("data from excel are="+value1);
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
