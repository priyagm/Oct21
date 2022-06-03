package Mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		WebElement oneelement = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(oneelement).perform();
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='xtXmba']"));
		for(WebElement a:all)
		{
			act.moveToElement(a).perform();
		}
	}

}
