package com.aspire.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	List<WebElement> options = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
	for(WebElement option:options)
		{
		option.click();
		}
	List<WebElement> boxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
for(WebElement all:boxes)
{
	all.click();
}
	
	
}
}
