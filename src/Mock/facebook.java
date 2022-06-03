
package Mock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty( "webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream ("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Test data\\Test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		Thread.sleep(2000);
		
		
		String faltno = wbf.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(faltno);
		
	}

}
