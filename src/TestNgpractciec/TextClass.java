package TestNgpractciec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextClass {
	
	WebDriver driver;
	LoginPage lp;
	PinPage pp;
	HomePage hp;
	Workbook wbf;
	@BeforeTest
	public  void BRowserLaunch() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(4000);
		FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\ProjectData.xlsx");
	 wbf = WorkbookFactory.create(file);
		lp = new LoginPage(driver);
		pp = new PinPage(driver);
		hp = new HomePage(driver);
	}
	@BeforeClass
	public void LOginPAge() throws InterruptedException
	{
		lp.Enterusername(wbf.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue());
		lp.Enterpassword(wbf.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue());
		lp.Clickloginbutton();
		Thread.sleep(2000);
		pp.EnterPin(wbf.getSheet("Sheet1").getRow(10).getCell(3).getStringCellValue());
		pp.ClickPinButton();
		Thread.sleep(2000);
		
	}
	@Test
	public void LOgo()
	{
		hp.verifylogo(wbf.getSheet("Sheet1").getRow(10).getCell(5).getBooleanCellValue());
	}
	@Test
	public void intialvalue()
	{
	hp.verifyintial( wbf.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue());
	}
	@AfterClass
	public void browserColse() throws InterruptedException
	{
		driver.close();
		Thread.sleep(2000);
	}
		
		
		
		
		
		
	}


