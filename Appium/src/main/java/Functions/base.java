package Functions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	public static AndroidDriver<AndroidElement> driver;

	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\global.properties");
		File appDir = new File("\\\\src\\\\main\\\\java\\\\");
		Properties prop = new Properties();
		prop.load(fis);
		File app = new File("API Demos for Android_v1.9.0_apkpure.com.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Anant");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability("autoGrantPermissons",true);
		cap.setCapability("appWaitActivity","crc6405781c75b4251b04.MainActivity");
		cap.setCapability("noReset",true);
		driver=new AndroidDriver<AndroidElement>(new URL("http:/127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
}
