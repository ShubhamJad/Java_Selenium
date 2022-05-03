package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
     	driver.manage().window().maximize();
     	
     	JavascriptExecutor j=(JavascriptExecutor)driver;
     	j.executeScript("scroll(0,2000)");
     	Thread.sleep(4000);
     	
     	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("anup");
     	WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);
     	
     	WebElement ele1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement ele2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	    WebElement ele3 = driver.findElement(By.xpath("//div[@id='trash']"));
	    Actions a=new Actions(driver);
	    a.dragAndDrop(ele1, ele3).build().perform();
	    a.dragAndDrop(ele2, ele3).build().perform();
	    
	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("bhosale");
	    
	   
     
}
}