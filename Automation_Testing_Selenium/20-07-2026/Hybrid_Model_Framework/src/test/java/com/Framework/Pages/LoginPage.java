package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{
	WebDriver driver;
	//create constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(id="log_email")
	WebElement email;
	
	@FindBy(id="log_password")
	WebElement password;
	
	
	@FindBy(xpath="//input[@name='log_submit']")
	WebElement loginbtn;
	
	//create method
	public void login_EasyCal(String uname , String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		//without try catch login not working
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginbtn.click();
	}
}


