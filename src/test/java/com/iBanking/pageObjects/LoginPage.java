package com.iBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	WebElement txtusername;

	@FindBy(name = "password")
	WebElement txtpassword;

	@FindBy(name = "btnLogin")
	WebElement btnlogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;

	public void setUserName(String username) {
		txtusername.sendKeys(username);
	}

	public void setPassword(String password) {
		txtpassword.sendKeys(password);
	}

	public void clickLoginBtn() {
		btnlogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
