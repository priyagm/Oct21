package com.aspire.selenium.Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpractice 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
//	String id1 = driver.getWindowHandle();
//	System.out.println(id1);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id=\"win1\"]")).click();
	

Set<String> ids = driver.getWindowHandles();
//for(String id2:ids)
//{
//	System.out.println(id2);
//}
ArrayList<String> al =new ArrayList<String>(ids);
driver.switchTo().window(al.get(1));
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung");
driver.switchTo().window(al.get(0));
String parenttext = driver.findElement(By.xpath("//label[contains(text(),'Drag and drop')]")).getText();
System.out.println(parenttext);
//
//       ;
}
}
