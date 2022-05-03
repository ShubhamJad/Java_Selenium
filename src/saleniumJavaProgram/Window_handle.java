package saleniumJavaProgram;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\JavaProgram\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String parentID=driver.getWindowHandle();
		System.out.println("parent id is="+parentID);
		Set<String>PCid=driver.getWindowHandles();
		
		int count =PCid.size();
		System.out.println("total windows are="+count);
		
		for(String child:PCid) {
			if(!parentID.equalsIgnoreCase(child)) {
				driver.switchTo().frame(child);
				System.out.println("child id are="+driver.getTitle());
			}
		}
		
		
		
		
		
		

}





  





}