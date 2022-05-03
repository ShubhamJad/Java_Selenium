package saleniumJavaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglepageScenario {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
        WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
        searchBar.sendKeys("Selenium");
        
        Thread.sleep(4000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println("Toatal Suggestion = "  + +  suggestions.size());	
		System.out.println("Total Suggestion = " );
		
	    for(int s = 0; s<suggestions.size();s++) {
	    	
	    	System.out.println(suggestions.get(s).getText());
	    	
	    }
		
		for(int i = 0; i<suggestions.size();i++) {
	    	
	    	String expt = "selenium webdriver";
	    	String act = suggestions.get(i).getText();
	    	
	    	if(expt.equals(act))
	    	{
	    		
	    		suggestions.get(i).click();
	    		System.out.println("Test Case Passed");
	    		break;
	    	}	
	    
	    	
	    }
       
	    Thread.sleep(1000);
	    driver.close();
	    
	}

}
