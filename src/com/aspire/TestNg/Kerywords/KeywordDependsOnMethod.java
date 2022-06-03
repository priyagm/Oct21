package com.aspire.TestNg.Kerywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordDependsOnMethod 
{
//	@Test(timeOut=2000)
//	public void Login() throws InterruptedException
//{
//		Thread.sleep(3000);
//	Reporter.log("Login",true);
//}
	
	@Test(timeOut=2000)
	public void Login() throws InterruptedException
{
		Thread.sleep(1000);
	Reporter.log("Login",true);
}
@Test(dependsOnMethods={"Login"})
public void Logout()
{
	Reporter.log("Logout",true);
}
}
