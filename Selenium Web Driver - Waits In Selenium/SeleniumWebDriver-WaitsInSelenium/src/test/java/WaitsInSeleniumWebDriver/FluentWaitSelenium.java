package WaitsInSeleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import Utility.Helper;

public class FluentWaitSelenium {

	WebDriver driver = Helper.startBrowser("Chrome");
	String baseURL = "https://the-internet.herokuapp.com/dynamic_loading/1";

	@Test
	public void FluentWaitTest() {

		driver.get(baseURL);

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();

		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(2)).ignoring(ElementNotInteractableException.class);

		WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish"))

		);
		System.out.println(text.getText());
		driver.quit();
	}

}
