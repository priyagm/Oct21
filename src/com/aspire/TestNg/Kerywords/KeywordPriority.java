package com.aspire.TestNg.Kerywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordPriority
{
	
     @Test()
	public void TCS1()// if proitiry is not given is excute by assendtion order how ever u right not depend on how u right OR ALHAPET WISE
	{
		Reporter.log("test case 1 pass",true);
	}
     @Test(priority=3)
	public void TCS2()
	{
		Reporter.log("test case 2 pass",true);
	}
     @Test(priority=4)
	public void TCS3()
	{
		Reporter.log("test case 3 pass",true);
	}
     @Test()
	public void TCS4()
	{
		Reporter.log("test case 4 pass",true);
	}
     @Test()
	public void TCS5()
	{
		Reporter.log("test case 5 pass",true);
	}
     @Test()// priority default 0 if more are der assending
	public void TCS6()
	{
		Reporter.log("test case 6 pass",true);
	}
     @Test(priority=-1)
	public void TCS7()
	{
		Reporter.log("test case 7 pass",true);
	}
     @Test(priority=1)
	public void TCS8()
	{
		Reporter.log("test case 8 pass",true);
	}
     @Test(priority=2)
	public void TCS9()
	{
		Reporter.log("test case 9 pass",true);
	}
    
	
}

