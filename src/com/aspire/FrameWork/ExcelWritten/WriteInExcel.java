package com.aspire.FrameWork.ExcelWritten;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteInExcel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	String a[]= {"aspire","Institute","pune"};
	System.out.println(a.length);
	FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\Test1.xlsx");
  Workbook wbf = WorkbookFactory.create(file);
 Sheet s = wbf.getSheet("Sheet2");
// Row row1 = s.createRow(1);
//Cell cell1 = row1.createCell(1);
//cell1.setCellValue("hi");
 s.createRow(6).createCell(1).setCellValue("priyanka");
for(int i=0;i<a.length;i++)
{
	s.createRow(i+2).createCell(1).setCellValue(a[i]);
}
FileOutputStream file1 = new FileOutputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\Test1.xlsx");
//cell1.setCellValue("hi");
wbf.write(file1);
}
}
