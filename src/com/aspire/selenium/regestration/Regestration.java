package com.aspire.selenium.regestration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regestration 
{
public static void main(String[] args)
{
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/Priyanka%20G/Desktop/regiteration%20form.html");
	driver.findElement(By.tagName("input")).sendKeys("priyanka G");
	driver.findElement(By.className("Sample")).sendKeys("manhallikar");
	
}
}
