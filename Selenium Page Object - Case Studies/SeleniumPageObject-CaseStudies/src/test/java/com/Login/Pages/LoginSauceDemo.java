package com.Login.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSauceDemo {
	
	WebDriver driver;

	public LoginSauceDemo(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginbtn;
	
	public void login_SauceDemo(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}

}
