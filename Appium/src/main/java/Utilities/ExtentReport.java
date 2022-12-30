package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {
	public static com.relevantcodes.extentreports.ExtentTest test;
	public static ExtentReports report;

	public static com.relevantcodes.extentreports.ExtentTest Status(String strTestCaseName,
			String strTestCaseDescription, String reportName) {
		Date date = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("MM/dd/yyyy");
		String stringDate = DateFor.format(date);
		DateFor = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		stringDate = DateFor.format(date);
		String date1 = stringDate.replace(" ", "_");
		String date2 = date1.replace(":", "-");

		report = new ExtentReports(
				System.getProperty("user.dir") + "\\src\\main\\java\\Reports\\" + reportName + "_" + date2 + ".html");
		test = report.startTest(strTestCaseName, strTestCaseDescription);
		return test;
	}

	public static void Flush() {
		report.endTest(test);
		report.flush();
	}

	/*
	 * public static ExtentTest Status(String TestName, String TestCaseDescription)
	 * {
	 * 
	 * ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	 * 
	 * ExtentReports extent = new ExtentReports();
	 * 
	 * extent.attachReporter(htmlReporter);
	 * 
	 * ExtentTest test = extent.createTest(TestName, TestCaseDescription);
	 * 
	 * return test;
	 * 
	 * }
	 * 
	 * public static ExtentReports Flush(String reportName) { Date date = new
	 * Date(); SimpleDateFormat DateFor = new SimpleDateFormat("MM/dd/yyyy"); String
	 * stringDate = DateFor.format(date); DateFor = new
	 * SimpleDateFormat("dd-M-yyyy hh:mm:ss"); stringDate = DateFor.format(date);
	 * String date1 = stringDate.replace(" ", "_"); String date2 =
	 * date1.replace(":", "-"); ExtentHtmlReporter htmlReporter = new
	 * ExtentHtmlReporter( System.getProperty("user.dir") +
	 * "\\src\\main\\java\\Reports" + reportName + "_" + date2 + ".html");
	 * ExtentReports extent = new ExtentReports();
	 * 
	 * extent.attachReporter(htmlReporter);
	 * 
	 * htmlReporter.config().setChartVisibilityOnOpen(true);
	 * htmlReporter.config().setDocumentTitle("Simple Automation Report");
	 * htmlReporter.config().setReportName("Test Report");
	 * htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	 * htmlReporter.config().setTheme(Theme.STANDARD); htmlReporter.config().
	 * setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	 * 
	 * return extent;
	 * 
	 * }
	 */

}
