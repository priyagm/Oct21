package com.aspire.selenium.mutiipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkpract {
	
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	Thread.sleep(2000);
			List<WebElement> check = driver.findElements(By.xpath("//div[@class='row']/div/input"));
	for(int i=0; i<check.size();i++)
	{
	
		
		check.get(i).click();
	}
		}

}
