package com.aspire.selenium.multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chorme {
	static WebDriver driver; static String s="firefox";
public static void main(String[] args) throws InterruptedException
{
	if(s.equals("Chrome"))
	{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
     driver = new ChromeDriver();
     }
	else if(s.equals("firefox"))
	{
	System.setProperty("webdriver.gecko.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\geckodriver.exe");
	 driver = new FirefoxDriver();
	}

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("priyanka");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("manhallikR");
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("abcasdf");
}
}
