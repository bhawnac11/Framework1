package com.Framework.Test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.Framework.GenericRepo.BaseClass;
import com.Framework.ObjectRepo.LoginPage;

public class Login extends BaseClass {
	
	@Test
	public void validLoginTest() {
		
		String url_Expected="https://ltt4-dev-ed.develop.lightning.force.com/lightning/setup/SetupOneHome/";
		String url_actual=driver.getCurrentUrl();
		Assert.assertEquals(url_actual, url_Expected);
		
	}
	

	
	
	
	

}
