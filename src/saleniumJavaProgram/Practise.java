package saleniumJavaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise {
public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		
		WebElement selenium = driver.findElement(By.xpath("(//div[@class='dropdown'])[10]"));
		Actions a=new Actions(driver);
		//a.moveToElement(selenium).clickAndHold().release().build().perform();
        a.moveToElement(selenium).perform();
        driver.findElement(By.xpath("(//a[text()='Selenium with Python'])[1]")).click();
		
		
}
}