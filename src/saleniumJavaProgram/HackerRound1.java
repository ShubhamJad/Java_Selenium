package saleniumJavaProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class HackerRound1 {
	public static void main(String[]args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		FileInputStream ab=new FileInputStream("C:\\Users\\Shubham\\Desktop\\Excel File\\Excel1.xlsx");
		Sheet value1 = WorkbookFactory.create(ab).getSheet("Sheet3");
		
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys(value1.getRow(0).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(value1.getRow(1).getCell(1).getStringCellValue());
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		dropdown.click();
		Select s=new Select(dropdown);
		s.selectByVisibleText("Price (low to high)");
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@name='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(value1.getRow(0).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(value1.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(value1.getRow(2).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='bm-item menu-item'])[3]")).click();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(value1.getRow(3).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(value1.getRow(1).getCell(1).getStringCellValue());
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String text = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	    System.out.println("print message=" +text);
	}

}
