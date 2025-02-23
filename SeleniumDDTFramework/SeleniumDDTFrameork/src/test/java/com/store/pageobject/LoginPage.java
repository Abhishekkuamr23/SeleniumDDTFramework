package com.store.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 private WebDriver driver;

	  public LoginPage(WebDriver driver) {
	      this.driver = driver;
	      PageFactory.initElements(driver, this);
	  }
	  
	  @FindBy(id = "username")
	  WebElement userName;
	  
	  @FindBy(id = "password")
	  WebElement userPassword;
	  
	  @FindBy(id = "rememberme")
	  WebElement terms;
	  
	  @FindBy(css = "[name='login']")
	  WebElement login;
	  
	  public void enterUserName(String username) {
		  userName.sendKeys(username);
	  }
	  
	  public void enterUserPassword(String password) {
		  userPassword.sendKeys(password);
	  }
	  
	  public void checkTerms() {
		  terms.click();
	  }
	  
	  public void clickOnLogin() {
		  login.click();
	  }
}
