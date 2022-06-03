package com.aspire.TestNg.Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNG 
{
	@BeforeMethod//(it vill come before every method)//Multiple time
	//@BeforeClass//(only once before class/ one time only)
public void browserLaunch()
{
	Reporter.log("Browser launch Succesfully",true);
		
}
	@Test
public void Enterusername()
	{
	Reporter.log("Enter UN launch Succesfully",true);
			
	}
	@Test
public void EnterPassword()
{
	
	Reporter.log("Enter pw Succesfully",true);
}
	@Test
public void ClickLogin()
{
	
	Reporter.log("Click on Loginbutton Succesfully",true);	
}
	@AfterMethod//(after every method multiple excution)
public void VerifyUsername()
{
	
	Reporter.log("user name verified  Succesfully",true);		
}
//public void m6()
//{
//	
//	Reporter.log("Browser launch Succesfully",true);
//}
//public void m7()
//{
//	
//	Reporter.log("Browser launch Succesfully",true);
//}
//public void m8()
//{
//	
//	Reporter.log("Browser launch Succesfully",true);
//}
}
