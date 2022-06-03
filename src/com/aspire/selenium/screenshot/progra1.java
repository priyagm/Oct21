package com.aspire.selenium.screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class progra1 
{
public static void main(String[] args) 
{
	System.setProperty("w", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
   File sourse = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
   System.out.println(sourse);
   
}
}
