package Mock;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{
public static void main(String[] args) 
{
	
	
System.setProperty( "webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.navigate().to("https://www.flipkart.com");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
String url = driver.getCurrentUrl();
System.out.println(url);
String title = driver.getTitle();
System.out.println(title);
Dimension zize = driver.manage().window().getSize();
System.out.println(zize);
Dimension d= new Dimension(500, 500);
driver.manage().window().setSize(d);
System.out.println(driver.manage().window().getSize());
Point p=new Point(50, 50);
driver.manage().window().setPosition(p);
System.out.println(driver.manage().window().getPosition());



}
}
