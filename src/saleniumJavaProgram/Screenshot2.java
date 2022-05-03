package saleniumJavaProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {

	    static String path =  ("C:\\Users\\Shubham\\Desktop\\Selenium Screenshot\\rediffpage.png");    
	
	public static void main(String [] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		File source =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File abc = new File(path);
		FileHandler.copy(source, abc);
	    Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
