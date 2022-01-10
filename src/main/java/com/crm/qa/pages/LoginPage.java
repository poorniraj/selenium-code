package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement email;
	 
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signupbtn;

	public LoginPage()
	{
       PageFactory.initElements(driver,this);		
	}
	
	 public HomePage login(String e,String pwd)
	 {
		email.sendKeys(e); 
		password.sendKeys(pwd);
		 loginbtn.click();
		 return new HomePage();
	 }
		

	public String validateloginpagetitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	
	 
	 

}
