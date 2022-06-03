package com.aspire.FrameWork.PagefactoryDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextClass {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(4000);

		//FRomexcel sheet to program
		FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\ProjectData.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		String UNvalue = wbf.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
		//System.out.println(UNvalue);
		String Pwd = wbf.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue();
		String PinVal = wbf.getSheet("Sheet1").getRow(10).getCell(3).getStringCellValue();
		String IntialVa = wbf.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue();
		boolean logo = wbf.getSheet("Sheet1").getRow(10).getCell(5).getBooleanCellValue();
		LoginPage lp = new LoginPage(driver);
		lp.Enterusername(UNvalue);
		lp.Enterpassword(Pwd);
		lp.Clickloginbutton();
		Thread.sleep(4000);
		PinPage pp = new PinPage(driver);
		pp.EnterPin(PinVal);
		pp.ClickPinButton();
		Thread.sleep(4000);
		HomePage hp = new HomePage(driver);
		hp.verifylogo(logo);
		hp.verifyintial(IntialVa);
	}

}
