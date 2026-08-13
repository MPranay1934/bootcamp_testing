package SeleniumLocatorsCaseStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdNameXpathCaseStudy1 {
	
	WebDriver driver;
	String baseURL = "https://www.login.hiox.com/register?referrer=easycalculation.com";
	
	@Test
	
	public void LocatorsCaseStudy1() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get(baseURL);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Thread.sleep(5000);
		
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		
		Thread.sleep(5000);
		
		String PageSourceLength = driver.getPageSource();
		System.out.println(PageSource.length());
		
		driver.quit();
		
	}
	
	

}
