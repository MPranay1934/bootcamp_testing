package com.Login.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Login.Pages.LoginAltoroMutual;
import com.Login.Pages.LoginSignalHire;

import Helper.BrowserFactory;

public class ExecuteAltoroMutualLogin {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.startBrowser("chrome","https://altoro.testfire.net/login.jsp");
		LoginAltoroMutual loginAltoroMutual = PageFactory.initElements(driver, LoginAltoroMutual.class);
		loginAltoroMutual.login_AltoroMutual("jsmith","demo123");
	}

}
