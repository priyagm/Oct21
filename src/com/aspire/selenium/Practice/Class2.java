package com.aspire.selenium.Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println(driver.manage().window().getSize());
	Dimension d=new Dimension(500, 600);
	driver.manage().window().setSize(d);
	System.out.println(driver.manage().window().getSize());
	Thread.sleep(1000);
	System.out.println(driver.manage().window().getPosition());
	Point p=new Point(700, 400);
	driver.manage().window().setPosition(p);
	System.out.println(driver.manage().window().getPosition());
	
	
	
}
}
