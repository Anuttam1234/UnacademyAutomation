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
	@FindBy(xpath= "//a[contains(@href,'@sahilchhapola')]")
	public
	WebElement SearchSahil;
	@FindBy(xpath= "//h2[contains(text(),'Sahil Chhapola')]")
	public
	WebElement EducatorProfile;
	@FindBy(xpath= "//div[@class=\\\"MuiPaper-root Paper-f6r4fl-0 EducatorDedicationStats__Stats-sc-1hlwx9w-0 hpAChX bKHyGh MuiPaper-elevation1 MuiPaper-rounded\\\"]")
	public
	WebElement DedicationIcon;
	@FindBy(xpath= "//h2[contains(text(),'Dedications')]")
	public
	WebElement DedicationDrawyer;
	@FindBy(xpath= "//*[@id=\\\"DrawerPaper\\\"]/div[2]/div[1]/div[1]")
	public
	WebElement Hat1;
	@FindBy(xpath= "//*[@id=\\\"DrawerPaper\\\"]/div[2]/div[2]/div[1]")
	public
	WebElement Hat2;
	@FindBy(xpath= "//*[@id=\\\"DrawerPaper\\\"]/div[2]/div[3]/div[1]")
	public
	WebElement Hat3;
	@FindBy(xpath= "//*[@id=\\\"DrawerPaper\\\"]/div[2]/div[4]/div[1]")
	public
	WebElement Hat4;
	@FindBy(xpath= "//*[@id=\\\"DrawerPaper\\\"]/div[2]/div[5]/div[1]")
	public
	WebElement Hat5;
	@FindBy(xpath= "//h2[text()='Dedications']/preceding::*[1]")
	public
	WebElement DedicationCross;
	@FindBy(xpath= "//*[@id=\\\"__next\\\"]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/div/section/h6")
	public
	WebElement ProfileHighlighter;
	@FindBy(xpath= "//h2[contains(text(),'Bank Exams Educators')]")
	public
	WebElement ProfileDrawyer;
	@FindBy(xpath= "//h2[text()='Bank Exams Educators']/preceding::*[1]")
	public
	WebElement ProfileCross;
	@FindBy(xpath= "//div[@id=\\\"searchTab\\\"]/div[contains(@class,'MuiInputBase-root')]")
	public
	WebElement SearchfromTrending;
//	@FindBy(xpath= "//h1[contains(text()[1],'Crack UPSC CSE - GS with')]")
//	public
//	WebElement HomePage;
	@FindBy(xpath= "//*[@id=\\\"searchTab\\\"]/div[2]/div/div/a[2]")
	public
	WebElement TrendingSearchItem;
	@FindBy(xpath= "//*[@id=\\\"__next\\\"]/div[1]/div[1]/div[2]/h4[1]")
	public
	WebElement EducatorSearchList;
	@FindBy(xpath= "//div[@id=\\\"searchTab\\\"]/div[contains(@class,'MuiInputBase-root')]")
	public
	WebElement ClickSearchTextBox;
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
		System.out.println(HomePage.isDisplayed());
	}
	public void searchTextBox()
	{  
		SearchTextBox.click();
	}
	public void searchInput()
	{  
		SearchTextBox.click();
	}

	

}
