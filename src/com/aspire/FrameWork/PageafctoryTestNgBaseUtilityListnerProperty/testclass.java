package com.aspire.FrameWork.PageafctoryTestNgBaseUtilityListnerProperty;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testclass extends Baseclass
{
	
	
	LoginPage lp;
	PinPage pp;
	HomePage hp;
	DropDownClass dd;
	@BeforeTest
	public   void Browserlaunch() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		Browseropen();
		
       
		 lp = new LoginPage(driver);
		 pp = new PinPage(driver);
		 hp = new HomePage(driver);
		 dd=new DropDownClass(driver);
	}
	@BeforeClass
	public void loginpage() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(4000);
		lp.Enterusername(Ulility.Testdata(10,1));
		lp.Enterpassword(Ulility.Testdata(10,2));
		lp.Clickloginbutton();
		pp.EnterPin(Ulility.Testdata(10,3));
		pp.ClickPinButton();
	}
	
@Test
public void logO()
{
	hp.verifylogo(Ulility.TestData2(10, 5));
}
@Test
public void Intials() throws EncryptedDocumentException, IOException
{
	
	hp.verifyintial(Ulility.Testdata(10, 4));
	Ulility.Screenshots(driver);
}
@AfterMethod
public void profileNavigation(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		Ulility.Screenshots(driver);
	}
	hp.navigateTOProfile();
	dd.ClickOnProfile();
}

@AfterClass
public void BrowserClose() 
{
	driver.close();
	
}
}
