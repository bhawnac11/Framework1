package com.Framework.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	public static WebDriver driver;
	@BeforeClass
	
	public void Setup(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	
	
	@BeforeMethod
	
	public void AppLaunch() {
		driver.get("https://login.salesforce.com/");
		
		
	}
	
	@AfterMethod
	
	public void LogOut() {
		
		driver.findElement(By.xpath(""));
	}
	
	@AfterClass
	
	public void BrowserClose() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
