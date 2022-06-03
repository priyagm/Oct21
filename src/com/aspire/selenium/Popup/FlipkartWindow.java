package com.aspire.selenium.Popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWindow
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Samsung");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(5000);
	List<WebElement> alltab = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	for(WebElement tabs:alltab)
	{
		System.out.println(tabs.getText());
		tabs.click();
		Thread.sleep(1000);
	}

	Thread.sleep(2000);
	Set<String> ids = driver.getWindowHandles();
	ArrayList<String> al= new ArrayList<String>(ids);
	driver.switchTo().window(al.get(0));
	String rating = driver.findElement(By.xpath("//span[@class='_2_R_DZ']")).getText();
	System.out.println(rating);
	driver.quit();
}
}
