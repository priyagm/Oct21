package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice3 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions act= new Actions(driver);
	//act.moveToElement(rightclick).contextClick().build().perform();
	act.contextClick(rightclick).build().perform();
	WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Doubl')]"));
	//act.moveToElement(doubleclick).doubleClick().build().perform();
	act.doubleClick(doubleclick).build().perform();
}
}
