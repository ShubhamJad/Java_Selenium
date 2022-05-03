package saleniumJavaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {
public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("selenium");
		Thread.sleep(3000);
		
	      List<WebElement> abc = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	      System.out.println(abc.size());
	      
	      for(int i=0;i<abc.size();i++) {
	    	  System.out.println(abc.get(i).getText());
	      }
	      for(int j=0;j<abc.size();j++) {
	    	  
	    	  String expected="selenium download";
	    	  String actual=abc.get(j).getText();
	    	  if(expected.equals(actual)) {
	    		  abc.get(j).click();
	    	  }
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	      }

}
}