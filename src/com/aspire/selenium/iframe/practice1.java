
package com.aspire.selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 
{
public static void main(String[] args) throws InterruptedException// id or webelement 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://demoqa.com/nestedframes");
	Thread.sleep(2000);
//	//driver.switchTo().frame("frame1");
//	String pf = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
//	System.out.println(pf);
	
WebElement pc = driver.findElement(By.xpath("//iframe [@srcdoc=\"<p>Child Iframe</p>\"]"));
driver.switchTo().frame(pc);
String cc = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
System.out.println(cc);
}
}
