package com.aspire.selenium.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class6 
{ public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	
}}
