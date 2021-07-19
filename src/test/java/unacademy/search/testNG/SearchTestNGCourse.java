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
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SearchTestNGCourse {
	
	
	//Creating Object
		SearchPF search;
		
		WebDriver driver;
		WebDriverWait wait;
		File file;
		FileInputStream inputStream;
		FileOutputStream out;
		Workbook wBook;
		Sheet sheet;
		String dataExcelFilePath;
		String excelFileName;
		FileReader reader;
	
		
		
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
		
	
		@Test(priority = 1, dataProvider = "searchitem")
		public void verifyExplorationOfCourses(String educator, String coursename) throws InterruptedException {
			//Clicking the search text box
			search.searchBoxForCourseClick();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    //Passing the value to search
		    String courseName = coursename;
		    search.searchBoxClick(courseName);
			
			System.out.println("Course search value inserted");
			
			wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(search.clickSearchItem));
			//Search item click from suggestion list
			search.searchItemClick();
			
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			//Checking the course list appeared or not
			Assert.assertEquals(true, search.courseSearchListAppeared());
			
			//Scrolling the page to downwards
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(45,65)");	
			
			//Clicking on  course link
			search.isCourseClick();
			
			//Checcking the Course preview page Displayed or not
			Assert.assertEquals(true, search.isCoursePreviewPageDisplayed());
			search.shareButtonClick();
			
			
			wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(search.shareBox));
			
			
			
			//Checcking the Search dialogue box Display or not
			Assert.assertEquals(true, search.shareDialogueBoxDisplayed());
			//Copy the share link
			search.shareLinkCopied();
		    System.out.println("Share link copied!");
		    //Clicking the social media icon
			search.clickFaceBookIcon();
			search.clickTwitterIcon();  
	  }

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

}
