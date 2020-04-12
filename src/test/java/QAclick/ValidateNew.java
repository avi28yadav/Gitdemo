package QAclick;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateNew extends Base{
	public static Logger log= LogManager.getLogManager().getLogger(ValidateNew.class.getName());
//	public void intialize() throws IOException {
//	driver = intializeDriver();
//System.out.println(p.getProperty("url"));
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("info");
		 log.info("This is information");
	}
}
