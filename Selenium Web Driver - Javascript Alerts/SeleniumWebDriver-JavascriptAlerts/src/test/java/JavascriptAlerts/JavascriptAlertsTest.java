package JavascriptAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Helper;

public class JavascriptAlertsTest {
	
	WebDriver driver;
	String baseURL = "https://the-internet.herokuapp.com/javascript_alerts";
	
	@Test
	public void AlertsTest() throws InterruptedException {
		
		WebDriver driver = Helper.startBrowser("Chrome");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(5000);
	    alert.accept();
	    String result = driver.findElement(By.cssSelector("#result")).getText();
	    System.out.println(result);
	    Assert.assertEquals("You successfully clicked an alert" , result);
	    
	    driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	    Alert alert2 = driver.switchTo().alert();
	    Thread.sleep(5000);
	    alert2.dismiss();
	    String result1 = driver.findElement(By.cssSelector("#result")).getText();
	    System.out.println(result1);
	    Assert.assertEquals("You clicked: Cancel" , result1);
	    
	    driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	    Alert alert3 = driver.switchTo().alert();
	    Thread.sleep(5000);
	    alert3.accept();
	    String result2 = driver.findElement(By.cssSelector("#result")).getText();
	    System.out.println(result2);
	    Assert.assertEquals("You clicked: Ok" , result2);
	    
	    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	    driver.switchTo().alert().sendKeys("for loop");
	    Alert alert4 = driver.switchTo().alert();
	    Thread.sleep(5000);
	    alert4.accept();
	    String result3 = driver.findElement(By.cssSelector("#result")).getText();
	    System.out.println(result3);
	    Assert.assertEquals("You entered: for loop" , result3);
	    
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	    String result5 = driver.findElement(By.xpath("//p[contains(text(), Congratulations! You must have the proper credentials.")).getText();
	    Thread.sleep(5000);
	    System.out.println(result5);
	    Assert.assertEquals("Congratulations! You must have the proper credentials.", result5);
	    
	    driver.quit();
	    
		
	}

}
