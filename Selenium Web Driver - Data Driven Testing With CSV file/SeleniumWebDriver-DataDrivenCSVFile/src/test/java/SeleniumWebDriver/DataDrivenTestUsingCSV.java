package SeleniumWebDriver;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class DataDrivenTestUsingCSV {

    WebDriver driver;

    String CsvPath = "D:\\Pranay\\AutomationPracticeExer\\SeleniumWebDriver-DataDrivenCSVFile\\CSVFileReading\\CSVFile.csv";

    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();

        driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");

        driver.manage().window().maximize();
    }

    @Test
    public void BrowserTest() throws InterruptedException, IOException {

        CSVReader reader = new CSVReader(new FileReader(CsvPath), '\t');



        String[] csvCell;

        while ((csvCell = reader.readNext()) != null) {

           

            String FName = csvCell[0];
            String LName = csvCell[1];
            String Email = csvCell[2];
            String MNumb = csvCell[3];
            String CName = csvCell[4];

            driver.findElement(By.name("FirstName")).sendKeys(FName);

            driver.findElement(By.name("LastName")).sendKeys(LName);

            driver.findElement(By.name("EmailID")).sendKeys(Email);

            driver.findElement(By.name("MobNo")).sendKeys(MNumb);

            driver.findElement(By.name("Company")).sendKeys(CName);

            Thread.sleep(5000);

            driver.findElement(By.xpath("//input[@value='Submit']")).click();

            Thread.sleep(5000);

            driver.switchTo().alert().accept();

          
        }

        reader.close();
    }

    @AfterTest
    public void tearDown() {

        driver.quit();
    }
}