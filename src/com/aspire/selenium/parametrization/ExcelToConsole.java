package com.aspire.selenium.parametrization;

import java.io.FileInputStream
;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExcelToConsole {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\Test1.xlsx");
	Workbook wbf = WorkbookFactory.create(file);
//	double pincode = wbf.getSheet("Sheet1").getRow(4).getCell(2).getNumericCellValue();	
//	System.out.println(pincode);
//	String State = wbf.getSheet("Sheet1").getRow(5).getCell(3).getStringCellValue();
//	System.out.println(State);
	Sheet s = wbf.getSheet("Sheet1");
	String S = s.getRow(5).getCell(3).getStringCellValue();
	System.out.println(S);

}}
