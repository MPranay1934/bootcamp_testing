package SeleniumLocatorsCaseStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdNameXpathCaseStudy4 {

	WebDriver driver;
	String baseURL = "www.easycalculation.com";

	@Test
	public void LocatorsCaseStudy2() {

		driver = new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (WebElement ele : links) {

			System.out.println(ele.isDisplayed());
			System.out.println(ele.isEnabled());
			System.out.println(ele.getAttribute("href"));

		}
		
		driver.quit();
	}
	
	

}
