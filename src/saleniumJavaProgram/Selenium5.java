package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium5 {

	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement facebookLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		WebElement facebookLogoUnderline = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passField = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement buttonLogo = driver.findElement(By.xpath("//button[@name='login']"));
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		WebElement creatNewButton = driver.findElement(By.xpath("//a[@rel='async']"));
		WebElement lastLink = driver.findElement(By.xpath("//div[@class='_58mk']"));
	
		int count = 0;
		if(facebookLogo.isDisplayed()) {
			
			System.out.println("Found Facebook Logo Element");
			count++;
			
		}
		else {
			
			System.out.println("Focebook logo Not Found");
			
			
		}
		
		if(facebookLogoUnderline.isDisplayed()) {
			
			System.out.println("Found Facebook Logo Underline");
			count++;
		}
		else {
			
			System.out.println("Not Found Element");
			
		}
		if(emailField.isDisplayed()) {
			
		System.out.println("Found email Field");
			count++;
		}
		else {
			
		System.out.println("Not Found Field");
			
		}
		
		if(passField.isDisplayed()) {
			
			System.out.println("Found pasward Field");
			count++;
		}
		else {
			
			System.out.println("Not Found Passwrd Field");
			
		}
		
		if(buttonLogo.isDisplayed()) {
			
           System.out.println("Found Button Logo = ");			
			count++;
		}
		else {
			
			System.out.println("Not Found Button");
			
		}
		 if(link.isDisplayed()) {
			 
			 System.out.println("Found  Link ");
			 count++;
		 }
		 else {
			 
			 System.out.println("Not Found Link");
			 
		 }
		if( creatNewButton.isDisplayed()) {
			
			
		System.out.println("Found Element OF Creat New Button");
		count++;
		
		}
		else {
			
			System.out.println("Creat New Button Not Found");
			
		}
		if(lastLink.isDisplayed()) {
			
			System.out.println("Last Link Found");                                
			
		}
		else {
			
			
			System.out.println("Not Found Lastlink");
			
		}
			

		System.out.println("Total Count = " + count);
		
		if(count==7) {
			
			
			System.out.println("Facebook sanity Test case Passed");
		
		}
		else {
			
			
		System.out.println("Sanity Test case Failed");
			
		}
		
		driver.close();
			
		}
		
		
}
	
