package com.aspire.selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class3 
{
public static void main(String[] args)
{
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Priyanka%20G/Desktop/Registration%20form.html");
	driver.findElement(By.tagName("input")).sendKeys("priyanka");
	driver.findElement(By.className("sample")).sendKeys("manhallikar");
	driver.findElement(By.className("number")).sendKeys("8095941051");
	driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("priyanka");
	
	
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	//driver.findElement(By.tagName("a")).click();	
	//driver.findElement(By.linkText("Facebook")).click();
	driver.findElement(By.partialLinkText("Goog")).click();
}}

