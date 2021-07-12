package unacademy.search.testNG;

import org.testng.annotations.Test;

import unacademy.libraries.UtilitySearch;
import unacademy.page.factory.SearchPF;

import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SearchTestNGClass {
 
	SearchPF search;
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		
		FileReader reader = new FileReader("C:\\Users\\anuttam\\eclipse-workspace\\UnacademyAutomation\\src\\test\\resources\\config\\config.properties");
		
		Properties properties = new Properties();
		properties.load(reader);	
		
		
		
		String baseUrl = properties.getProperty("baseUrl");
		String browser = properties.getProperty("browser");
		String chromedriver = properties.getProperty("chromedriver");
		
		driver = UtilitySearch.launchApplication(browser, baseUrl,chromedriver); 
		search = new SearchPF(driver);
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
	
	
	
	

	@Test(priority = 1)
	public void verifyExplorationOfEducatorProfile() throws InterruptedException {
		System.out.println(driver.getTitle());
		Assert.assertEquals(true, search.homePageDisplayed());
		search.searchTextBoxClicked(); //change method name
		Thread.sleep(4000);	
		String searchItem = "Sahil";
		search.searchInput(searchItem);
		
		System.out.println("Search value inserted");
		
		Thread.sleep(2000);

		
		search.searchEducatorName();
		
		Thread.sleep(5000); //use explicit wait  (dynamic waits)
		System.out.println(driver.getTitle());
	    Assert.assertEquals(true, search.isEducatorProfiledisplayed());
	    search.dedicationIconClicked();
	    Assert.assertEquals(true, search.isDedicationDrawyerOpen());
		Assert.assertEquals(true, search.isGreenHatClicked());
	    Thread.sleep(2000);
	    Assert.assertEquals(true, search.isBlueHatClicked());
	    Thread.sleep(2000);
	    Assert.assertEquals(true, search.isPurpleHatClicked());
	    Thread.sleep(2000);
	    Assert.assertEquals(true, search.isBrownHatClicked());
	    Thread.sleep(2000);
	    Assert.assertEquals(true, search.isRedHatClicked());
	    Thread.sleep(2000);
	    search.dedicationCrossIconClicked();
		System.out.println("Profile Highlighter going to click");
		search.profileHighlighterClicked();
		System.out.println("Profile Highlighter clicked");
		Assert.assertEquals(true,search.profileDrawyerOpened());
		search.isProfileCrossIconClicked();
  }

	
	@Test(priority = 2)
	public void verifySearchingFromTrendingSearchList() throws InterruptedException {
		
		search.searchTextBoxClicked();
		Thread.sleep(4000);
		Assert.assertEquals(true, search.isTrendingListAppeared());
		search.trendingSearchItemClicked();
		Assert.assertEquals(true, search.isEducatorSearchListDisplayed());
		System.out.println("Educator search list appear!");
	  
  }
	
	
	@Test(priority = 3)
	public void verifyExplorationOfCourses() throws InterruptedException {
		search.searchBoxForCourseClicked();
	    Thread.sleep(4000);
	    String courseName = "UPSC";
	    search.searchBoxClicked(courseName);
		
		System.out.println("Search value inserted");
		
		Thread.sleep(2000);
		
		search.searchItemClicked();
		
		Thread.sleep(5000);
		Assert.assertEquals(true, search.courseSearchListAppeared());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(45,65)");	
		search.isCourseClicked();
		Assert.assertEquals(true, search.isCoursePreviewPageDisplayed());
		search.shareButtonClicked();
		Thread.sleep(2000);
		Assert.assertEquals(true, search.shareDialogueBoxDisplayed());
		
		search.shareLinkCopied();
	    System.out.println("Share link copied!");
		search.clickFaceBookIcon();
		search.clickTwitterIcon();  
  }
}


