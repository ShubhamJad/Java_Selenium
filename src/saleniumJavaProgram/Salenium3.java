package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salenium3 {
  
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("scroll(2000,0)");
	    driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Shubham Jadhav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("shubhamjadhav@73gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9665025777");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='repass']")).sendKeys("965025777");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sex']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='date_day']"));
		Select s = new Select(day);
		s.selectByIndex(26);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='date_mon']"));
		Select d = new Select(month);
	    d.selectByVisibleText("aug");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select c = new Select(year);
		c.selectByVisibleText("1996");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='signup_city']")).sendKeys("Baramati");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='school']")).sendKeys("SVS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='college']")).sendKeys("JSPM");
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}
	
}
