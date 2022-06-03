package InterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover 
{
public static void main(String[] args) 
{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	Actions act= new Actions(driver);
List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"xtXmba\"]"));
for( WebElement mobiles :all)
{
	act.moveToElement(mobiles).perform();
}

}
}
