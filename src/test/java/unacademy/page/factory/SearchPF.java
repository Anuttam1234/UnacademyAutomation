package unacademy.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPF {
	
	
	public WebDriver driver;
	@CacheLookup
	@FindBy(xpath= "//h1[contains(text()[1],'Crack UPSC CSE - GS with')]")
	public
	WebElement homePage;
	@FindBy(xpath= "//div[@id=\"searchTab\"]/div[contains(@class,'MuiInputBase-root')]")
	public
	WebElement searchTextBox;
	@FindBy(xpath= "//input[@id='searchInput']")
	public
	WebElement searchInput;
	@FindBy(xpath= "//a[contains(@href,'@sahilchhapola')]") // need change name 
	public 
	WebElement searchEducator;
	@FindBy(xpath= "//h2[contains(@class,'EducatorHeader__Title')]")
	public
	WebElement educatorProfile;
	
	public boolean isEducatorProfiledisplayed()
	{  
		return educatorProfile.isDisplayed();
	}
	
	@FindBy(xpath= "//div[contains(@class,'EducatorDedicationStats__Stats')]")
	public
	WebElement dedicationIcon;
	
	public void dedicationIconClicked()
	{  
		dedicationIcon.click();
	}
	
	
	@FindBy(xpath= "//h2[contains(text(),'Dedications')]")
	public
	WebElement dedicationDrawyer;
	public void isDedicationDrawyerOpen()
	{  
		dedicationIcon.click();
	}
	@FindBy(xpath= "//img[@alt='hats'])[position()=1]")  
	public
	WebElement hat1;
	public void hat1Clicked()
	{  
		hat1.click();
	}
	
	@FindBy(xpath= "//img[@alt='hats'])[position()=2]")
	public
	WebElement hat2;
	public void hat2Clicked()
	{  
		hat2.click();
	}
	@FindBy(xpath= "//img[@alt='hats'])[position()=3]")
	public
	WebElement hat3;
	public void hat3Clicked()
	{  
		hat3.click();
	}
	@FindBy(xpath= "//img[@alt='hats'])[position()=4]")
	public
	WebElement hat4;
	public void hat4Clicked()
	{  
		hat4.click();
	}
	@FindBy(xpath= "//img[@alt='hats'])[position()=5]")
	public
	WebElement hat5;
	public void hat5Clicked()
	{  
		hat5.click();
	}
	@FindBy(xpath= "//h2[text()='Dedications']/preceding::*[1]")
	public
	WebElement dedicationCrossIcon;
	public void dedicationCrossIconClicked()
	{  
		dedicationCrossIcon.click();
	}
	@FindBy(xpath= "//*[@id=\\\"__next\\\"]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/div/section/h6")
	public
	WebElement profileHighlighter;
	public void profileHighlighterClicked()
	{  
		profileHighlighter.click();
	}
	@FindBy(xpath= "//h2[contains(text(),'Bank Exams Educators')]")
	public
	WebElement profileDrawyer;
	public boolean profileDrawyerOpened()
	{  
		return profileDrawyer.isDisplayed();
	}
	@FindBy(xpath= "//h2[text()='Bank Exams Educators']/preceding::*[1]")
	public
	WebElement profileCrossIcon;
	public void profileCrossIconClicked()
	{  
		profileCrossIcon.click();
	}
	@FindBy(xpath= "//div[@id=\\\"searchTab\\\"]/div[contains(@class,'MuiInputBase-root')]")
	public
	WebElement searchFromTrending;
	public void searchFromTrending()
	{  
		searchFromTrending.click();
	}
//	@FindBy(xpath= "//h1[contains(text()[1],'Crack UPSC CSE - GS with')]")
//	public
//	WebElement HomePage;
	
	@FindBy(xpath= "//*[@id=\\\"searchTab\\\"]/div[2]/div/div/a[2]")
	public
	WebElement trendingSearchItem;
	public void trendingSearchItemClicked()
	{  
		trendingSearchItem.click();
	}
	@FindBy(xpath= "//h2[contains(text(),'Educators')]")
	public
	WebElement educatorSearchList;
	public boolean isEducatorSearchListDisplayed()
	{  
		return educatorSearchList.isDisplayed();
	}
	@FindBy(xpath= "//div[@id=\\\"searchTab\\\"]/div[contains(@class,'MuiInputBase-root')]")
	public
	WebElement clickSearchTextBox;
	public void searchBoxForCourseClicked()
	{  
		clickSearchTextBox.click();
	}
	@FindBy(xpath= "//input[@id='searchInput']")
	public
	WebElement inputCourse;
	public void searchBoxClicked(String courseName)
	{  
		inputCourse.sendKeys(courseName);
	}
	@FindBy(xpath= "//*[@id=\\\"searchTab\\\"]/div[2]/div/div/a[1]/div/div")
	public
	WebElement clickSearchItem;
	
	public void searchItemClicked()
	{  
		clickSearchItem.click();
	}
	
	@FindBy(xpath= "//h2[contains(text(),'Courses & test series')]")
	public
	WebElement courseSearchListAppear;
	
	public boolean courseSearchListAppeared()
	{  
		return courseSearchListAppear.isDisplayed();
	}
	
	@FindBy(xpath= "//img[contains(@loading,'lazy')]")
	public
	WebElement clickCourse;
	
	public void clickCourse() {
		clickCourse.click();
	}
	
	@FindBy(xpath= "//h2[text()='Login']/preceding::*[1]")
	public
	WebElement crossLoginIcon;
	
	@FindBy(xpath= "//h1[contains(text(),'Comprehensive Course on')]")
	public
	WebElement coursePreviewPage;
	
	public boolean coursePreviewPage() {
		crossLoginIcon.click();
		return coursePreviewPage.isDisplayed();
	}
	
	@FindBy(xpath= "//*[@id=\\\"__next\\\"]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/button[2]")
	public
	WebElement shareButton;
	
	public void shareButtonClicked() {
		shareButton.click();
	}
	
	@FindBy(xpath= "//h3[contains(text(),'Share via')]")
	public
	WebElement shareBox;
	
	public void shareDialogueBoxDisplayed() {
		shareBox.click();
	}
	
	@FindBy(xpath= "/html/body/div[3]/div[3]/div/div/div[2]/h6[2]")
	public
	WebElement copyShareLink;
	
	public void shareLinkCopied() {
		copyShareLink.click();
	}
	@FindBy(xpath= "//h3[text()='Share via']/following::*[2]")
	public
	WebElement faceBookIcon;
	
	public void clickFaceBookIcon() {
		faceBookIcon.click();
	}
	
	@FindBy(xpath= "//h3[text()='Share via']/following::*[4]")
	public
	WebElement twitterIcon;
	
	public void clickTwitterIcon() {
		twitterIcon.click();
	}

	public SearchPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void homePageDisplayed()
	{  
		System.out.println(homePage.isDisplayed()); //return it to the step definition file and there I need to write Assert functions.
	}
	public void searchTextBoxClicked()
	{  
		searchTextBox.click();
	}
	public void searchInput(String searchItem)
	{  
		searchInput.sendKeys(searchItem);
	}
	public void searchEducatorName()
	{  
		searchEducator.click();
	}

	
	
	

	

}
