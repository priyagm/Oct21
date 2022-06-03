
package com.aspire.selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracictie 
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.get("https://demoqa.com/nestedframes");
WebElement parentframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
 


driver.switchTo().frame(parentframe);
//driver.switchTo().frame(3);
//driver.switchTo().frame("frame1");
String s = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
System.out.println(s);
WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
driver.switchTo().frame(childframe);
//driver.switchTo().frame(6);

String q = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
System.out.println(q);
}
}

