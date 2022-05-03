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
import org.openqa.selenium.chrome.ChromeOptions;

public class ZerodhaA {
	public static void main(String[]args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
    ChromeOptions a=new ChromeOptions();
    a.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(a);
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	
	String Expected="Kite - Zerodha's fast and elegant flagship trading platform";
	String Actual=driver.getTitle();
	if(Expected.equals(Actual)) {
		System.out.println("title validates sucessfully and test case passed");
	}
	else {
		System.out.println("test case failed");
	}
	WebElement kitelogo = driver.findElement(By.xpath("//a[@class='logo kite-logo']"));
	           boolean result = kitelogo.isDisplayed();
	           if(result==true) {
	        	   System.out.println("Title validates sucessfully and test case passed");
	           }
	           else {
	        	   System.out.println("test case failed");
	           }
   WebElement zerodhalogo = driver.findElement(By.xpath("//a[@class='footer-logo']"));
            result=zerodhalogo.isDisplayed();
            if(result==true) {
            	System.out.println("Title validates sucessfully and test case passed");
           }
            else {
            	System.out.println("test case failed");
            	
            }
            FileInputStream x=new FileInputStream("C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\Excel\\Excel1.xlsx");
            Sheet value = WorkbookFactory.create(x).getSheet("Sheet2");
            
            driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(value.getRow(0).getCell(3).getStringCellValue());
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(value.getRow(1).getCell(3).getStringCellValue());	
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(value.getRow(2).getCell(3).getStringCellValue());
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();	
             Thread.sleep(3000);
             
            String expected= "Shubham";
            String actual = driver.findElement(By.xpath("//span[@class='nickname']")).getText();
           if(expected.equals(actual)) {
        	   System.out.println("name validates sucessfully");
           }
           else {
        	   System.out.println("name not validates sucessfully");
           }
           driver.findElement(By.xpath("//span[@class='user-id']")).click();
           Thread.sleep(3000);
           String expected1="Shubham Anant Jadhav";
           String actual1=driver.findElement(By.xpath("//h4[@class='username']")).getText();
           if(expected1.equals(actual1)) {
        	   System.out.println("name validates sucessfully");
           }
           else {
        	   System.out.println("name not validates sucessfully");
            Thread.sleep(3000);   
            
        	String expected2="shubhamjadhav731@gmail.com";
            String actual2=driver.findElement(By.xpath("//div[@class='email']")).getText();
              
            if(expected2.equals(actual2)) {
            	System.out.println("email varify");
            }
            else {
            	System.out.println("email not verify");
            }
          
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
           }
            		
            		
            		
            		
            		
            		
            		
            		
            		
            		
            		
            		
            		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}