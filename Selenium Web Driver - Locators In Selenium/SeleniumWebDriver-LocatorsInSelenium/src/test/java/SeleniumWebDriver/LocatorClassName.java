package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorClassName {
	
	WebDriver driver;
	
	
	@Test 
	public void Setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		try {
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		} catch(Exception e) {
			System.out.println("Cookie popup not displayed");
		}
		
		driver.findElement(By.xpath("//h2[normalize-space()='Vitamin Drinks']")).click();
		driver.findElement(By.className("ProductCardImage-module_innerImage__pnkUg")).click();
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		driver.navigate().back();
		String BrowserURL1 = driver.getCurrentUrl();
		System.out.println(BrowserURL1);
		
		driver.navigate().refresh();
		String BrowserURL2 = driver.getCurrentUrl();
		System.out.println(BrowserURL2);
		
		driver.navigate().forward();
		String BrowserURL3 = driver.getCurrentUrl();
		System.out.println(BrowserURL3);
		
		
	}
	
	

}
