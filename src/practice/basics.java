package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics 
{
	public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.manage().window().maximize();
	System.out.println(driver.manage().window().getSize());
Dimension d=new Dimension(200,300);
driver.manage().window().setSize(d);
System.out.println(driver.manage().window().getPosition());
Point p=new Point(300,700);
driver.manage().window().setPosition(p);
System.out.println(driver.manage().window().getPosition());


}
}
