package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompleteFundLoanPage extends PageBase{

	public CompleteFundLoanPage(WebDriver driver) {
		super(driver);
	}

	//finds elements in the page
	@FindBy(id="")
	WebElement fundloanbtn;
	
	@FindBy(id="")
    public WebElement successmsgtxt;
	
	@FindBy(id="")
    public WebElement errormsgtxt;
	
	public void clickfundloanbutton() {
		fundloanbtn.click();
	}

	  public String getpageurl() {
		  
		  String url = driver.getCurrentUrl();
		  return url;
	  }
}
