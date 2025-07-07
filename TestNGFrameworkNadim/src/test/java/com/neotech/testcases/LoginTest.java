package com.neotech.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import src.com.neotech.pages.DashboardPageElements;
import src.com.neotech.pages.LoginPageElements;

public class LoginTest extends CommonMethods {
	
	@Test(groups= {"smoke", "regression"})
	public void validLogin()
	{
		
		LoginPageElements login = new LoginPageElements(); 
		DashboardPageElements dashboard = new DashboardPageElements();
		
		//send username 
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		//send password
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		
		//click on login button
		click(login.loginBtn);
		
		//verify we are logged in 
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();
		
		//assertion to verify that the strings match
		AssertJUnit.assertEquals(actual, expected, "The account name does NOT match!!!");
		
	}
	
	
	@Test
	public void emptyPassword() {
		
		
		LoginPageElements login = new LoginPageElements(); 
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, "");
		
		String excpected = "Password can not be empty"; 
		String actual = login.passwordError.getText(); 
		
		
		
		
	
		
	}

}
