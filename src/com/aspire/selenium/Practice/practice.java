package com.aspire.selenium.Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice {
	public static void main(String[] args) throws IOException
	{
		for(int i=1;i<=2;i++)
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File destination = new File ("D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\ScreenShots\\pmg"+i+".jpg");
	 FileHandler.copy(sourse, destination);
	}
	}}


