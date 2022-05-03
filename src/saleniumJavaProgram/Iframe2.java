package saleniumJavaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Shubham");
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(ele);
		WebElement source = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, dest).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='s']")).clear();
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Anup Bhosle");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	}

}
