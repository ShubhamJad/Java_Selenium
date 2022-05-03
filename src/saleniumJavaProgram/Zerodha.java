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
import org.openqa.selenium.chrome.ChromeOptions;

public class Zerodha {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions a = new ChromeOptions();
		a.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(a);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		String excepted = "Kite - Zerodha's fast and elegant flagship trading platform";
		String actual = driver.getTitle();
		
		if(excepted.equals(actual)) {
			
			System.out.println("Title case passed");
			
		}
		
	    WebElement kite = driver.findElement(By.xpath("//img[@src='/static/images/kite-logo.svg']"));
	     
	    if(kite.isDisplayed()) {
	    	 
	    	 System.out.println("Kite Logo is Visible");
	    	 
	     }
	    else{
	    	
	    	System.out.println("Kite Logo is Not Visible");
	    	
	    }
	    

		WebElement zerodha = driver.findElement(By.xpath("//img[@src='/static/images/zerodha-logo.svg']"));
	    
	    if(zerodha.isDisplayed()){
	    	
	    	System.out.println("Zerodha logo is Visible");
	    	
	    }
	    
	    else {
	    	
	    	System.out.println("Zerodha logo is Not Visible");
	    	
	    }
	    
	    FileInputStream x2  =	new	FileInputStream("C:\\\\Users\\\\Shubham\\\\Desktop\\\\Excel File\\\\Excel1.xlsx");
		Sheet abc = WorkbookFactory.create(x2).getSheet("Sheet2");
	
	    driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(abc.getRow(0).getCell(3).getStringCellValue());
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(abc.getRow(1).getCell(3).getStringCellValue());
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(abc.getRow(2).getCell(3).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"button-orange wide\"]")).click();
		Thread.sleep(3000);
		String excepted1 = "Shubham";
	    String actual1 = driver.findElement(By.xpath("//span[@class=\"nickname\"]")).getText();
		 
		
	   
				
		if(excepted1.equals(actual1)) {
			
			System.out.println("Nickname Varify");
			
		}
		
		else {			
			System.out.println("Nickname not varify");
			
		}
		
    	driver.findElement(By.xpath("//span[@class='user-id']")).click();
	    Thread.sleep(4000);
	    String excepted2 = "Shubham Anant Jadhav";
	    String actual2 = driver.findElement(By.xpath("//h4[@class=\"username\"]")).getText();
	    
       if(excepted2.equals(actual2)) {
			
			System.out.println("Username Varify");
			
		}
		
		else {			
			System.out.println("Username not varify");
			
		}
	    
        String excepted3 = "shubhamjadhav731@gmail.com";
	    String actual3 = driver.findElement(By.xpath("//div[@class=\"email\"]")).getText();
	    
        if(excepted3.equals(actual3)) {
			
			System.out.println("Email Varify");
			
		}
		
		else {			
			System.out.println("Email not varify");
			
		}
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@type='button']")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	   WebElement searchbox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	   searchbox.sendKeys(abc.getRow(3).getCell(3).getStringCellValue());
	   Thread.sleep(2000);
	   searchbox.click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//li[@class='search-result-item selected']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//span[@class='exchange'])[1]")).click();
	   Thread.sleep(2000);
	   WebElement qtybox = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
	   qtybox.clear();
	   Thread.sleep(2000);
	   qtybox.sendKeys(abc.getRow(4).getCell(3).getStringCellValue());
	   Thread.sleep(2000);
	   WebElement pricebox = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
	   pricebox.clear();
	   Thread.sleep(2000);
	   pricebox.sendKeys(abc.getRow(5).getCell(3).getStringCellValue());
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	   Thread.sleep(5000);
	   driver.close();
		
	}
	
}
