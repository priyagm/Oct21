


package com.aspire.selenium.parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCregistratio {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty( "webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/profile/user-registration");
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='ui-tabpanel-2-label']")).click();
	FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\Test1.xlsx");
Workbook wbf = WorkbookFactory.create(file);
String flatno = wbf.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
driver.findElement(By.xpath("//input[@id=\"resAddress1\"]")).sendKeys(flatno);


	}

}
