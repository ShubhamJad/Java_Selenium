package saleniumJavaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
         
	   
		
	   driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[4]")).click();
	   Thread.sleep(3000);
	   driver.switchTo().alert().sendKeys("dddddddd");
	    
	    
	   
		

}
}