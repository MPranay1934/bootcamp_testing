package WaitsInSeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.Helper;

public class WaitsInSeleniumTest {
	
	WebDriver driver = Helper.startBrowser("Chrome");
	String baseURL = "https://www.easemytrip.com/";
	
	@Test
	public void WaitsSeleniumTestDemo() {
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		driver.findElement(By.id("FromSector_show")).sendKeys("Delhi",Keys.ENTER);
		driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai",Keys.ENTER);
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.xpath("//li[@id='fiv_3_26/08/2026']")).click();
		driver.findElement(By.xpath("//input[@class='srchBtnSe']")).click();
		
	}

}
