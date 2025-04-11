package com.Framework.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Framework.GenericRepo.BaseClass;

public class Login_old extends BaseClass{
	
	@Test()
	public void valid_Login()  {
		
		String url_Expected="https://ltt4-dev-ed.develop.lightning.force.com/lightning/setup/SetupOneHome/home";
		
		WebElement username=driver.findElement(By.cssSelector("#username"));
		username.sendKeys("15choudharyyogesh@gmail.com");
		WebElement password=driver.findElement(By.cssSelector("#password"));
		password.sendKeys("Par@9729973005");
		WebElement loginBtn=driver.findElement(By.cssSelector("#Login"));
		
		loginBtn.click();
		
		String url_actual=driver.getCurrentUrl();
		
		
		Assert.assertEquals(url_actual, url_Expected);
		
	}
		
	}
	

	
	




