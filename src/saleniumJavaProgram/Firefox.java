package saleniumJavaProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Firefox {

	public static void main(String[] args) {
		
//		 String Browser = "Opera";
//		
//		if(Browser =="Firefox") {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.co.in/");
//		driver.manage().window().maximize();
//		
//		}
//		
//		else if (Browser == "Microsoft Edge") {
//		
//			System.setProperty("webdriver.edge.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\msedgedriver.exe");
//			WebDriver driver = new EdgeDriver();
//			driver.get("https://www.google.co.in/");
//			driver.manage().window().maximize();
		
	//	}
		
		

			System.setProperty("webdriver.opera.driver", "operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
		
		
		
		
		
		
		

	}

}
