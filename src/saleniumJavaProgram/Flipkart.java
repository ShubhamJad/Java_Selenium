package saleniumJavaProgram;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("scroll(0,2000)");
		Thread.sleep(2000);
		j.executeScript("scroll(0,-500)");
//        WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
//        Actions a = new Actions(driver);
//        a.moveToElement(login).perform();
//        Thread.sleep(2000);
//      //  driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
//       driver.findElement(By.xpath("//div[text()='Flipkart Plus Zone']")).click();
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}}