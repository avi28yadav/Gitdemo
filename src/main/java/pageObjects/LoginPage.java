package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	By username =By.cssSelector("#user_email");
	By password =By.cssSelector("#user_password");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getusername()
	{
		return driver.findElement(username);
	}

	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
}
