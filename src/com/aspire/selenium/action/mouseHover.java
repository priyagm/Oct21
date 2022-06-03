package com.aspire.selenium.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("http://demo.guru99.com/test/newtours/");
	//WebElement firstcell = driver.findElement(By.xpath("(//tr[@class=\"mouseOut\"])[1]/td[1]"));
	List<WebElement> allcell = driver.findElements(By.xpath("(//tr[@class=\"mouseOut\"])/td[1]"));
	Actions act = new Actions(driver);
	//act.moveToElement(firstcell).perform();
	for(WebElement all:allcell)
	{
		act.moveToElement(all).perform();
	}

}
}
