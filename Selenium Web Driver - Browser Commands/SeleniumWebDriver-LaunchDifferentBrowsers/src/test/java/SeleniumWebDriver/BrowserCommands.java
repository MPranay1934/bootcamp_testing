package SeleniumWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
	
	@Test(priority = 2)
	public void ChromeBrowserTest() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(10000);  // waits for 10sec and then minimize
	    driver.manage().window().minimize();
	    
	}
	
	@Test(priority = 0)
	public void EdgeBrowserTest() throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);  // waits for 10sec and then minimize
	    driver.manage().window().minimize();
	}
	
	@Test(priority = 1)
	public void FirefoxBrowserTest() throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);  // waits for 10sec and then minimize
	    driver.manage().window().minimize();
	}
	

}
