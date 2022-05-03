package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActionClass1 {

	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement data = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(data).click().build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@id='sec_ans_field']")).sendKeys("pune");
		
		
	//	driver.close();
		
		
		
	//	Actions b = new Actions(driver);
	//	a.moveToElement(data).click().build().perform();
	//	a.sendKeys(Keys.DOWN).build().perform();
	//	Thread.sleep(2000);
	//	a.sendKeys(Keys.DOWN).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
