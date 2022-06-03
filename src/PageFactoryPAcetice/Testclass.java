package PageFactoryPAcetice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
     ChromeDriver driver =new ChromeDriver();
     driver.get("https://kite.zerodha.com/dashboard");
     Thread.sleep(4000);
  FileInputStream file = new FileInputStream("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\ProjectData.xlsx");
   Workbook wbf = WorkbookFactory.create(file);
  String username = wbf.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
  String password = wbf.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue();
   String pin = wbf.getSheet("Sheet1").getRow(10).getCell(3).getStringCellValue();
   String Sheetintial = wbf.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue();
 boolean SheetLogo = wbf.getSheet("Sheet1").getRow(10).getCell(5).getBooleanCellValue();

  login lp=new login(driver);
     lp.Username(username);
     lp.Password(password);
     lp.LOginbutton();
     Thread.sleep(4000);
     Pinpage pg=new Pinpage(driver);
     pg.Pin(pin);
     pg.PinClick();
     Thread.sleep(4000);
    Homepage hm=new Homepage(driver);
    		 hm.Logo(SheetLogo);
    		 hm.ExpIntial(Sheetintial);


}}
