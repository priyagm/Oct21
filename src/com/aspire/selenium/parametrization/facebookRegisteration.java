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

public class facebookRegisteration 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
{
	System.setProperty( "webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	Thread.sleep(2000);
FileInputStream file = new	FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\Test2.xlsx");
             Workbook wbf = WorkbookFactory.create(file);
            String Firstname = wbf.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
           driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Firstname);
           String LAstnamename = wbf.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
           driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(LAstnamename);
           String email = wbf.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
           driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(email);
             String passw = wbf.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
           driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(passw);
         String day = wbf.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
           driver.findElement(By.xpath("//select[@id='day']")).sendKeys(day);
         String month = wbf.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
         driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys(month);
       String year = wbf.getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
       driver.findElement(By.xpath("//select[@id=\"year\"]")).sendKeys(year);
          
           //           System.out.println(Firstname);
//           System.out.println(LAstnamename);
//           System.out.println(email);
//           System.out.println(passw);    
            
}
}
