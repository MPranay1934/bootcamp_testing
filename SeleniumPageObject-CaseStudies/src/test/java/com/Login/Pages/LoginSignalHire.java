package com.Login.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSignalHire {
	
	WebDriver driver;

	public LoginSignalHire(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id = "_email")
	WebElement email;
	
	@FindBy(name = "_password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='new-loader position-absolute start-50 top-50 translate-middle d-inline-flex']")
	WebElement loginbtn;
	
	//Create Method
	public void login_SignalHire(String username, String pass) {
		email.sendKeys(username);
		password.sendKeys(pass);
		loginbtn.click();
		
	}
	

}
