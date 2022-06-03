
package com.aspire.selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/nestedframes");
 //  driver.switchTo().frame(2);
	driver.switchTo().frame("frame1");
	
//	WebElement parentframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//	driver.switchTo().frame(parentframe);
	String s = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	System.out.println(s);
	WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));	driver.switchTo().frame(childframe);
	driver.switchTo().frame("childframe");
	//driver.switchTo().frame(1);
	String s1 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	System.out.println(s1);
}
}
