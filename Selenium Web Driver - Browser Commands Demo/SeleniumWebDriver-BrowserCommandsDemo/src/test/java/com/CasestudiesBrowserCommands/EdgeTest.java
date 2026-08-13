package com.CasestudiesBrowserCommands;



import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTest {
	
	@Test
	public void BrowserTitle() throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test
	public void BrowserTitle1() throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test
	public void BrowserTitle2() throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
	driver.get("http://testfire.net/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test
	public void BrowserTitle3() throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=815461296140&hvpos=&hvnetw=g&hvrand=6741693932331429513&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9210301&hvtargid=kwd-64107830&hydadcr=14452_2462829&mcid=e9c68a2d0f333bcaacd29ec00843c329&hvocijid=6741693932331429513--&hvexpln=nav&gad_source=1");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test
	public void BrowserTitle4() throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test
	public void BrowserTitle5() throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
	@Test
	public void BrowserTitle6() throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	
	String BrowserTitle = driver.getTitle();
	System.out.println(BrowserTitle);
	
	Thread.sleep(5000);
	
	String BrowserURL = driver.getCurrentUrl();
	System.out.println(BrowserURL);
	
	driver.quit();
	}
	
}
