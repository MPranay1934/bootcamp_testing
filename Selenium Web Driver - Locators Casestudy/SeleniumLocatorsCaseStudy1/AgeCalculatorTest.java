package SeleniumLocatorsCaseStudy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AgeCalculatorTest {

    WebDriver driver;

    String baseURL = "https://www.easycalculation.com/index.php";

    @Parameters("browser")
    @BeforeTest
    public void setUp(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    @Test
    public void ageCalculatorTest() throws InterruptedException {

        driver.findElement(By.linkText("Age Calculator")).click();

        Thread.sleep(3000);

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total Number of Links: " + links.size());



        int count = 0;

        for (WebElement ele : links) {

            System.out.println("Link: " + ele.getAttribute("href"));

            count++;

            if (count == 10) {
                break;
            }
        }
        
        List<WebElement> images = driver.findElements(By.tagName("img"));

        System.out.println("Total Number of Images: " + images.size());

        int imageCount = 0;

        for (WebElement ele : images) {

            System.out.println("Image: " + ele.getAttribute("src"));

            imageCount++;

            if (imageCount == 5) {
                break;
            }
        }

        driver.findElement(By.id("date")).sendKeys("14");

        driver.findElement(By.id("month")).sendKeys("07");

        driver.findElement(By.id("year")).sendKeys("2006");

   
        driver.findElement(By.xpath("//input[@value='GO']")).click();

        Thread.sleep(3000);

        

        System.out.println("Your Age is: " + driver.findElement(By.id("age")).getAttribute("value"));

        System.out.println("Your Age in Days: " + driver.findElement(By.id("days")).getAttribute("value"));

        System.out.println("Your Age in Hours: " + driver.findElement(By.id("hours")).getAttribute("value"));

        System.out.println("Your Age in Minutes: " + driver.findElement(By.id("minutes")).getAttribute("value"));

        driver.findElement(By.xpath("//input[@value='Reset']")).click();

        Thread.sleep(2000);
    }

    @AfterTest
    public void tearDown() {

        driver.quit();
    }
}