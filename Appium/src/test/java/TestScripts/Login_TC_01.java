package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Functions.base;
import Pages.LoginPage;
import Utilities.ExtentReport;
import Utilities.captureScreenshots;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import testData.testData_Login;
import com.relevantcodes.extentreports.*;

public class Login_TC_01 extends base {
	public WebDriver driver;
	public ExtentTest test;

	@Test(dataProviderClass = testData_Login.class, dataProvider = "Login_TC_01")
	public void Login_TC_1(String strTestCaseID, String strTestCaseName, String strTestCaseDescription, String userName,
			String password, String strType) throws Exception {

		AndroidDriver<AndroidElement> driver=capabilities("appName");
		
		test = ExtentReport.Status(strTestCaseID + "--" + strTestCaseName, strTestCaseDescription, strTestCaseID);

		LoginPage lp = new LoginPage(driver);

		if (lp.displayUsername()) {
			lp.typeUserName(userName);

			test.log(LogStatus.PASS, "Username field is availble and entered value is [ " + userName + " ]",
					test.addScreenCapture(captureScreenshots.getScreenshot(driver)));
		} else {
			test.log(LogStatus.FAIL, "Username field is not availble ",
					test.addScreenCapture(captureScreenshots.getScreenshot(driver)));
		}

		if (lp.displayPassword()) {
			lp.typePassword(password);
			test.log(LogStatus.PASS, "Password field is availble and entered value is [ " + password + " ]");
		} else {
			test.log(LogStatus.FAIL, "Password field is not availble ");
		}

		if (lp.displaySignIn()) {
			lp.clickSignIn();
			test.log(LogStatus.PASS, "Sign In button is availble and clicked");
		} else {
			test.log(LogStatus.FAIL, "Sign In button is not availble");
		}

		driver.quit();
		ExtentReport.Flush();
	}

}
