package saleniumJavaProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumScreenshot4 {

	    static String path = ("C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\Screenshot\\Amazon.png");
	
	public static void main(String [] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File shubham = new File(path);
		FileHandler.copy(source, shubham);
		Thread.sleep(2000);
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static File File(String path2) {
		// TODO Auto-generated method stub
		return null;
	}
	 
}
