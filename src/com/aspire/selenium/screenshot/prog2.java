package com.aspire.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class prog2 // screen shot for specific name
{
public static void main(String[] args) throws IOException, InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
   Thread.sleep(2000);
   File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   File destination = new File("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\ScreenShots\\ aspire Screenshot.jpg");
   FileHandler.copy(sourse, destination);
}
}
