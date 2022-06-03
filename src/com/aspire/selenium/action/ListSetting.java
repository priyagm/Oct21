package com.aspire.selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ListSetting {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions act=new Actions(driver);
     //  	act.moveToElement(month).click().perform();//by mouse
        act.click(month).perform();
        for(int i=1;i<=12;i++)// setting edegs// till dec it resches
        {
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        }
        for(int i=1;i<=9;i++)// 1=dec from der loop starts
        {
        	act.sendKeys(Keys.ARROW_UP).perform();
        }
//        for(int i=12;i>=1;i--)
//        {
//        	act.sendKeys(Keys.ARROW_UP).perform();
//        }
//        for(int i=1;i<=3;i++)
//        {
//        	act.sendKeys(Keys.ARROW_DOWN).perform();
//        }
        	

}}
