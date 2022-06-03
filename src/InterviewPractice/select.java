package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class select 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	Thread.sleep(2000);
	Actions act =new Actions(driver);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	act.moveToElement(month).click().perform();
//	for(int i=1; i<=12;i++)
//
//{
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//
//}
//	for(int i=0; i<=8;i++)
//	{
//		
//		act.sendKeys(Keys.ARROW_UP).perform();
//		act.sendKeys(Keys.ENTER).perform();
//	}
}
}
