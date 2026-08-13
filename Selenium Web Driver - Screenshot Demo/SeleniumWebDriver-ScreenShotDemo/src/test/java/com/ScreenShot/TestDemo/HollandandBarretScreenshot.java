package com.ScreenShot.TestDemo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HollandandBarretScreenshot {
	WebDriver driver;
	
	@BeforeTest
	public void Setup() {
	driver = new ChromeDriver();
	driver.get("https://www.hollandandbarrett.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
	}
	
	@Test
	public void Screenshot() throws InterruptedException, IOException {
		Thread.sleep(5000);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement ele : links)
		{
			System.out.println(ele.getAttribute("href"));
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots/Application_" + getCurrentDateTime() + ".png"));
	}

	private String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return customFormat.format(currentdate);
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}

}
