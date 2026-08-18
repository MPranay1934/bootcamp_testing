package com.PracticeTestAuto.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PracticeTestAuto.Pages.BaseClass;
import com.PracticeTestAuto.Pages.LoginPage;

import Utility.ExcelDataReader;
import Utility.Helper;

public class LoginPracticeTestAutomation extends BaseClass {
	
	@Test
	public void loginApp() throws Exception {
		ExcelDataReader excel = new ExcelDataReader();
		excel.getStringData("LoginPTA", 0, 0);
		
		LoginPage loginPTA = PageFactory.initElements(driver, LoginPage.class);
		loginPTA.login_PracticeTestAuto(excel.getStringData("LoginPTA", 0, 0), excel.getStringData("LoginPTA", 0, 1));
		Thread.sleep(5000);
		
		Helper.capturesScreenShot(driver);
	}

}
