package unacademy.search.testNG;

import org.testng.annotations.Test;

import unacademy.libraries.UtilitySearch;
import unacademy.page.factory.SearchPF;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SearchTestNGClass {
 
	//Creating Object
	SearchPF search;
	
	WebDriver driver;
	
	File file;
	FileInputStream inputStream;
	FileOutputStream out;
	Workbook wBook;
	Sheet sheet;
	String dataExcelFilePath;
	String excelFileName;
	FileReader reader;
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		
		reader = new FileReader("C:\\Users\\anuttam\\eclipse-workspace\\UnacademyAutomation\\src\\test\\resources\\config\\config.properties");
		
		Properties properties = new Properties();
		properties.load(reader);	
		
		//Calling the value from properties file
		String baseUrl = properties.getProperty("baseUrl");
		String browser = properties.getProperty("browser");
		String chromedriver = properties.getProperty("chromedriver");
		dataExcelFilePath = properties.getProperty("dataExcelFile");
		excelFileName = properties.getProperty("excelFileName");
		driver = UtilitySearch.launchApplication(browser, baseUrl,chromedriver); 
		search = new SearchPF(driver);
		
	}

	@AfterMethod
	public void afterMethod() {
		 reader = null;
		driver.quit();
	}
	
	
	@DataProvider(name = "searchitem")
    public Object[][] getSearchData() throws IOException {
		
		String[][] data = null; 
		String fileName = excelFileName;
		file = new File(dataExcelFilePath);
		System.out.println("Data Excel File Name : "+excelFileName);
		System.out.println("Data Excel File Path : "+dataExcelFilePath);
		inputStream = new FileInputStream(file);
		out = null;
		wBook = null;
		
		String fileExtn = fileName.substring(fileName.indexOf("."));
		System.out.println(fileExtn);
		wBook = new XSSFWorkbook(inputStream);
		sheet = wBook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		
	   	int noOfRows = sheet.getPhysicalNumberOfRows();
	   	int noOfCols = row.getLastCellNum();
	   	Cell cell;
	   	data = new String[noOfRows-1][noOfCols];
	   	
	   	for(int i =1; i<noOfRows;i++){
		     for(int j=0;j<noOfCols;j++){
		    	   row = sheet.getRow(i);
		    	   cell= row.getCell(j);
		    	   data[i-1][j] = cell.getStringCellValue();
	   	 	   }
	   	}
		
		
		return data;
    }
	
	
	@Test(priority = 1)
	public void verifySearchingFromTrendingSearchList() throws InterruptedException {
		
		//Clicking the search textbox 
		search.searchTextBoxClicked();
		UtilitySearch.waitMethod();
		//Checking the Trending Search List appeared or not
		Assert.assertEquals(true, search.isTrendingListAppeared());
		
		//Clicking the search value from Trending search item
		search.trendingSearchItemClicked();
		//Checking the Educator search List page displayed or not
		Assert.assertEquals(true, search.isEducatorSearchListDisplayed());
		System.out.println("Educator search list appear!");
	  
  }
	

	@Test(priority = 2, dataProvider = "searchitem")
	public void verifyExplorationOfEducatorProfile(String educator, String coursename) throws InterruptedException {
		//Title of HomePage
		System.out.println(driver.getTitle());
		
		//Checking driver is on home Page or not
		Assert.assertEquals(true, search.homePageDisplayed());
		
		search.searchTextBoxClicked(); //Clicking the search text box
		UtilitySearch.waitMethod();
		//Passing the search item value
		String searchItem = educator;
		
		System.out.println("Line 113 "+searchItem);
		search.searchInput(searchItem);
		UtilitySearch.waitMethod();
		System.out.println("Educator Search value inserted");
		
		//Checking the educator profile is displayed or not
		System.out.println(driver.getTitle());
	    Assert.assertEquals(true, search.isEducatorProfiledisplayed());
	    //clicking dedication icon
	    search.dedicationIconClicked();
	    UtilitySearch.waitMethod();
	    Assert.assertEquals(true, search.isDedicationDrawyerOpen());
	    
	    //Clicking each hat from dedication drawer
		Assert.assertEquals(true, search.isGreenHatClicked());
		UtilitySearch.waitMethod();
	    Assert.assertEquals(true, search.isBlueHatClicked());
	    UtilitySearch.waitMethod();
	    Assert.assertEquals(true, search.isPurpleHatClicked());
	    UtilitySearch.waitMethod();
	    Assert.assertEquals(true, search.isBrownHatClicked());
	    UtilitySearch.waitMethod();
	    Assert.assertEquals(true, search.isRedHatClicked());
	    UtilitySearch.waitMethod();
	    //Clicking cross icon to close the drawer
	    search.dedicationCrossIconClicked();
	    
		System.out.println("Profile Highlighter going to click");
		
		//Clicking on profile highlighter link to open highlighter drawer
		search.profileHighlighterClicked();
		System.out.println("Profile Highlighter clicked");
		Assert.assertEquals(true,search.profileDrawyerOpened());
		UtilitySearch.waitMethod();
		//Clicking cross icon to close the drawer
		search.isProfileCrossIconClicked();
  }

	
	
	
	
	@Test(priority = 3, dataProvider = "searchitem")
	public void verifyExplorationOfCourses(String educator, String coursename) throws InterruptedException {
		//Clicking the search text box
		search.searchBoxForCourseClicked();
		UtilitySearch.waitMethod();
	    
	    //Passing the value to search
	    String courseName = coursename;
	    search.searchBoxClicked(courseName);
		
		System.out.println("Course search value inserted");
		
		UtilitySearch.waitMethod();
		//Search item click from suggestion list
		search.searchItemClicked();
		
		UtilitySearch.waitMethod();
		//Checking the course list appeared or not
		Assert.assertEquals(true, search.courseSearchListAppeared());
		
		//Scrolling the page to downwards
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(45,65)");	
		
		//Clicking on  course link
		search.isCourseClicked();
		
		//Checcking the Course preview page Displayed or not
		Assert.assertEquals(true, search.isCoursePreviewPageDisplayed());
		search.shareButtonClicked();
		UtilitySearch.waitMethod();
		//Checcking the Search dialogue box Display or not
		Assert.assertEquals(true, search.shareDialogueBoxDisplayed());
		//Copy the share link
		search.shareLinkCopied();
	    System.out.println("Share link copied!");
	    //Clicking the social media icon
		search.clickFaceBookIcon();
		search.clickTwitterIcon();  
  }
	
	
	
	
	
}


