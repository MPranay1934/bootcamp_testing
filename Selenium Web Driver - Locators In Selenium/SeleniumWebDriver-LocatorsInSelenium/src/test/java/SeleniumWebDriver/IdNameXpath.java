package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdNameXpath {
	
	WebDriver driver;
	String baseURL = "https://practicetestautomation.com/practice-test-login/";
	@Test(priority = 0)
	public void LocatorsDemo() throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		//driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
	
	}
	
}
