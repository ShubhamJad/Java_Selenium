package saleniumJavaProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {
	static String path="C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\newScreenshot.jpeg";

	public static void main(String [] args) throws InterruptedException, IOException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");	
    WebDriver driver = new ChromeDriver();
    driver.get("https://is.rediff.com/signup/register");
	driver.manage().window().maximize();	
	Thread.sleep(2000);	
	
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File ab=new File(path);
    FileHandler.copy(src, ab);
		
		
		
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
