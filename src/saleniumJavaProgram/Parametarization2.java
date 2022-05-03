package saleniumJavaProgram;




import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Parametarization2 {

	public static void main(String[]args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		String path="C:\\Users\\Shubham\\Desktop\\Excel File\\Excel1.xlsx";
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		FileInputStream x2  =	new	FileInputStream(path);
		Sheet value1=WorkbookFactory.create(x2).getSheet("Sheet");
	  //  System.out.println("data from excel are="+value1);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(value1.getRow(0).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys(value1.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys(value1.getRow(0).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[2]")).sendKeys(value1.getRow(0).getCell(2).getStringCellValue());
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(value1.getRow(0).getCell(3).getStringCellValue());
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(value1.getRow(0).getCell(4).getStringCellValue());
	//	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys(value1.getRow(0).getCell(2).getStringCellValue());
	   // WebElement day = driver.findElement(By.xpath("//select[@name='DOB_Day93823a92']"));
	//	Select s = new Select (day);
	//	s.selectByIndex(26);
		WebElement day = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day']"));
		Select s = new Select(day);
		s.selectByVisibleText(value1.getRow(1).getCell(2).getStringCellValue());
		
		
		
	}
	
}
