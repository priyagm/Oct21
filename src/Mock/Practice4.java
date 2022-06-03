package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice4 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Actions act=new Actions(driver);
		act.moveToElement(day).click().perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		for(int i=1;i<=28;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
		for(int i=1;i<=9;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
	}

}
