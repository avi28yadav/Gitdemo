package QAclick;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class Homepage extends Base {

	
	@BeforeTest
	public void intialize() throws IOException {
		driver = intializeDriver();
		
	}

	@Test(dataProvider = "getdata")

	public void basePageNavigation(String Username, String Password, String text) throws IOException {
		driver.get("http://qaclickacademy.com");
		LandingPage l = new LandingPage(driver);
		l.getlogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys(Username);
		lp.getpassword().sendKeys(Password);

	}

	@DataProvider

	public Object[][] getdata() {
		Object[][] data = new Object[2][3];

		data[0][0] = "Avinash@gmail.com";
		data[0][1] = "Avi123";
		data[0][2] = "restricted user";

		data[1][0] = "Kevin@gmail.com";
		data[1][1] = "kevin123";
		data[1][2] = "restricted user";

		return data;
	}

	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}