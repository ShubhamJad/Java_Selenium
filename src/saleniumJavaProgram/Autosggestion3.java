package saleniumJavaProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosggestion3 {

	public static void main(String [] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchBox = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		searchBox.sendKeys("Java");
		List<WebElement> abc = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		
		System.out.println(abc.size());
		
		for(int i = 0; i<abc.size();i++) {
			
			System.out.println(abc.get(i).getText());
			
		}
		
		for(int  s = 0; s<abc.size(); s++) {
			
			String exepted = "java download";
			String Actual = abc.get(s).getText();
			
			if(exepted.equals(Actual)) {
				
				abc.get(s).click();
				break;
				
			}
		
		}
		
		
		
		
		
		
	} 
	
}
