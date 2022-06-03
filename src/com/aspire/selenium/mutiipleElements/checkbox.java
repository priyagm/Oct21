package com.aspire.selenium.mutiipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	List<WebElement> options = driver.findElements(By.xpath("//div[@style='margin-left:20px;']/input"));		
//	for(int i=0; i<options.size();i++)
//		{		
//		options.get(i).click();
//		}
	for(WebElement a:options)
	{
		a.click();
	}
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	}

}
