package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salenium2 {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("frougfjksg");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		//Thread.sleep(0);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9665025777");
	//	Thread.sleep(2000);
		//.findElement(By.xpath("//input[@type='password']")).sendKeys("9730973232");
     //   Thread.sleep(2000);
      //.findElement(By.xpath("//button[@value='1']")).click();
	}

}
         
        // if path is wrong then illegal state exception will shows
        // if URl is wrong then Invalid argument exception will shows
        // if Element is Wrong then Invalid Selector Exception will show
        // if chrome not reachable or timed out that time  Web Driver Exception will show
        // if text is wrong then 





