package com.aspire.selenium.mutiipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllElement 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
List<WebElement> mobile = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//a/div[2]/div/div[1]"));
	Thread.sleep(2000);
//	List<WebElement> mobile = driver.findElements(By.xpath("//div[@class='_2kHMtA']/a//div[12]"));
//	for(int i=0;i<mobile.size();i++)
//	{
//		System.out.println(mobile.get(i).getText());
//	}
for( WebElement name:mobile)
{
	System.out.println(name.getText());
}
List<WebElement> images = driver.findElements(By.xpath("//img[@class=\"_396cs4 _3exPp9\"]/div"));
for(WebElement x:images)
{
	System.out.println(x.isDisplayed());
}
	driver.quit();
}

}
