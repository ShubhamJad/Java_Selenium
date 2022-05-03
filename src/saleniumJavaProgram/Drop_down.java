package saleniumJavaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
public static void main(String [] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Java App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='date_day']"));
		Select a=new Select(day);
		a.selectByValue("21");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='date_mon']"));
		Select b=new Select(month);
		b.selectByVisibleText("JUN");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select c=new Select(year);
		c.selectByVisibleText("1997");
		
		List<WebElement> options=c.getOptions();
		int count=options.size();
		System.out.println("total options are="+count);
		
	     for(int i=0;i<options.size();i++) {
	    	 String element=options.get(i).getText();
	    	 System.out.println("texts are="+element);
	     }
		
		
}
}