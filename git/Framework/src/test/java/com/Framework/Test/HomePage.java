package com.Framework.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this); 
			
		}
		
		@FindBy(xpath="//div[@data-aura-class='forceEntityIcon']")
		WebElement LogoutButton;
		
		@FindBy(xpath="//a[text()='Log Out']")
				WebElement LogoutButtonClick;
		
		public void app_logOut() {
			LogoutButton.click();
			LogoutButtonClick.click();
			
		}
	
	
	
	
	
	}
	


