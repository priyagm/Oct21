package com.aspire.selenium.Practice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multi 
{
	  static WebDriver driver; static String s="gecko";
public static void main(String[] args) 
{      
	if(s.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	  driver = new ChromeDriver();
	}
	else if(s.equals("gecko"))
	{
		
		System.setProperty("webdriver.gecko.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\geckodriver.exe" );
	driver = new FirefoxDriver();
	}
}
}
