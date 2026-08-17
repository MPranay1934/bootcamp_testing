package com.Login.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Login.Pages.LoginSignalHire;

import Helper.BrowserFactory;

public class ExecuteSignalHireLogin {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.startBrowser("chrome","https://www.signalhire.com/login");
		LoginSignalHire loginSignalHire = PageFactory.initElements(driver, LoginSignalHire.class);
		loginSignalHire.login_SignalHire("abc@gmail.com","abc123");
	}

}
