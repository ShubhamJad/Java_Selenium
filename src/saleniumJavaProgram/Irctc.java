package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("scroll(0,2000)");
		Thread.sleep(2000);
		j.executeScript("scroll(0,-500)");
		
//		Thread.sleep(5000);
//		
//		
//		
//		WebElement dropdown = driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle'])[1]"));
//		Actions a=new Actions(driver);
//     	a.moveToElement(dropdown).clickAndHold().release().build().perform();
//		a.sendKeys(Keys.DOWN).build().perform();
//		Thread.sleep(2000);
//		a.sendKeys(Keys.DOWN).build().perform();
//		Thread.sleep(2000);
//		a.sendKeys(Keys.DOWN).build().perform();
//		Thread.sleep(2000);
//		a.sendKeys(Keys.DOWN).build().perform();
//		Thread.sleep(2000);
//		a.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(5000);
//		driver.close();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
