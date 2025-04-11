package com.Framework.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Framework.GenericRepo.BaseClass;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(css="#username")
	private WebElement userField;
	
	@FindBy(css="#password")
	private WebElement passwordField;
	
	@FindBy(css="#Login")
	private WebElement loginButton;
	
	
	public void appLogin(String userName, String Password)
	{
		userField.sendKeys(userName);
		passwordField.sendKeys(Password);
		loginButton.click();
		
		
	}
	
}
