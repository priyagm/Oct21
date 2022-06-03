package com.aspire.TestNg.Kerywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordEnabled {
	 @Test()
		public void TCS1()
		{
			Reporter.log("test case 1 pass",true);
		}
	     @Test()
		public void TCS2()
		{
			Reporter.log("test case 2 pass",true);
		}
	     @Test(enabled=false)
		public void TCS3()// if you dont want to run any test case
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

}
