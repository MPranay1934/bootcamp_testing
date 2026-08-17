package com.Login.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Login.Pages.LoginSauceDemo;

import Helper.BrowserFactory;

public class ExecuteSauceDemo {
	
	@Test
	public void CheckValidUser() {
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.saucedemo.com/");
		LoginSauceDemo loginSauceDemo = PageFactory.initElements(driver, LoginSauceDemo.class);
		loginSauceDemo.login_SauceDemo("standard_user", "secret_sauce"); 
		
	}

}
