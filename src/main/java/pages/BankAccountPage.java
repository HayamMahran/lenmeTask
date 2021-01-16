package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankAccountPage extends PageBase{

	public BankAccountPage(WebDriver driver) {
		super(driver);
	}
	
  @FindBy(id="")
  WebElement addbalancebtn;
  
  public void clickaddbalancebtn() {
	  addbalancebtn.click();
  }
  
  public String getpageurl() {
	  
	  String url = driver.getCurrentUrl();
	  return url;
  }
}
