package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class FirstPage extends TestBase{
	
	
@FindBy(xpath="//header/div[1]/nav[1]/div[1]/div[1]/a[1]")
WebElement login;

@FindBy(xpath="//body[1]/div[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/a[1]/svg[1]/image[1]")
//a[(@class= \\\"brand-name\\\")and (@title=\\\"free crm homes\\\")
WebElement hrmlogo;

public FirstPage()
{
	PageFactory.initElements(driver,this);
}

public boolean hrmlogovalidate() {
	return hrmlogo.isDisplayed();
	
	
}

public LoginPage validateloginfirst() {
	// TODO Auto-generated method stub
	login.click();
	return new LoginPage();
	
}
}

