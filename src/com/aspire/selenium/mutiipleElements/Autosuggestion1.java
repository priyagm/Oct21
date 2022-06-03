package com.aspire.selenium.mutiipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("samsung");
	Thread.sleep(2000);
	List<WebElement> mobilelist = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']"));
//	List<WebElement> mobilelist = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li/div[1]/div[2]/div[1]/span"));
System.out.println(mobilelist.size());   


	for(WebElement name:mobilelist)
{
	System.out.println(name.getText());
}
	String s="samsung a52";
	for(WebElement temp:mobilelist)
	{
	String a=temp.getText();
	if(s.equals(a))
	{
		System.out.println("its prsesnt");
		temp.click();
		break;
	}
	}

}
}
