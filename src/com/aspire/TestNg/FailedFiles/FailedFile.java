package com.aspire.TestNg.FailedFiles;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedFile {
	@Test()
	public void TCS1()
	{
		Reporter.log("test case 1 pass",true);
	}
     @Test()
	public void TCS2()
	{
		Reporter.log("test case 2 pass",true);
		Assert.fail();
	}
     @Test()
	public void TCS3()
	{
		Reporter.log("test case 3 pass",true);
		Assert.fail();
	}
     @Test()
	public void TCS4()
	{
		Reporter.log("test case 4 pass",true);
		//Assert.fail();
	}
     @Test()
	public void TCS5()
	{
		Reporter.log("test case 5 pass",true);
	}


}
/*
 
// test-failed with soft asssert class combined
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Failed suite [Suite]" guice-stage="DEVELOPMENT">
  <test thread-count="5" name="Testng(failed)">
    <classes>
      <class name="com.aspire.TestNg.FailedFiles.SoftAssertSiDone">
        <methods>
          <include name="Hard_assert"/>
          <include name="Soft_assert"/>
        </methods>
      </class> <!-- com.aspire.TestNg.FailedFiles.SoftAssertSiDone -->
      <class name="com.aspire.TestNg.FailedFiles.FailedFile">
        <methods>
          <include name="TCS2"/>
          <include name="TCS3"/>
        </methods>
      </class> <!-- com.aspire.TestNg.FailedFiles.FailedFile -->
    </classes>
  </test> <!-- Testng(failed) -->
</suite> <!-- Failed suite [Suite] -->

//TestNg file  with soft assert combined
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Testng">
    <classes>
      <class name="com.aspire.TestNg.FailedFiles.FailedFile"/>
      <class name="com.aspire.TestNg.FailedFiles.SoftAssertSiDone"/>
    </classes>
  </test> <!-- Testng -->
</suite> <!-- Suite -->


*/
