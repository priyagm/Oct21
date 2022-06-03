package com.aspire.TestNg.Kerywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordInvocation 
{
	@Test
public void Login()
{
	Reporter.log("Login Attempted Succesfully",true);
}
	@Test(invocationCount=5)//0 no,-1 no
public void Addcart()
{
	Reporter.log("AddtoCart Attempted Succesfully",true);
}
	@Test
public void Logout()
{
	Reporter.log("Logout Attempted Succesfully",true);
}
}
