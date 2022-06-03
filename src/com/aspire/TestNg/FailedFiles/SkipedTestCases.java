package com.aspire.TestNg.FailedFiles;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipedTestCases {
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
	public void TCS3()
	{
		Reporter.log("test case 3 pass",true);
		
	}
     @Test()
	public void TCS4()// excluded in testng.xml
	{
		Reporter.log("test case 4 pass",true);
		
	}
     @Test()
	public void TCS5()
	{
		Reporter.log("test case 5 pass",true);
	}


}
/*
// testng.xml // excludeing(only dat particulat code will be included
 // no failure
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Testng">
    <classes>
      <class name="com.aspire.TestNg.FailedFiles.SkipedTestCases">
      <methods>
      <exclude name="TCS4"/>
      </methods>
      </class>
    </classes>
  </test> <!-- Testng -->
</suite> <!-- Suite -->


// include tcs4 (only dat particular code will ve excuted
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Testng">
    <classes>
      <class name="com.aspire.TestNg.FailedFiles.SkipedTestCases">
      <methods>
      <include name="TCS4"/>
      
      </methods>
      </class>
    </classes>
  </test> <!-- Testng -->
</suite> <!-- Suite -->

*/
