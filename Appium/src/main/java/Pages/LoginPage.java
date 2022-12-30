package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage {

	public AndroidDriver<AndroidElement> driver;

	By username = By.xpath("//input[@id='username']");

	public boolean displayUsername() {
		return driver.findElement(username).isDisplayed();
	}

	public void typeUserName(String name) {
		driver.findElement(username).sendKeys(name);
	}

	By Password = By.xpath("//input[@id='password']");

	public boolean displayPassword() {
		return driver.findElement(Password).isDisplayed();
	}

	public void typePassword(String name) {
		driver.findElement(Password).sendKeys(name);
	}


	By SignIn = By.xpath("//input[@id='signInBtn']");

	public boolean displaySignIn() {
		return driver.findElement(SignIn).isDisplayed();
	}

	public void clickSignIn() {
		driver.findElement(SignIn).click();
	}

	
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

}
