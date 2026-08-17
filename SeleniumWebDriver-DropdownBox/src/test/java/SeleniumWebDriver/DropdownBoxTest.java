package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.Helper;

public class DropdownBoxTest {
	
	WebDriver driver = Helper.startBrowser("Chrome");

    String baseURL = "https://testautomationpractice.blogspot.com/";


    @BeforeTest
    public void setUp() {
        driver.get(baseURL);
        driver.manage().window().maximize();
    }
    
    @Test
    public void DropdownTestDemo() throws InterruptedException {
    	
    	WebElement lists = driver.findElement(By.id("country"));
    	Select country_list = new Select(lists);
    	
    	country_list.selectByIndex(3);
    	Thread.sleep(5000);
    	country_list.selectByContainsVisibleText("India");
    	Thread.sleep(5000);
    	
    	WebElement option = country_list.getFirstSelectedOption();
    	String countryindex = option.getText();
    	System.out.println(countryindex);
    	
    	List<WebElement> c_list = country_list.getOptions();
    	int total_country = c_list.size();
    	System.out.println("Total number of countries : " + total_country);
    	
    	for(WebElement ele : c_list) {
    		String country_name = ele.getText();
    		System.out.println("Country names in List : " + country_name);
    	}
    	
    	
    	
    }
    
    @AfterTest
    public void tearDown() {
    	
    	driver.quit();
    	
    }


}
