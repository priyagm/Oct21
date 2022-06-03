package com.aspire.selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		//context is  right click;double click is double only
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
//right click------context
		WebElement rightclick = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		Actions act =new Actions(driver);
		//act.moveToElement(rightclick).contextClick().build().perform();
		act.contextClick(rightclick).perform();
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		act.contextClick(doubleclick).perform();
		act.moveToElement(doubleclick).doubleClick().build().perform();
;		}}
