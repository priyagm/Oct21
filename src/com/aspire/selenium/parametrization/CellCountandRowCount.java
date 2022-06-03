package com.aspire.selenium.parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellCountandRowCount 
{
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException  
		{
			FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\Test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		double pincode = wbf.getSheet("Sheet1").getRow(4).getCell(2).getNumericCellValue();	
		Sheet s = wbf.getSheet("Sheet1");
		int Lastrowindex = s.getLastRowNum();
		System.out.println(Lastrowindex);//give last row index
		short cellcount = s.getRow(1).getLastCellNum();
		System.out.println(cellcount);//give lass cell number
		

	
}}
