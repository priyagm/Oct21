package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void main(String[] args) throws IOException 
{
	for(int i=1; i<=2;i++)

		{System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe" );
	WebDriver driver =new ChromeDriver();

driver.get("https://www.facebook.com/");
//driver.navigate().to("https://www.flipkart.com/");
File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\ScreenShots\\priyankak"+i+".jpg");
FileHandler.copy(sourse, dest);
}
}}
