
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HackerRound {

	public static void main(String [] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		FileInputStream  x  = new FileInputStream("C:\\Users\\Shubham\\\\Desktop\\Excel File\\Excel1.xlsx");
		Sheet value = WorkbookFactory.create(x).getSheet("Sheet2");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(value.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(value.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
	    WebElement dropDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	    dropDown.click();
		Select a = new Select(dropDown);
		a.selectByVisibleText("Price (low to high)");
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(value.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(value.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(value.getRow(2).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='bm-item menu-item'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(value.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(value.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		System.out.println("print message = " + text);
		Thread.sleep(5000);
		driver.close();
		
		
	}
	
	
	
}
