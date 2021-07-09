package unacademy.libraries;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilitySearch {

	public static WebDriver launchApplication(String browser,String baseUrl,String chromedriver) {
		WebDriver driver; 
		

		//Everything should call here from properties file, pass the properties object.
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",chromedriver);
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			return driver;
		}
		
		return null;

	}
	
	
	

}
