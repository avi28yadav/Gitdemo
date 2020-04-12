package QAclick;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class E2Etesting {
	public void E2E() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Downloads\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		System.out.println(driver.findElement(By.xpath("//label[@for='radio2']")).getText());
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
		//driver.findElement(By.className("inputs ui-autocomplete-input")).sendKeys("ind");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script="return document.getElementById(\"autocomplete\").value;";
		String text= (String) js.executeScript(script);

		while(!text.equalsIgnoreCase("INdia")){
			driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ARROW_DOWN);
			
		 text= (String) js.executeScript(script);
		 System.out.println(text);
				}
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ENTER);
		System.out.println("Github");
		System.out.println("Github1");
		
	}
}
