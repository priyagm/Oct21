package com.aspire.selenium.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String websiteurl = driver.getCurrentUrl();
		System.out.println(websiteurl);
		String websitetitle = driver.getTitle();
				System.out.println(websitetitle);
				
				
	 
}


}
