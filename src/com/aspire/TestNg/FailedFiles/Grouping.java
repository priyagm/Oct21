package com.aspire.TestNg.FailedFiles;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="singin")
	public void TCS1()
	{
		Reporter.log("test case 1 pass",true);
	}
     @Test(groups="payment")
	public void TCS2()
	{
		Reporter.log("test case 2 pass",true);
		
	}
     @Test(groups="order")
	public void TCS3()
	{
		Reporter.log("test case 3 pass",true);
		
	}
     @Test(groups="payment")
	public void TCS4()
	{
		Reporter.log("test case 4 pass",true);
		
	}
     @Test(groups="order")
	public void TCS5()
	{
		Reporter.log("test case 5 pass",true);
	}
     @Test(groups="add to cart")
 	public void TCS6()
 	{
 		Reporter.log("test case 6 pass",true);
 	}
     @Test(groups="add to cart")
  	public void TCS7()
  	{
  		Reporter.log("test case 7 pass",true);
  	}


}


/*
 * 
//exclude
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Testng">
  <groups>
  <run>
  <exclude name="singin"/>
  <exclude name="order"/>
  <exclude name="payment"/>
  </run>
   </groups>
    <classes>
      <class name="com.aspire.TestNg.FailedFiles.Grouping"/>
    </classes>
  </test> <!-- Testng -->
</suite> <!-- Suite -->
//
 * 
 * 
 * 
 *  Indlude(only include particular method)
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Testng">
  <groups>
  <run>
  <include name="singin"/>
  </run>
   </groups>
    <classes>
      <class name="com.aspire.TestNg.FailedFiles.Grouping"/>
    </classes>
  </test> <!-- Testng -->
</suite> <!-- Suite -->
*/
