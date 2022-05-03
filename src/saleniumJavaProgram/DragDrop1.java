package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {

	
	public static void amin (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement ele2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	//	Actions a = new Actions(driver);
	//	a.dragAndDrop(ele1, ele2).perform();
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).build().perform();
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
