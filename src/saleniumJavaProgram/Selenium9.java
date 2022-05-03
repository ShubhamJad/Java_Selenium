package saleniumJavaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium9 {

	
	  public static void main(String [] args) throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://is.rediff.com/signup/register");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  WebElement sam = driver.findElement(By.xpath("//select[@id='date_day']"));
		  Select s = new Select(sam);
		  s.selectByIndex(26);
	   	  List<WebElement> dayalloption = s.getOptions();
	      System.out.println( " Total Find Day Element = " + dayalloption.size());	  
		  for(int i =0 ; i<dayalloption.size();i++) {
			  
	       System.out.println(dayalloption.get(i).getText());
		  }
		  
		  Thread.sleep(2000);
		  
		  System.out.println("********************************");
		  
		  WebElement anup = driver.findElement(By.xpath("//select[@id='date_mon']"));
		  Select d = new Select(anup);
		  d.selectByVisibleText("AUG");
		  Thread.sleep(2000);
		  List<WebElement> month = d.getOptions();
		  System.out.println("total element = " + month.size());
		  for(int i =0 ; i<month.size();i++) {
			  
			  
			  System.out.println(month.get(i).getText());
			
			  
		  }
		  
		 WebElement sanket = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		 Select a = new Select(sanket);
		 a.selectByVisibleText("1996");
		 List<WebElement> year = a.getOptions();
		 System.out.println("Total Year element = " + year.size());
		 for(int i= 0; i < year.size(); i++) {
			 
			System.out.println(year.get(i).getText()); 
			 
		 }
	
		 Thread.sleep(2000);
		 driver.close();
		 
	  }

	
}
