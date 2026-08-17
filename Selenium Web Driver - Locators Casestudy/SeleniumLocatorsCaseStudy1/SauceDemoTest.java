package SeleniumLocatorsCaseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceDemoTest {

    WebDriver driver;

    String baseURL = "https://www.saucedemo.com/";

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
        }

        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        
        Thread.sleep(5000);

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        String pageSource = driver.getPageSource();

        System.out.println("Page Source Length: " + pageSource.length());

        System.out.println("Login Successful");
         
        Thread.sleep(5000);
       }

    @AfterTest
    public void tearDown() {

        driver.quit();
    }
}