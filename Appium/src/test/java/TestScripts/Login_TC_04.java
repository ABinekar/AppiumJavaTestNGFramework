package TestScripts;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Functions.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import testData.testData_Login;
import com.relevantcodes.extentreports.*;

public class Login_TC_04 extends base {
	public WebDriver driver;
	public ExtentTest test;

	@Test(dataProviderClass = testData_Login.class, dataProvider = "Login_TC_01")
	public void Login_TC_1(String strTestCaseID, String strTestCaseName, String strTestCaseDescription, String userName,
			String password, String strType) throws Exception {

		AndroidDriver<AndroidElement> driver = capabilities("appName");

		// important webelements in selenium with operations
		WebElement ele = driver.findElement(By.xpath("//tagnae[@attribute='Value']"));

		// 1. input box ele.sendKeys("Anant");
		ele.sendKeys("Anant");

		// Presense of element on the page
		ele.isDisplayed();

		// 2. button
		ele.click();

		// 3. getText
		String msg = ele.getText();

		// 4.Dropdown
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByVisibleText("Anant");
		s.selectByValue("Anant");

		// 5.GetText with attribute
		String msgs = ele.getAttribute("value");

		// 7. scolling

		// 8. Javascript

		// ArrayList
		List<AndroidElement> l = driver.findElements(By.xpath("//tagname[@class='msg']"));
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < al.size(); i++) {
			al.add(al.get(i));
		}

		// 9. Implicite wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 12.Close App
		driver.closeApp();

		// 13. wait or halt script
		Thread.sleep(2000);

		// 14.USeful string method
		String strName = "ANant Binekar";
		strName.equals("Anant");
		strName.contains("Anant");

		// 17.Refresh page
		driver.navigate().refresh();
		driver.navigate().back();

		// BASICS COMMANDS-MOBILE AUTOMATION-APPIUM
		// Some Basics Commands to Execute in Mobile Automation-Appium

		// – One of App Installation Commands

		// driver.installApp(“Location of the apk file”);

		// – One of Commands To Verify App is Installed

		// driver.isAppInstalled(“app package name”);

		// – One of Commandd to Remove App

		// driver.removeApp();

		// – Commands to Launch Mobile App

		// AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new
		// URL(“http://127.0.0.1:4723/wd/hub”), caps);

		// or

		// AndroidDriver driver = new AndroidDriver(new
		// URL(“http://127.0.0.1:4723/wd/hub”), caps);

		// – One of Commands to Single Tap

		// TouchActions action = new TouchActions(driver);

		// action.singleTap(Element element);

		// action.perform();

		// – One of Commands to Double Tap

		// TouchActions action = new TouchActions(driver);

		// action.doubleTap(Element element);

		// action.perform();

		// – Press Key Command

		driver.pressKeyCode(AndroidKeyCode.HOME); // This is Example Key

		// or

		driver.pressKeyCode(5); // This is Example Key

		// -Show Keyboard

		driver.getKeyboard();

		// – To Hide Keyboard

		driver.hideKeyboard();

		// – Command to Rotate Device

		driver.rotate(ScreenOrientation.PORTRAIT);

		// or

		driver.rotate(ScreenOrientation.LANDSCAPE);

		// – One of Commands To Get Device Name

		driver.getDeviceTime();

		// – One of Commands To Know Device Time

		driver.getDeviceTime();

		// – Command to Lock Device

		driver.lockDevice();

		// – Command to Unlock Device

		driver.unlockDevice();

		// – Command to Open Notification

		driver.openNotifications();

		// – Command to Know Device is Locked

		driver.isDeviceLocked();

		// – One of Commands to Scroll Screen

		TouchActions action = new TouchActions(driver);

		// action.scroll(x, y).perform(); // need to add x and y offset

		// – One of Commands to Long Press on Element

		// driver.longPress(WebElement element);

		// – One of Commands to Know Current Setting of Device

		Map settings = driver.getSettings();

		// – One of Commands to Know Current Location of Device and to Set New

		driver.location();

		// Location location = new Location(56.46854, 15.63145, 506); // This is for
		// Example

		// driver.setLocation(location);
		
		
		/*
		 * LIST OF ADB COMMANDS Let’s discuss ADB commands according to their usability.
		 * 
		 * Here we go!
		 * 
		 * ADB COMMANDS FOR DEVICE CONFIGURATION ADB Command to find a list of connected
		 * devices
		 * 
		 * 
		 * 
		 * adb devices ADB Command to run in the terminal of host Android device
		 * 
		 * adb shell ADB Command to switch to USB mode
		 * 
		 * adb usb ADB Command to start TCP IP Connection
		 * 
		 * adb tcpip [portNo] ADB Command to connect devices over Wi-Fi
		 * 
		 * adb connect [device’s IP address] ADB Command to check ADB’s version
		 * 
		 * adb version ADB Command to display logs of connected devices
		 * 
		 * adb logcat ADB COMMANDS FOR INSTALLING & UPDATING APPS ADB Command to install
		 * APK or package
		 * 
		 * adb install [package name or apk’s path] adb –e install [file.apk[ (- e used
		 * for active emulator) adb –d install [file.apk[ (- d used for connected USB)
		 * ADB Command to uninstall APK of package
		 * 
		 * adb uninstall [package name or apk’s path] ADB Command to update the app
		 * 
		 * adb install –r [apk] ADB COMMANDS TO GET ANDROID APP PACKAGE & APP ACTIVITY
		 * adb devices adb shell dumpsys window windows | grep –E
		 * ‘mCurrentFocus|mFocusedApp’ ADB COMMANDS FOR FILE SHARING ADB Command to copy
		 * files from phone to computer
		 * 
		 * adb pull <source folder><destination folder> ADB Command to send files from
		 * computer to phone
		 * 
		 * adb push <source folder><destination folder> ADB COMMANDS FOR SERVER adb
		 * start- server (It starts the server, if not running) adb kill-server (It
		 * terminated the adb server)
		 */
		
	}

}
