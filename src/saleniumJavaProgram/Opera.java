package saleniumJavaProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.opera.driver","C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.close();

	}

}
