package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium8 {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
		Thread.sleep(2000);
		WebElement sam = driver.findElement(By.xpath("//input[@id='ch']"));
		System.out.println("Before checkbox selected = " +sam.isSelected());
		sam.click();
		Thread.sleep(2000);
		System.out.println("After Checkbox Selected = " +sam.isSelected());
		Thread.sleep(2000);
		WebElement anup = driver.findElement(By.xpath("//input[@id='name']"));
		System.out.println("Before Textbox Selected = " + anup.isSelected());
		anup.click();
		Thread.sleep(2000);
		System.out.println("After Textbox Selected = " + anup.isSelected());
	    Thread.sleep(2000);
	
		
		
		
		
		
		
	}
	
	
}
