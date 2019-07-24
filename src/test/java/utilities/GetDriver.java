package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDriver {
	
	public static WebDriver driver;
	
	public static WebDriver browserState() {
		
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
		
		
		
	}

}
