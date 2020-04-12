package QAclick;

import java.io.IOException;


//import java.util.logging.LogManager;
//import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateTest extends Base{
	public static Logger log= LogManager.getLogger(ValidateTest.class.getName());
	//public static Logger log= LogManager.getLogManager().getLogger(ValidateTest.class.getName());
	//public static Logger log =LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void intialize() throws IOException {
		driver = intializeDriver();
		driver.get(p.getProperty("url"));
		log.info("Initialized browser");
		log.debug("intialize broswer");
		log.error("error");
				
		
		}
	
	@Test
	public void validateAppTitle() throws IOException {
		// driver.get("http://qaclickacademy.com");
		// System.out.println(p.getProperty("browser"));
		// System.out.println(p.getProperty("link"));
		//log.debug("Intialized browser");
	//log.error("Error");	
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COU1RSES");
		Assert.assertTrue(l.getcontact().isDisplayed());

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

}
