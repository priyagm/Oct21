package com.aspire.selenium.screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     Thread.sleep(2000); 
     File sourse = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     System.out.println(sourse);
}
}
