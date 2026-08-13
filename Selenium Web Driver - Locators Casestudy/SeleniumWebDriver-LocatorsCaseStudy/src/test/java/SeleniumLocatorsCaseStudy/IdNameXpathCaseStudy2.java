package SeleniumLocatorsCaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdNameXpathCaseStudy2 {

	WebDriver driver;
	String baseURL = "https://www.easycalculation.com/";

	@Test
	public void LocatorsCaseStudy2() {
		
		driver = new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("googleSearchId")).sendKeys("Banglore");
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		
		
		System.out.println(PageSource.length());
		
		driver.quit();
		
	}

}
