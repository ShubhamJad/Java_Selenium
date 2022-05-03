package saleniumJavaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
        WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
        searchBar.sendKeys("java");
        
//        Thread.sleep(4000);
//		
//        List<WebElement> xyz = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
//        
//        System.out.println(xyz.size());
//        
//        for(int i = 0; i<xyz.size();i++) {
//        	
//        	System.out.println(xyz.get(i).getText());
//        	
//        }
//     		
//     		for(int s = 0 ; s < xyz.size(); s++) {
//     			
//     			String expt = "javascript";
//     			String act = xyz.get(s).getText();
//     			
//     			if(expt.equals(act)) {
//     				
//     				xyz.get(s).click();
//     				break;
//     				
//     				
//     			}
//     		
//     		}
//     	    	
//     		driver.close();
//     		
//     	    }
//        }
//        
        
	}  
	}
	


