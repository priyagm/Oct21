package com.aspire.FrameWork.compactibility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Edge {
	
	@Test()
	public void EdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
