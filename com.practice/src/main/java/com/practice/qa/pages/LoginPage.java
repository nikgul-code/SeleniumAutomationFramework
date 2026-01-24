package com.practice.qa.pages;

import com.practice.qa.baseclasses.*;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase 
{
	
	@FindBy(xpath="//input[@id='username']/following-sibling::span/*[2]")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']/following-sibling::span/*[2]")
	WebElement password;
	
	public LoginPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void Login()
	{
		String _username = prop.getProperty("username");
		String _password = prop.getProperty("password");
		
		username.click();
		username.sendKeys(_username);
		
		password.click();
		password.sendKeys(_password);
	}

}
