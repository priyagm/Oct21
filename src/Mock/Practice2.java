package Mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("http://demo.guru99.com/test/newtours/");
	WebElement cell = driver.findElement(By.xpath("(//tr[@class=\"mouseOut\"]/td[1])[1]"));
	Actions act =new Actions(driver);
	act.moveToElement(cell).perform();
	List<WebElement> allcell = driver.findElements(By.xpath("//tr[@class=\"mouseOut\"]/td[1]"));
	for(WebElement a:allcell)
	{
		act.moveToElement(a).perform();
	}
}}
