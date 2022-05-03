package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassRightClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement rightClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		Actions a = new Actions(driver);
		a.moveToElement(rightClick).contextClick().build().perform();
		Thread.sleep(3000);
		//a.doubleClick(doubleClick).build().perform();
		
		a.moveToElement(rightClick).contextClick().build().perform();
		a.moveToElement(doubleClick).doubleClick().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
