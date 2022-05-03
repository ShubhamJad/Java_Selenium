package saleniumJavaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listofwebelement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
//		List<WebElement> suggestion = driver.findElements(By.xpath("//a"));
//		System.out.println("total suggestion are="+suggestion.size());
//		
//		for(int i=0;i<suggestion.size();i++) {
//			
//			System.out.println(suggestion.get(i).getText());
//		}
//		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium webdriver");
		Thread.sleep(5000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		System.out.println(ele.size());
		
		for(int i=0;i<ele.size();i++) {
			System.out.println(ele.get(i).getText());
		}
		for(int j=0;j<ele.size();j++) {
			String Expected="selenium webdriver python";
			String Actual=ele.get(j).getText();
			if(Expected.equals(Actual)) {
				ele.get(j).click();
				System.out.println("test case is passed");
				break;
			}
		}
	}
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


