package com.aspire.FrameWorkPagefactoryTestnG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextClass {
	WebDriver driver;
	Workbook wbf;
	LoginPage lp;
	PinPage pp;
	HomePage hp;
	@BeforeTest
	public  void Browserlaunch() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
        FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\ProjectData.xlsx");
		 wbf = WorkbookFactory.create(file);
		 lp = new LoginPage(driver);
		 pp = new PinPage(driver);
		 hp = new HomePage(driver);
	}
	@BeforeClass
	public void loginpage()
	{
		lp.Enterusername( wbf.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue());
		lp.Enterpassword(wbf.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue());
		lp.Clickloginbutton();
		pp.EnterPin(wbf.getSheet("Sheet1").getRow(10).getCell(3).getStringCellValue());
		pp.ClickPinButton();
		
		
	}
	
@Test
public void logO()
{
	hp.verifylogo(wbf.getSheet("Sheet1").getRow(10).getCell(5).getBooleanCellValue());
}
@Test
public void Intials()
{
	hp.verifyintial(wbf.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue());
}
	
@AfterClass
public void BrowserClose() 
{
	driver.close();
	
}



		
		
		 
		
		
		
	}


