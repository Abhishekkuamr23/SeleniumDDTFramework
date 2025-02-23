package com.store.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.store.pageobject.HomePage;
import com.store.pageobject.LoginPage;

public class LoginPage_Test extends BaseClass {
	@Test
	public void verifyLoginAndRegistration() {
		driver.get(url);
		logger.info("url opened");
		
		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("abhishek@gmail.com");
		lp.enterUserPassword("Qwerty@123");
		lp.checkTerms();
		lp.clickOnLogin();
	}
	
}
