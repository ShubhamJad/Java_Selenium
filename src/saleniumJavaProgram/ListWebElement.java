package saleniumJavaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElement {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	   List<WebElement> element = driver.findElements(By.xpath("//a"));
		
	   System.out.println("element Size = " + element.size());
	   
	   for(int i = 0; i<element.size();i++) {
		   
		   System.out.println(element.get(i).getText());
		   
	
	   }
		
		
		
		
		
		
		
		
		

	}

}
