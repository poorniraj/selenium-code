package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FirstPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	FirstPage firstpage;
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest()
	{
		super();
		
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
	 loginpage=new LoginPage();
	}
	 
	
	// @Test(priority=1) 
		/*
		 * public void validateloginpagetitletest() { String
		 * title=loginpage.validateloginpagetitle();
		 * Assert.assertEquals(title,"Cogmento CRM"); }
		 */
	 
	 
	 @Test
	public void logintest()
	{
		 
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
