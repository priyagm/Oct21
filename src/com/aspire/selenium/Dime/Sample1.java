package com.aspire.selenium.Dime;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{  
public static void main(String[] args) throws InterruptedException
{ 
	System.setProperty( "webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 System.out.println(driver.manage().window().getSize());
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com");
	 System.out.println(driver.manage().window().getSize());
	Dimension d=new Dimension(300, 400);
	driver.manage().window().setSize(d);
	Thread.sleep(1000);
	Dimension d1=new Dimension(200, 200);
	driver.manage().window().setSize(d1);
	Thread.sleep(1000);
	Dimension d2=new Dimension(100, 150);
	driver.manage().window().setSize(d2);
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	Thread.sleep(1000);
	Point p =new Point(100, 200);
	
	driver.manage().window().setPosition(p);
	Thread.sleep(1000);
//	Point po = driver.manage().window().getPosition();
	System.out.println(driver.manage().window().getPosition());
	driver.quit();
}
}
