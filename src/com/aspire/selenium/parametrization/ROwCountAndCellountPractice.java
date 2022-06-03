



package com.aspire.selenium.parametrization;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ROwCountAndCellountPractice 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\Test2.xlsx");
 Workbook wbf = WorkbookFactory.create(file);
Sheet s = wbf.getSheet("Sheet1");
int lastrowindex = s.getLastRowNum();
System.out.println(lastrowindex);
short cellnumber = s.getRow(1).getLastCellNum();
System.out.println(cellnumber);
 
}
}
