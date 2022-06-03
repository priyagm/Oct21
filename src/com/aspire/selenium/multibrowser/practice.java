package com.aspire.selenium.multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice 
{ 
	static WebDriver driver;  static String s="edge";
	public static void main(String[] args) {
		 if(s.equals("chrome"))
		 {
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
      driver = new ChromeDriver();
		 }
		 else if(s.endsWith("firefox"))
		 {
     System.setProperty("webdriver.gecko.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\geckodriver.exe");
     driver= new FirefoxDriver();
		 }
	 else if(s.equals("edge"))
	 {
			System.setProperty("webdriver.edge.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\msedgedriver.exe");
			 driver=new EdgeDriver();
			 
		 }
     driver.get("https://www.facebook.com/");
     
}}
