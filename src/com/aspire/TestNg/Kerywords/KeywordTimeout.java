package com.aspire.TestNg.Kerywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordTimeout {
	@Test()
public void TCS1()
{
	Reporter.log("test case 1 pass",true);
}
 @Test(timeOut=1000)
public void TCS2() throws InterruptedException
{
	 Thread.sleep(2000);
	Reporter.log("test case 2 pass",true);
	Thread.sleep(2000);
}
 @Test(priority =-1,timeOut=1000)
public void TCS3() throws InterruptedException
{
	 Thread.sleep(1000);
	Reporter.log("test case 3 pass",true);
}
 @Test(timeOut=2500)
public void TCS4() throws InterruptedException
{
	 Thread.sleep(2000);
	Reporter.log("test case 4 pass",true);
}
 @Test()
public void TCS5()
{
	Reporter.log("test case 5 pass",true);
}

}
