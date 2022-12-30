package TestScripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class Login_TC_03 extends base {
	public WebDriver driver;
	public ExtentTest test;

	@Test(dataProviderClass = testData_Login.class, dataProvider = "Login_TC_03")
	public void Login_TC_1(String strTestCaseID, String strTestCaseName, String strTestCaseDescription, String userName,
			String password, String strType) throws Exception {

		AndroidDriver<AndroidElement> driver=capabilities("appName");
		test = ExtentReport.Status(strTestCaseID + "--" + strTestCaseName, strTestCaseDescription, strTestCaseID);

		LoginPage lp = new LoginPage(driver);

		ArrayList<String> a = new ArrayList<String>();

		List<AndroidElement> fields = driver.findElements(By.xpath("//label[@class='text-white']"));
		List<AndroidElement> radiobtns = driver.findElements(By.xpath("//span[@class='radiotextsty']"));
		WebElement checkText = driver.findElement(By.xpath("//span[@class='text-white termsText']"));
		WebElement credentialText = driver.findElement(By.xpath("//p[@class='text-center text-white']"));

		for (int i = 0; i < fields.size(); i++) {
			a.add(fields.get(i).getText());
		}

		for (int i = 0; i < radiobtns.size(); i++) {
			a.add(radiobtns.get(i).getText());
		}
		System.out.println(a);
		if (a.contains("Username:")) {
			test.log(LogStatus.PASS, "Username label is availble on the login page",
					test.addScreenCapture(captureScreenshots.getScreenshot(driver)));
		} else {
			test.log(LogStatus.FAIL, "Username label is not availble on the login page",
					test.addScreenCapture(captureScreenshots.getScreenshot(driver)));
		}

		if (a.contains("Password:")) {
			test.log(LogStatus.PASS, "Password label is availble on the login page");
		} else {
			test.log(LogStatus.FAIL, "Password label is not availble on the login page");
		}

		if (a.contains("Admin")) {
			test.log(LogStatus.PASS, "Admin radio button is availble on the login page");
		} else {
			test.log(LogStatus.FAIL, "Admin radio button is not availble on the login page");
		}

		if (a.contains("User")) {
			test.log(LogStatus.PASS, "User radio button is availble on the login page");
		} else {
			test.log(LogStatus.FAIL, "User radio button is not availble on the login page");
		}

		if (checkText.getText().contains("I Agree to the ")) {
			System.out.println("Anant " + checkText.getText());
			test.log(LogStatus.PASS, "I Agree to the terms and conditions text is availble on the login page");
		} else {
			test.log(LogStatus.FAIL, "I Agree to the terms and conditions text is availble on the login page");
		}

		if (lp.displaySignIn()) {

			test.log(LogStatus.PASS, "Sign In button is availble on the login page");
		} else {
			test.log(LogStatus.FAIL, "Sign In button is not availble on the login page");
		}

		if (credentialText.getText().contains("(username is ")) {
			System.out.println("Anant " + credentialText.getText());
			test.log(LogStatus.PASS,
					"(username is rahulshettyacademy and Password is learning) text is availble on the login page");
		} else {
			test.log(LogStatus.FAIL,
					"(username is rahulshettyacademy and Password is learning) text is availble on the login page");
		}

		driver.quit();
		ExtentReport.Flush();
	}

}
