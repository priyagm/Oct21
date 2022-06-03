package com.aspire.selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Priyanka%20G/Desktop/Registration%20form.html");
	driver.findElement(By.id("123")).sendKeys("priyanka");
	driver.findElement(By.className("Sample")).sendKeys("manhallikar");
	driver.findElement(By.className("number")).sendKeys("8095941051");
	driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("abcdefg");
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	//Thread.sleep(200000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	//driver.findElement(By.linkText("Facebook")).click();
	//driver.findElement(By.tagName("a")).click();
	//driver.findElement(By.partialLinkText("oogle")).click();
}
}
