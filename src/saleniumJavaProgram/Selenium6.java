
package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium6 {
   
	public static void main(String [] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='date_day']"));
		Select s = new Select(day);
		s.selectByIndex(26);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='date_mon']"));
		Select d = new Select(month);
		d.selectByVisibleText("AUG");
		WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select f = new Select(year);
		f.selectByVisibleText("1996");
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
}
