package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
	public WebDriver driver;
	public Properties p;

	public  WebDriver intializeDriver() throws IOException {

		p = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\home\\selenium\\E2Eproject\\src\\main\\java\\resources\\data.properties");
		p.load(fs);
		String br = p.getProperty("browser");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\home\\Downloads\\eclipse\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\home\\Downloads\\eclipse\\Drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		

	}
	
	public void getScreenShot(String result) throws IOException
	{
		
		File fs= ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyfile(fs,);
		FileHandler.copy(fs, new File("C:\\Users\\home\\Desktop\\"+result+"screenshot.png"));
		
		
	
	}
}
