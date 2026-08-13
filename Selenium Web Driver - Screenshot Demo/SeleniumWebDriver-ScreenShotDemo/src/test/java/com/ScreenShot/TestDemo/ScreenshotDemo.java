package com.ScreenShot.TestDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	
	@Test
	public void Browser() throws IOException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.hollandandbarrett.com/");
	driver.manage().window().maximize();
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./ScreenShots/HollandBarretHomepage.png"));
	System.out.println("Screenshot Captured");
	driver.quit();
	
	}

}
