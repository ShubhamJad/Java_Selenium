package saleniumJavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_method {
public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        
		 WebElement ab = driver.findElement(By.xpath("(//span[@class='path5'])[1]"));
	     boolean res = ab.isDisplayed();
		 System.out.println(res);
		         
         WebElement bc = driver.findElement(By.xpath("//input[@id='radio0']"));
         boolean rps = bc.isSelected();
         System.out.println(rps);
         
         WebElement cd = driver.findElement(By.xpath("//input[@id='radio1']"));
         boolean rpa = cd.isSelected();
         System.out.println(rpa);
         cd.click();
         Thread.sleep(3000);
         driver.close();
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
}
       
}