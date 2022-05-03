package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2 {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destination1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
	    Actions a = new Actions(driver);
		a.dragAndDrop(source, destination).perform();
		a.dragAndDrop(source1, destination1).perform();
	
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		

	}

}
