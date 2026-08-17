package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.Helper;

public class SeleniumWebDriverMultipleFrames {

	WebDriver driver = Helper.startBrowser("Chrome");

	String baseURL = "file:///C:/IFrames/IFrames.html";

	@Test
	public void MultipleFramesDemo() throws InterruptedException {

		driver.get(baseURL);
		driver.manage().window().maximize();
		
		int totalnoofframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total no of frames : " + totalnoofframes);
		
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/register?referrer=easycalculation.com");
		driver.findElement(By.id("xreg_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("xreg_pass")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='xreg_submit']")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.switchTo().frame("file:///C:/IFrames/IFrames.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//div[@id='main_navbar']")).click();
		Thread.sleep(5000);
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		
		driver.switchTo().frame("file:///C:/IFrames/IFrames.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//div[@id='main_navbar']")).click();
		Thread.sleep(5000);
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().to("file:///C:/IFrames/IFrames.html");
		driver.switchTo().frame("My Store");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
