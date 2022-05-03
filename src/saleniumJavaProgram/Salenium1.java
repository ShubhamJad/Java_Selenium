package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salenium1 {

	public static void main(String [] args ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		WebElement day=driver.findElement(By.xpath("//select[@name='DOB_Daybd668720']"));
		Select a=new Select(day);
		a.selectByVisibleText("31");
	
		
		
		
		
		
	}
	
	
	
	
}
