package Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkarwindow {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("samsung");
	driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	Thread.sleep(2000);
List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class=\"_3pLy-c row\"]/div[1]/div[1]"));
	for(WebElement all:mobiles)

	{
		all.click();
	}
	Set<String> ids = driver.getWindowHandles();
	
	ArrayList<String> al=new ArrayList<String>(ids);
	driver.switchTo().window(al.get(0));
	
	}

}
