package com.Login.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Login.Pages.LoginPracticeTestAutomation;
import com.Login.Pages.LoginSignalHire;

import Helper.BrowserFactory;

public class ExecutePracticeTestAutomation {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.startBrowser("chrome","https://practicetestautomation.com/practice-test-login/");
		LoginPracticeTestAutomation loginPracticeTestAutomation = PageFactory.initElements(driver, LoginPracticeTestAutomation.class);
		loginPracticeTestAutomation.login_PracticeTestAutomation("student","Password123");
	}

}
