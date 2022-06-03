package com.aspire.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tes1
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.google.co.in/");
	String websiteurl = driver.getCurrentUrl();
	System.out.println(websiteurl);
	String websitetitle = driver.getTitle();
	System.out.println(websitetitle);
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(1000);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	Thread.sleep(1000);
	String websiteurl1 = driver.getCurrentUrl();
	System.out.println(websiteurl1);
	String websitetitle1 = driver.getTitle();
	System.out.println(websitetitle1);
	driver.close();
	
}
}