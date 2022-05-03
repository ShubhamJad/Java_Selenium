package saleniumJavaProgram;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowHandle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='Open Popup']")).click();
		 Set<String> win = driver.getWindowHandles();
		Iterator<String> itr = win.iterator();
		String windows[] = new String[1];
		
		for(int i = 0 ; i<win.size();i++) {
			
			windows[i] = itr.next();
			System.out.println("Windows = " + windows[i]);
			
		}
		
		
		driver.switchTo().window(windows[0]);
    	driver.close();
   	    driver.switchTo().window(windows[1]);
     	driver.close();
	
		
		
	     
	     
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Set<String> win = driver.getWindowHandles();
//		Iterator<String> itr = win.iterator();
//		String windows[] = new String[2]; 
		
		for(int i = 0; i<win.size();i++) {
			
			windows[i] = itr.next();
		
			System.out.println(windows[i]);
			
		}
		
		
		
		Set<String> sam = driver.getWindowHandles();
		Iterator<String> anup = sam.iterator();
		String Windows[] = new String[2];
		
		for (int i = 0 ; i<sam.size();i++) {
			
			Windows[i] = itr.next();
			
			System.out.println(Windows[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
