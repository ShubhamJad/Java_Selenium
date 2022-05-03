package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salenium4 {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("9665025777");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type, 'password')]")).sendKeys("9730973232");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@value, '1')]")).click();
		
		
		// Xpath by Contains //
		
		
		
		
		
		
	} 
	
}
