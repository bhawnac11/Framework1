package com.Framework.GenericRepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Framework.ObjectRepo.LoginPage;
import com.Framework.Test.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;
	
	@BeforeClass
	public void SetUp() {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		DataHandler handle=new DataHandler();
		driver.get(DataHandler.getProperty("Url");
		LoginPage login = new LoginPage(driver);
		login.appLogin("15choudharyyogesh@gmail.com", "Yog@9729973005");
		
	}
	
	@AfterClass
	public void browser_Close() {
		HomePage logout=new HomePage(driver);
		logout.app_logOut();
		driver.quit();
				
	}
			
}

