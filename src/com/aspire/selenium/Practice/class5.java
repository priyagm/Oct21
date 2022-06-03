package com.aspire.selenium.Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class5 {public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
System.out.println(driver.manage().window().getSize());
System.out.println(driver.manage().window().getPosition());
Dimension d =new Dimension(100, 200);
driver.manage().window().setSize(d);
System.out.println(driver.manage().window().getSize());
Point p=new Point(700, 700);
driver.manage().window().setPosition(p);
System.out.println(driver.manage().window().getPosition());
		
				
	 
}

}
