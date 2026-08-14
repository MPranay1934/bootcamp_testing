package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTestDemo {

	WebDriver driver;
	String baseURL = "https://only-testing-blog.blogspot.com/2014/05/form.html";
	
	 @BeforeTest
	    public void setUp() {

	        driver = new ChromeDriver();

	        driver.get(baseURL);

	        driver.manage().window().maximize();
	    }
	 
	 @Test
	    public void BrowserTest() throws InterruptedException  {

	 

	            driver.findElement(By.name("FirstName")).sendKeys("pro");

	            driver.findElement(By.name("LastName")).sendKeys("nay");

	            driver.findElement(By.name("EmailID")).sendKeys("abc@gmail.com");

	            driver.findElement(By.name("MobNo")).sendKeys("9876543210");

	            driver.findElement(By.name("Company")).sendKeys("Coforge");

	            Thread.sleep(5000);

	            driver.findElement(By.xpath("//input[@value='Submit']")).click();

	            Thread.sleep(5000);

	            driver.switchTo().alert().accept();

	          
	        }
	 
	 

	        
	        @AfterTest 
	        public void tearDown() {

	            driver.quit();
	        }
	    }







	 
	

