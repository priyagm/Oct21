package com.aspire.selenium.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("samsung mobiles");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		Thread.sleep(5000);
		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
	for(WebElement all:mobiles)

	{System.out.println(all.getText()); ;
		all.click();
		Thread.sleep(2000);
	}
	Set<String> ids = driver.getWindowHandles();
	ArrayList <String>al=new ArrayList<String>(ids);
	driver.switchTo().window(al.get(1));
	String rating = driver.findElement(By.xpath("//div[@class=\"_3LWZlK\"]")).getText();
	System.out.println(rating);
	}

}
