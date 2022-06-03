package com.aspire.selenium.parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	System.setProperty( "webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\Test1.xlsx");
	Workbook wbf = WorkbookFactory.create(file);
	String flatno = wbf.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(flatno);
	String State = wbf.getSheet("Sheet1").getRow(5).getCell(4).getStringCellValue();
	//driver.findElement(By.xpath(""))
	
}
}
