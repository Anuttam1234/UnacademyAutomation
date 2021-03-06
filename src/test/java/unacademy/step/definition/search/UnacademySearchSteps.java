package unacademy.step.definition.search;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import unacademy.libraries.UtilitySearch;
import unacademy.page.factory.SearchPF;

public class UnacademySearchSteps {

	SearchPF search;
	
	WebDriver driver;
	
	@Before
	public void setUp() throws IOException {
		FileReader reader = new FileReader("C:\\Users\\anuttam\\eclipse-workspace\\UnacademyAutomation\\src\\test\\resources\\config\\config.properties");
		
		Properties properties = new Properties();
		properties.load(reader);	
		
		
		
		String baseUrl = properties.getProperty("baseUrl");
		String browser = properties.getProperty("browser");
		String chromedriver = properties.getProperty("chromedriver");
		
		driver = UtilitySearch.launchApplication(browser, baseUrl,chromedriver); 
		search = new SearchPF(driver);
	}
	
	
	@After
	public void driverClose() {
		driver.quit();
	}

	
	@Given("User on unacademy home page")
	public void user_on_unacademy_home_page() {
	    System.out.println(driver.getTitle()); 
	    
	    
//	    System.out.println("Home Page: "+driver.findElement(By.xpath("//h1[contains(text()[1],'Crack UPSC CSE - GS with')]")).isDisplayed());

	    Assert.assertEquals(true, search.homePageDisplayed());
	    
	}

	@When("user searches educator name")
	public void user_searches_educator_name(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	

//	    driver.findElement(By.xpath("//div[@id=\"searchTab\"]/div[contains(@class,'MuiInputBase-root')]")).click(); //first click
	    search.searchTextBoxClick(); //change method name

	    List<String> data = dataTable.asList();
		String searchItem = data.get(0);
		System.out.println(searchItem);
//		WebElement test = driver.findElement(By.xpath("//input[@id='searchInput']"));                                                              
//		System.out.println(test.isDisplayed());
//		test.sendKeys(searchItem);
		
		
		//Classes -> CamelCase, variables -> small, package-> small, constants -> ALL_CAPITAL 
		
		
		search.searchInput(searchItem);
		
		System.out.println("Search value inserted");
		
		
		
//		driver.findElement(By.xpath("//a[contains(@href,'@sahilchhapola')]")).click();
		
//		search.searchEducatorName();
		
		
	}

	//WebDriverWait(driver,60).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@title='Log me out']"))));


	@Then("user on the educator profile details page")
	public void user_on_the_educator_profile_details_page() {
	    System.out.println(driver.getTitle());
//	    System.out.println("Educator profile page: "+driver.findElement(By.xpath("//h2[contains(@class,'EducatorHeader__Title')]")).isDisplayed());
	    Assert.assertEquals(true, search.isEducatorProfiledisplayed());
	    
	}

	@Then("user clicks on dedication icon")
	public void user_clicks_on_dedication_icon() {
//	    driver.findElement(By.xpath("//div[@class=\"MuiPaper-root Paper-f6r4fl-0 EducatorDedicationStats__Stats-sc-1hlwx9w-0 hpAChX bKHyGh MuiPaper-elevation1 MuiPaper-rounded\"]")).click();
	
		search.dedicationIconClick();
	}
	
	@Then("dedication drawyer open")
	public void dedication_drawyer_open() throws InterruptedException {

//		System.out.println("Dedication Drawyer: "+driver.findElement(By.xpath("//h2[contains(text(),'Dedications')]")).isDisplayed());
		Assert.assertEquals(true, search.isDedicationDrawyerOpen());
	
	}
	
	@Then("user clicks on each hat icon")
	public void user_clicks_on_each_hat_icon() throws InterruptedException {
//	    driver.findElement(By.xpath("(//img[@alt='hats'])[position()=1]")).click();
//		search.hat1.click();
		Assert.assertEquals(true, search.isGreenHatClick());

//	    driver.findElement(By.xpath("(//img[@alt='hats'])[position()=2]")).click();
//	    search.hat2.click();
	    Assert.assertEquals(true, search.isBlueHatClick());

//	    driver.findElement(By.xpath("(//img[@alt='hats'])[position()=3]")).click();
//	    search.hat3.click();
	    Assert.assertEquals(true, search.isPurpleHatClick());

//	    driver.findElement(By.xpath("(//img[@alt='hats'])[position()=4]")).click();
//	    search.hat4.click();
	    Assert.assertEquals(true, search.isBrownHatClick());

//	    driver.findElement(By.xpath("(//img[@alt='hats'])[position()=5]")).click();
//	    search.hat5.click();
	    Assert.assertEquals(true, search.isRedHatClick());

	}

	
	@Then("user clicks on cross icon")
	public void user_clicks_on_cross_icon() {

//				driver.findElement(By.xpath("//h2[text()='Dedications']/preceding::*[1]")).click();
		
		search.dedicationCrossIconClick();
		
	}
 
	@Then("user clicks on profile highlighter")
	public void user_clicks_on_profile_highlighter() {
//	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/div/section/h6")).click();
		
		System.out.println("Profile Highlighter going to click");
		search.profileHighlighterClick();
		System.out.println("Profile Highlighter Click");
	}

	@Then("profile highlighter drwayer open")
	public void profile_highlighter_drwayer_open() {
		
//		System.out.println("Profil highlighter Drawyer: "+driver.findElement(By.xpath("//h2[contains(text(),'Bank Exams Educators')]")).isDisplayed());
		
		Assert.assertEquals(true,search.profileDrawyerOpened());
		
	}
	
	@Then("user clicks on cross icon again")
	public void user_clicks_on_cross_icon_again() {
		//h2[text()='Dedications']/preceding::*[1]
//				driver.findElement(By.xpath("//h2[text()='Bank Exams Educators']/preceding::*[1]")).click();
		search.isProfileCrossIconClick();
	}

	@When("user click on search textbox")
	public void user_click_on_search_textbox() throws InterruptedException {
//		driver.findElement(By.xpath("//div[@id=\"searchTab\"]/div[contains(@class,'MuiInputBase-root')]")).click(); //first click
	    search.searchTextBoxClick();

	}

	@Then("Trending search list appears")
	public void trending_search_list_appears() {
	   Assert.assertEquals(true, search.isTrendingListAppeared());
	}

	@Then("user clicks an item from Trending search list")
	public void user_clicks_an_item_from_Trending_search_list() {
//		WebElement test = driver.findElement(By.xpath("//*[@id=\"searchTab\"]/div[2]/div/div/a[2]")); //do it by index  
//		System.out.println("Sahil is clickable from Trending search list"+test.isDisplayed());
//		test.click();
		search.trendingSearchItemClick();
	}

 

	@Then("Educator search list appear")
	public void educator_search_list_appear() {
		System.out.println(driver.getTitle());
	    
//		System.out.println("Educator Search list "+driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div[2]/h4[1]")).isDisplayed()); 
	
		Assert.assertEquals(true, search.isEducatorSearchListDisplayed());
		System.out.println("Educator search list appear!");
	}

	
	@When("user searches course name as {string}")
	public void user_searches_course_name_as(String courseName) throws InterruptedException {
		
//		driver.findElement(By.xpath("//div[@id=\"searchTab\"]/div[contains(@class,'MuiInputBase-root')]")).click(); //first click
		
		search.searchBoxForCourseClick();


//		WebElement Coursename = driver.findElement(By.xpath("//input[@id='searchInput']"));                                                              
//		System.out.println(Coursename.isDisplayed());
//		Coursename.sendKeys(courseName);
	    
	    search.searchBoxClick(courseName);
		
		System.out.println("Search value inserted");
		

		
		
//		driver.findElement(By.xpath("//*[@id=\"searchTab\"]/div[2]/div/div/a[1]/div/div")).click();
		search.searchItemClick();
		

	}

	@Then("course search list appear")
	public void course_search_list_appear() {
		
//		System.out.println("Courses search list: "+driver.findElement(By.xpath("//h2[contains(text(),'Courses & test series')]")).isDisplayed());
		
		Assert.assertEquals(true, search.courseSearchListAppeared());
	}

	@Then("user clicks on specific course")
	public void user_clicks_on_specific_course() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(45,65)");
//	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div[2]/div[4]/div/div[1]/div/a/div")).click();
		
		search.isCourseClick();
	}

	@Then("course preview page appear")
	public void course_preview_page_appear() {
//		driver.findElement(By.xpath("//h2[text()='Login']/preceding::*[1]")).click();
		

//		System.out.println("Course preview Page: "+driver.findElement(By.xpath("//h1[@class=\"H3-sc-1rp46r8-0 PlusCourseHeader__CourseTitle-sc-1lavlgt-4 joSVbX cXmHxN\"]")).isDisplayed());
	
		Assert.assertEquals(true, search.isCoursePreviewPageDisplayed());
	
	}

	@Then("user clicks on share button")
	public void user_clicks_on_share_button() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/button[2]")).click();
		search.shareButtonClick();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(search.shareBox));
		
	}

	@Then("user copies the share link")
	public void user_copies_the_share_link() throws InterruptedException {
		
//		System.out.println("Share dialogue box: "+driver.findElement(By.xpath("//h3[contains(text(),'Share via')]")).isDisplayed());
		Assert.assertEquals(true, search.shareDialogueBoxDisplayed());
//	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/h6[2]")).click();
		
		search.shareLinkCopied();
	    System.out.println("Share link copied!");
	    
	}
	@Then("user clicks on the social media icon")
	public void user_clicks_on_the_social_media_icon() throws InterruptedException {
//	    driver.findElement(By.xpath("//h3[text()='Share via']/following::*[2]")).click();
//	    driver.findElement(By.xpath("//h3[text()='Share via']/following::*[4]")).click();
		search.clickFaceBookIcon();
		search.clickTwitterIcon();
		
		
	}

}
