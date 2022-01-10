package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FirstPage;

public class FirstPageTest extends TestBase {
	FirstPage firstpage = new FirstPage();

	public FirstPageTest() {
		super();
	}

	@BeforeMethod
	public void setupfirstpage() {
		initialization();
		
	}

	@Test
	public void validateloginfirsttest() {
		firstpage.validateloginfirst();
	}

	
	  @AfterMethod 
	  public void teardownbrowser() 
	  { 
		  driver.quit();
		  }
	 
}
