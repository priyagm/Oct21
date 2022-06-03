package com.aspire.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 
{
public static void main(String[] args)
{

	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe" );

	WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://www.flipkart.com/");

	String websiteurl = driver.getCurrentUrl();
	System.out.println(websiteurl);
	String websitetitle = driver.getTitle();
	System.out.println(websitetitle);
	driver.close()
;

}
}

