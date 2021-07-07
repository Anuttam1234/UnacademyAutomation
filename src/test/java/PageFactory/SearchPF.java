package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPF {
	
	
	
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text()[1],'Crack UPSC CSE - GS with')]")
	WebElement HomePage;

	public SearchPF() {
		// TODO Auto-generated constructor stub
		
		
		
	}

}
