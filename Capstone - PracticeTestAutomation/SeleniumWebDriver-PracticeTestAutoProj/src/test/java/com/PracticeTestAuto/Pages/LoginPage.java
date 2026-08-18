package com.PracticeTestAuto.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id = "username")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement loginbtn;
	
	//Create Method
	public void login_PracticeTestAuto(String username, String pass) {
		email.sendKeys(username);
		password.sendKeys(pass);
		loginbtn.click();
		
	}
	
	public void tearDown() {
		driver.quit();;
	}
	

}
