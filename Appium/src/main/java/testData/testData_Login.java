package testData;

import org.testng.annotations.DataProvider;

public class testData_Login {

	@DataProvider(name = "Login_TC_01")
	public Object[][] Login_TC_01() {
		Object[][] data = new Object[1][6];
		data[0][0] = "Login_TC_01";
		data[0][1] = "Verify login functionality";
		data[0][2] = "To verify user is able to login using correct credentials";
		data[0][3] = "rahulshettyacademy";
		data[0][4] = "learning";
		data[0][5] = "Student";
		return data;
	}
	
	@DataProvider(name = "Login_TC_02")
	public Object[][] Login_TC_02() {
		Object[][] data = new Object[1][6];
		data[0][0] = "Login_TC_02";
		data[0][1] = "Verify login functionality";
		data[0][2] = "To verify user is not able to login using incorrect credentials";
		data[0][3] = "Anant";
		data[0][4] = "learning";
		data[0][5] = "Student";
		return data;
	}
	
	@DataProvider(name = "Login_TC_03")
	public Object[][] Login_TC_03() {
		Object[][] data = new Object[1][6];
		data[0][0] = "Login_TC_03";
		data[0][1] = "Verify all required the buttons and fields";
		data[0][2] = "Verify all required the buttons and fields are avaialble on the login page";
		data[0][3] = "Anant";
		data[0][4] = "learning";
		data[0][5] = "Student";
		return data;
	}
	
	
}
