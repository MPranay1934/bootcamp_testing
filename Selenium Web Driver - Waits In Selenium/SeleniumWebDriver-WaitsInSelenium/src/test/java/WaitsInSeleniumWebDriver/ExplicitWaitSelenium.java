package WaitsInSeleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utility.Helper;

public class ExplicitWaitSelenium {

	WebDriver driver = Helper.startBrowser("Chrome");
	String baseURL = "https://practicetestautomation.com/practice-test-login/";

	@Test
	public void ExplicitWaitTest() {

		driver.get(baseURL);

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).click();
		
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("student")));

		username.sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}

}
