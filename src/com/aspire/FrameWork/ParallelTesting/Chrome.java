package com.aspire.FrameWork.ParallelTesting;

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
<suite name="Suite" parallel="tests">
  <test thread-count="5" name="Test1">
    <classes>
      <class name="com.aspire.FrameWork.ParallelTesting.Chrome"/>
    </classes>
  </test> 
  <test thread-count="5" name="Test2">
    <classes>
      <class name="com.aspire.FrameWork.ParallelTesting.Edge"/>
    </classes>
  </test> 
  <test thread-count="5" name="Test3">
    <classes>
      <class name="com.aspire.FrameWork.ParallelTesting.Firefox"/>
    </classes>
  </test> 
</suite> <!-- Suite -->
*/