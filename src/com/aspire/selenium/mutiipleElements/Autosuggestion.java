

package com.aspire.selenium.mutiipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	List<WebElement> text = driver.findElements(By.xpath("//div[@class='eFQ30H']/a/div[2]"));
//	for(WebElement name:text)
//	{
//		System.out.println(name.getText());
//	}
	for(int i=0; i<text.size();i++)
	{
		System.out.println(text.get(i).getText());
	}
	



	
}
}
