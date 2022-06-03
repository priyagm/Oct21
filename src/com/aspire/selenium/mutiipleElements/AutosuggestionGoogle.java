package com.aspire.selenium.mutiipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionGoogle 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("realme");
	Thread.sleep(2000);
	List<WebElement> mobilelist = driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]/div[1]"));
	System.out.println(mobilelist.size());
for( WebElement mobile:mobilelist)
{
	System.out.println(mobile.getText());
}
String s="Realme";
for(WebElement temp:mobilelist)
{
	String a=temp.getText();
if(s.equals(a))
{
	System.out.println("its present");
	temp.click();
	break;
}

	
}
}
}
