package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	By signin =By.cssSelector("a[href*='sign_in']");
	By title= By.cssSelector("#content > div > div > h2");
	By contact=By.xpath("//a[contains(href,academy.com)]");
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getlogin()
	{
		return driver.findElement(signin);
	}

	public WebElement getTitle()
	{
		return driver.findElement(title);
	
	}
	public WebElement getcontact()
	{
		return driver.findElement(contact);
	
	}
}
