package com.aspire.selenium.mutiipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id=\"vfb-6-0\"]")).click();
List<WebElement> options = driver.findElements(By.xpath("//div[@style='margin-left:20px;']/input"));
//for(int i=0;i<options.size();i++)
//{
//options.get(i).click();
//}
for(WebElement option:options)
{
	option.click();
	}

}
}
