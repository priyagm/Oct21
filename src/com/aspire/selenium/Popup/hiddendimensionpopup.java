package com.aspire.selenium.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendimensionpopup
{
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("priyanka@123");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("priya@123");
	Thread.sleep(2000);
	String logintext = driver.findElement(By.xpath("//span[contains(text(),'your')]")).getText();
	System.out.println(logintext);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	driver.quit();
	
}
}
