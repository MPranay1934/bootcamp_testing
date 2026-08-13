package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationMethods {
	
	WebDriver driver;
	String baseurl = "https://www.ajio.com/";
	String baseBackurl = "https://www.google.com/";
	String baseNavurl = "https://www.myntra.com/";
	
	@Test(priority = 0)
	public void NavigateDemo() {
		driver = new ChromeDriver();
		driver.navigate().to(baseurl);
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		driver.quit();
	}

	@Test(priority = 1)
	public void NavigateBackDemo() {
		driver = new ChromeDriver();
		driver.get(baseBackurl);
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to(baseBackurl);
		BrowserURL = driver.getCurrentUrl();	
		System.out.println(BrowserURL);
		
		driver.navigate().back();
		BrowserURL = driver.getCurrentUrl();	
		System.out.println(BrowserURL);
	}
	
	@Test(priority = 2)
	public void RefreshMethod() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(baseBackurl);
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().refresh();
		Title = driver.getTitle();	
		System.out.println(Title);
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		BrowserURL = driver.getCurrentUrl();	
		System.out.println(BrowserURL);
	}
	
	@Test(priority = 3)
	public void ForwardMethod() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(baseBackurl);
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to(baseNavurl);;
		BrowserURL = driver.getCurrentUrl();	
		System.out.println( BrowserURL);
		
		
		
		driver.navigate().back();
		BrowserURL = driver.getCurrentUrl();	
		System.out.println(BrowserURL);
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		BrowserURL = driver.getCurrentUrl();	
		System.out.println(BrowserURL);
	}
	
	}

