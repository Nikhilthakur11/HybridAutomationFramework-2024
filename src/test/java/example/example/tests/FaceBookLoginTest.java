package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.DataDriven.ExcelDataProvider;
import example.example.factory.PageinstancesFactory;
import example.example.pages.FacebookLoginPage;

/**
 * The Class FaceBookLoginTest.
 *
 * @author Bharathish
 */
@Test(testName = "Facebook login test", description = "Facebook login test")
public class FaceBookLoginTest extends BaseTest {
	ExcelDataProvider dr=new ExcelDataProvider();

	@Test(dataProvider="excelData",dataProviderClass=ExcelDataProvider.class)
	public void facebookLoginTest(String email,String pwd) {
		driver.get("https://www.facebook.com/");
		FacebookLoginPage facebookLoginPage = PageinstancesFactory.getInstance(FacebookLoginPage.class);
		facebookLoginPage.enterEmail(email).enterPassword(pwd).clickSignIn();
		Assert.assertTrue(false, "Login failed : Test failed");
	}
}
