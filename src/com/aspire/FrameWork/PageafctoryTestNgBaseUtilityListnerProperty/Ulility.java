package com.aspire.FrameWork.PageafctoryTestNgBaseUtilityListnerProperty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Ulility {
	
	static Workbook wbf;
	public static String Testdata(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException//parametrization

	{
	     FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\ProjectData.xlsx");
		 wbf = WorkbookFactory.create(file);
	    String Testvalue = wbf.getSheet("sheet1").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	 return Testvalue;
	}
	public static boolean TestData2(int rowIndex,int cellIndex)
	{
		
		boolean TestVAlue2 = wbf.getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getBooleanCellValue();
		return TestVAlue2;
	}
	public static void Screenshots(WebDriver driver ) throws IOException
	
	
	{
		Date d =new Date();
		String Time = d.toString().replace(":", "_").replace(" ", "_");
		
		
		File Sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\ScreenShots\\"+Time+".jpg");
		FileHandler.copy(Sourse, dest);
	}
	public static  String getProperty(String key) throws IOException
	{
		 Properties PropObj = new Properties();
	FileInputStream fileObj = new FileInputStream(System.getProperty("user.dir")+"\\prop.properties");
			PropObj.load(fileObj);
			String value = PropObj.getProperty(key);
			return value;
	}
	
}
