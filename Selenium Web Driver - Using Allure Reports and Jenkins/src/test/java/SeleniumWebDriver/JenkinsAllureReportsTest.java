package SeleniumWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsAllureReportsTest {
	
	@Test(priority = 0)
	public void BrowserTitle() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 1)
	public void BrowserTitle1() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 2)
	public void BrowserTitle2() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://testfire.net/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 3)
	public void BrowserTitle3() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=815461296140&hvpos=&hvnetw=g&hvrand=6741693932331429513&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9210301&hvtargid=kwd-64107830&hydadcr=14452_2462829&mcid=e9c68a2d0f333bcaacd29ec00843c329&hvocijid=6741693932331429513--&hvexpln=nav&gad_source=1");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 4)
	public void BrowserTitle4() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 5)
	public void BrowserTitle5() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 6)
	public void BrowserTitle6() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 7)
	public void BrowserTitle7() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 8)
	public void BrowserTitle8() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://mvnrepository.com/artifact/io.qameta.allure/allure-testng/2.35.4");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 9)
	public void BrowserTitle9() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://github.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 10)
	public void BrowserTitle10() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.primevideo.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 11)
	public void BrowserTitle11() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.hotstar.com/in/home");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 12)
	public void BrowserTitle12() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.netflix.com/in/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 13)
	public void BrowserTitle13() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.airtel.in/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test(priority = 14)
	public void BrowserTitle14() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://in.linkedin.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
}
