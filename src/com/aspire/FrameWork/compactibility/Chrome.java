package com.aspire.FrameWork.compactibility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome 
{
	WebDriver driver;
	@Test()
	public void ChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	

}
/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Testng">
    <classes>
      <class name="com.aspire.FrameWork.compactibility.Chrome"/>
      <class name="com.aspire.FrameWork.compactibility.Edge"/>
      <class name="com.aspire.FrameWork.compactibility.Firefox"/>
    </classes>
  </test> <!-- Testng -->
</suite> <!-- Suite -->
*/