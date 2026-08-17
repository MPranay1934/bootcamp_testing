package WaitsInSeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.Helper;

public class ExplicitWaitDemo {

	WebDriver driver = Helper.startBrowser("Chrome");
	String baseURL = "https://practicetestautomation.com/practice-test-login/";

	@Test
	public void ExplicitWaitTestDemo() {

		driver.get(baseURL);

		driver.manage().window().maximize();
		
	}
	
}
