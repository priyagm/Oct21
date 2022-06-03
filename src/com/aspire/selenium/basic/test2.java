package com.aspire.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 
{
public static void main(String[] args) throws InterruptedException 
{ 
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe" );
	WebDriver driver =new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	String websiteurl = driver.getCurrentUrl();
	System.out.println(websiteurl);
	String websitetitle = driver.getTitle();
	System.out.println( websitetitle);
	driver.close();
	driver.navigate().refresh();
	
	}

}
