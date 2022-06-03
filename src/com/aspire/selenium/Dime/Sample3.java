package com.aspire.selenium.Dime;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{
public static void main(String[] args)
{
	
	System.setProperty( "webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Dimension d =new Dimension(500, 600);
driver.manage().window().setSize(d);
System.out.println(driver.manage().window().getSize());
System.out.println(driver.manage().window().getPosition());

}
}
  