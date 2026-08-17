package com.Login.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAltoroMutual {
	

	WebDriver driver;

	public LoginAltoroMutual(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id = "uid")
	WebElement uname;
	
	@FindBy(name = "passw")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='btnSubmit']")
	WebElement loginbtn;
	
	//Create Method
	public void login_AltoroMutual(String username, String pass) {
		uname.sendKeys(username);
		password.sendKeys(pass);
		loginbtn.click();
		
	}
	
}
