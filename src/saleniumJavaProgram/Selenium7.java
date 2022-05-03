package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement abc = driver.findElement(By.xpath("//button[@id='disable']"));
		System.out.println("Button Dispalayed = " + abc.isDisplayed());
		System.out.println("Button Enabled  = " + abc.isEnabled());
		System.out.println("Button Selected = " + abc.isSelected());
		Thread.sleep(2000);
		
		System.out.println("*************************************");
		
		WebElement saj = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    System.out.println("Button Displayed = " + saj.isDisplayed());
		System.out.println("Button Enabled = " + saj.isEnabled());
		System.out.println("button Selected = " + saj.isSelected());
		Thread.sleep(2000);
		
		System.out.println("**************************************");
		
		WebElement scorpio = driver.findElement(By.xpath("//button[@id='enable-button']"));
		System.out.println("Button Displayed = " + scorpio.isDisplayed());
		System.out.println("BUtton Enabled = " + scorpio.isEnabled());
		System.out.println("Button Selected = " + scorpio.isSelected());
        Thread.sleep(2000);
		
        System.out.println("***************************************");
        
        WebElement hunk = driver.findElement(By.xpath("//input[@id='name']"));
		System.out.println("Textbox Displayed = " + hunk.isDisplayed() );
		System.out.println("Textbox Enabled = " +hunk.isEnabled());
		System.out.println("Textbox Selected = " +hunk.isSelected());
		Thread.sleep(2000);
	    WebElement sam = driver.findElement(By.xpath("//input[@id='name']"));
	    System.out.println("Before Textbox Selected = " + sam.isSelected());
	    sam.sendKeys("Shubham Jadhav");
	    System.out.println("After text box Selected = " + sam.isSelected());
	    
		System.out.println("*************************************");
		
		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
	    
	   // driver.findElement(By.xpath("//input[@id='ch']")).click();
	    
	    
	    
	   // System.out.println("Before Check box Selected = " + sanket.isSelected());
	    
	   // System.out.println("After Checkbox Selected = " + sanket.isSelected());
	  //  Thread.sleep(2000);
	    
	    
	    
	    
		Thread.sleep(2000);
	    driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
