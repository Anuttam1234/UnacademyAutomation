package PageFactory;

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
	WebElement HomePage;
	@FindBy(xpath= "//div[@id=\"searchTab\"]/div[contains(@class,'MuiInputBase-root')]")
	public
	WebElement SearchTextBox;
	@FindBy(xpath= "//input[@id='searchInput']")
	public
	WebElement SearchInput;
	@FindBy(xpath= "//a[contains(@href,'@sahilchhapola')]") // need change name 
	public 
	WebElement SearchSahil;
	@FindBy(xpath= "//h2[contains(@class,'EducatorHeader__Title')]")
	public
	WebElement EducatorProfile;
	
	public boolean isEducatorProfiledisplayed()
	{  
		return EducatorProfile.isDisplayed();
	}
	
	@FindBy(xpath= "//div[contains(@class,'EducatorDedicationStats__Stats')]")
	public
	WebElement DedicationIcon;
	
	public void dedicationIconClicked()
	{  
		DedicationIcon.click();
	}
	
	
	@FindBy(xpath= "//h2[contains(text(),'Dedications')]")
	public
	WebElement DedicationDrawyer;
	public void isDedicationDrawyerOpen()
	{  
		DedicationIcon.click();
	}
	@FindBy(xpath= "//img[@alt='hats'])[position()=1]")  
	public
	WebElement Hat1;
	public void hat1Clicked()
	{  
		Hat1.click();
	}
	
	@FindBy(xpath= "//img[@alt='hats'])[position()=2]")
	public
	WebElement Hat2;
	public void hat2Clicked()
	{  
		Hat2.click();
	}
	@FindBy(xpath= "//img[@alt='hats'])[position()=3]")
	public
	WebElement Hat3;
	public void hat3Clicked()
	{  
		Hat3.click();
	}
	@FindBy(xpath= "//img[@alt='hats'])[position()=4]")
	public
	WebElement Hat4;
	public void hat4Clicked()
	{  
		Hat4.click();
	}
	@FindBy(xpath= "//img[@alt='hats'])[position()=5]")
	public
	WebElement Hat5;
	public void hat5Clicked()
	{  
		Hat5.click();
	}
	@FindBy(xpath= "//h2[text()='Dedications']/preceding::*[1]")
	public
	WebElement DedicationCrossIcon;
	public void dedicationCrossIconClicked()
	{  
		DedicationCrossIcon.click();
	}
	@FindBy(xpath= "//*[@id=\\\"__next\\\"]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/div/section/h6")
	public
	WebElement ProfileHighlighter;
	public void profileHighlighterClicked()
	{  
		ProfileHighlighter.click();
	}
	@FindBy(xpath= "//h2[contains(text(),'Bank Exams Educators')]")
	public
	WebElement ProfileDrawyer;
	public void profileDrawyerOpened()
	{  
		ProfileDrawyer.click();
	}
	@FindBy(xpath= "//h2[text()='Bank Exams Educators']/preceding::*[1]")
	public
	WebElement ProfileCrossIcon;
	public void profileCrossIconClicked()
	{  
		ProfileCrossIcon.click();
	}
	@FindBy(xpath= "//div[@id=\\\"searchTab\\\"]/div[contains(@class,'MuiInputBase-root')]")
	public
	WebElement SearchfromTrending;
	public void profileCrossIconClicked()
	{  
		ProfileCrossIcon.click();
	}
//	@FindBy(xpath= "//h1[contains(text()[1],'Crack UPSC CSE - GS with')]")
//	public
//	WebElement HomePage;
	@FindBy(xpath= "//*[@id=\\\"searchTab\\\"]/div[2]/div/div/a[2]")
	public
	WebElement TrendingSearchItem;
	public void profileCrossIconClicked()
	{  
		ProfileCrossIcon.click();
	}
	@FindBy(xpath= "//*[@id=\\\"__next\\\"]/div[1]/div[1]/div[2]/h4[1]")
	public
	WebElement EducatorSearchList;
	public void isEducatorSearchListDisplayed()
	{  
		ProfileCrossIcon.click();
	}
	@FindBy(xpath= "//div[@id=\\\"searchTab\\\"]/div[contains(@class,'MuiInputBase-root')]")
	public
	WebElement ClickSearchTextBox;
	public void profileCrossIconClicked()
	{  
		ProfileCrossIcon.click();
	}
	@FindBy(xpath= "//input[@id='searchInput']")
	public
	WebElement InputCourse;
	@FindBy(xpath= "//*[@id=\\\"searchTab\\\"]/div[2]/div/div/a[1]/div/div")
	public
	WebElement ClickSearchItem;
	@FindBy(xpath= "//h2[contains(text(),'Courses & test series')]")
	public
	WebElement CourseSearchListApear;
	@FindBy(xpath= "//*[@id=\\\"__next\\\"]/div[1]/div[1]/div[2]/div[4]/div/div[1]/div/a/div")
	public
	WebElement ClickCourse;
	@FindBy(xpath= "//h2[text()='Login']/preceding::*[1]")
	public
	WebElement CoursePreviewPage;
	@FindBy(xpath= "//*[@id=\\\"__next\\\"]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/button[2]")
	public
	WebElement ShareButton;
	@FindBy(xpath= "//h3[contains(text(),'Share via')]")
	public
	WebElement ShareBox;
	@FindBy(xpath= "/html/body/div[3]/div[3]/div/div/div[2]/h6[2]")
	public
	WebElement CopyShareLink;
	@FindBy(xpath= "//h3[text()='Share via']/following::*[2]")
	public
	WebElement FacebookIcon;
	@FindBy(xpath= "//h3[text()='Share via']/following::*[4]")
	public
	WebElement TwitterIcon;
	
	

	public SearchPF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void homePage()
	{  
		System.out.println(HomePage.isDisplayed()); //return it to the step definition file and there I need to write Assert functions.
	}
	public void searchTextBox()
	{  
		SearchTextBox.click();
	}
	public void searchInput(String searchItem)
	{  
		SearchInput.sendKeys(searchItem);
	}
	public void searchSahil()
	{  
		SearchSahil.click();
	}

	
	
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
//	public void searchInput()
//	{  
//		SearchTextBox.click();
//	}
	

	

}
