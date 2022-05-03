package saleniumJavaProgram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Parameterization3 {public static void main(String[]args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
	String path="C:\\Users\\Shubham\\Desktop\\Excel File\\Excel1.xlsx";
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	FileInputStream x2  =	new	FileInputStream(path);
	Sheet value1=WorkbookFactory.create(x2).getSheet("Sheet1");
	
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(value1.getRow(0).getCell(0).getStringCellValue());
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(value1.getRow(1).getCell(0).getStringCellValue());
	driver.findElement(By.xpath("(//input[contains(@name,'passwd')][1])")).sendKeys(value1.getRow(1).getCell(4).getStringCellValue());
   WebElement day = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
    Select s=new Select(day);
    s.selectByVisibleText(value1.getRow(2).getCell(4).getStringCellValue());
   WebElement month = driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
    Select a=new Select(month);
    a.selectByVisibleText(value1.getRow(2).getCell(5).getStringCellValue());
   WebElement year = driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
    Select b=new Select(year);
    b.selectByVisibleText(value1.getRow(2).getCell(6).getStringCellValue());
}
}