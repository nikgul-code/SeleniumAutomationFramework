package com.practice.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.practice.qa.pages.*;
import com.practice.qa.baseclasses.*;

public class LoginTest extends TestBase
{
	LoginPage loginPage;
	
	@BeforeMethod
	public void setup()
	{
		Init();
		loginPage = new LoginPage();
	}
	
	@Test
	public void ValidateFinsysLogin()
	{
		loginPage.Login();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
