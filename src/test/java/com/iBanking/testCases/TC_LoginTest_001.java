package com.iBanking.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.iBanking.pageObjects.LoginPage;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TC_LoginTest_001 extends BaseClass {
	public Logger logger=LogManager.getLogger();
	
	@Test
	public void loginTest() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("username is entered");
		
		lp.setPassword(passWord);
		logger.info("password is entered");
		
		lp.clickLoginBtn();
		logger.info("Login button is clicked");

		
		//Assert.assertEquals("GTPL Bank Manager HomePage", driver.getTitle());
		/*
		 * if(driver.getTitle().equals("GTPL Bank Manager HomePage1234")) {
		 * Assert.assertTrue(true); logger.info("Login test passed"); } else {
		 * captureScreen(driver,"loginTest"); Assert.assertTrue(false);
		 * logger.info("Login test failed"); }
		 */
		
	}
		
	}
