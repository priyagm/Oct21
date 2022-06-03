package com.aspire.TestNg.Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RandomMethods 
{
	@AfterClass
public void method1()
{
Reporter.log("after class m1",true);	
}
	@BeforeClass
public void method2()
{
Reporter.log("before class m2",true);	
}
	@AfterMethod
public void method3()
{
Reporter.log("after method m3",true);	
}
	@BeforeMethod
public void method4()
{
Reporter.log("before method m4",true);	
}
	@Test
public void method5()
{
Reporter.log("test case m5",true);	
}
}
