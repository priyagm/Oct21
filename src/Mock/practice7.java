package Mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice7 {
	public static void main(String[] args)
	{
		
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
			List<WebElement> fashion = driver.findElements(By.xpath("//div[@class='xtXmba']"));
			for(WebElement a:fashion)
			{
			System.out.println(a.getText());	
			}
	}

}
