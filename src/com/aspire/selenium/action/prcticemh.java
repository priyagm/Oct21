package com.aspire.selenium.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prcticemh {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("http://demo.guru99.com/test/newtours/");
	WebElement onecell = driver.findElement(By.xpath("//td[@width=\"20\"][1]"));
	Actions act=new Actions(driver);
	act.moveToElement(onecell).perform();
List<WebElement> allcells = driver.findElements(By.xpath("//td[@width=\"20\"]"));
for(WebElement cells:allcells)
{
	act.moveToElement(cells).perform();
	
	
}

}}
