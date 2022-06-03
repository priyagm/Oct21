package com.aspire.selenium.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
Thread.sleep(1000);
driver.navigate().to("https://www.flipkart.com/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.manage().window().maximize();
String websitetitle = driver.getTitle();
System.out.println(websitetitle);
String websiteurl = driver.getCurrentUrl();
System.out.println(websiteurl);
driver.quit();
}}

