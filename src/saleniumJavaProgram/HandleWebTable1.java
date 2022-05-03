package saleniumJavaProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> table = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		System.out.println("TotalSize = " + table.size());
		
	   for(int i= 0; i<table.size();i++) {
		   
		   System.out.println(table.get(i).getText());
		   
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
