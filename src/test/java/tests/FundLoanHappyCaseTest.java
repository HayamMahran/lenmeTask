package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AddBankAccountPage;
import pages.BankAccountPage;
import pages.CompleteFundLoanPage;

public class FundLoanHappyCaseTest extends TestBase{

	CompleteFundLoanPage fundloanpageobject;
	BankAccountPage bankaccpageobject;
	AddBankAccountPage addbankaccountobject;

	
	@DataProvider(name= "testdata")
	public static Object[][] lenderdata() {
		
		return new Object[][]{
			//testdata of lender with enough balance and verified account
			{"lenderbalance","loanamount"},
			//testdata of lender with low balance and verified account
			{"lenderbalance","loanamount"},
			//testdata of unverified lender 
			{"lenderbalance","loanamount"}
			};
	}

	@Test(dataProvider = "testdata" )
	public void fundloansuccessfully(int lenderbalance, int loanamount) {

		fundloanpageobject =new CompleteFundLoanPage(driver);
		if (lenderbalance >= loanamount) {
			fundloanpageobject.clickfundloanbutton();
			Assert.assertTrue(fundloanpageobject.successmsgtxt.getText().contains("success message"));
		}
		else {
			fundloanpageobject.clickfundloanbutton();
			Assert.assertTrue(fundloanpageobject.errormsgtxt.getText().contains("error message"));
			if(fundloanpageobject.getpageurl().contains("bankaccount")) {

				bankaccpageobject.clickaddbalancebtn();
				Assert.assertTrue(fundloanpageobject.getpageurl().contains("fundloan"));
				fundloanpageobject.clickfundloanbutton();
				Assert.assertTrue(fundloanpageobject.successmsgtxt.getText().contains("success message"));}
			else if(addbankaccountobject.getpageurl().contains("addbankaccount")) {
				addbankaccountobject.clickaddbankbtn();

			}
		}

	}
}

