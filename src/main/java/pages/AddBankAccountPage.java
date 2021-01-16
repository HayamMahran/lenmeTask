package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddBankAccountPage extends PageBase{

	public AddBankAccountPage(WebDriver driver) {
		super(driver);
	}
	  @FindBy(id="")
	  WebElement addbankaccountbtn;
	  
	  public void clickaddbankbtn() {
		  addbankaccountbtn.click();
	  }
	  
	  public String getpageurl() {
		  
		  String url = driver.getCurrentUrl();
		  return url;
	  }

}
