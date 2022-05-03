package saleniumJavaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aleart1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Shubham Jadhav");
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
