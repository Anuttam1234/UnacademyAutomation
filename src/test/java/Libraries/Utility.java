package Libraries;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

	public static WebDriver launchApplication(int browser,String baseUrl) {
		WebDriver driver; 
		
		switch(browser) {
		
		case 1:
			System.setProperty("webdriver.chrome.driver","D:\\@study\\Capgemini Study Material\\Software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case 2:
			System.setProperty("webdriver.gecko.driver","D:\\@study\\Capgemini Study Material\\Software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case 3:
			System.setProperty("webdriver.chrome.driver","D:\\@study\\Capgemini Study Material\\Software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case 4:
			System.setProperty("webdriver.chrome.driver","D:\\@study\\Capgemini Study Material\\Software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case 5:
			System.setProperty("webdriver.chrome.driver","D:\\@study\\Capgemini Study Material\\Software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case 6:
			System.setProperty("webdriver.chrome.driver","D:\\@study\\Capgemini Study Material\\Software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver","D:\\@study\\Capgemini Study Material\\Software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

	}
	
	
	

}
