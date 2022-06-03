package com.aspire.selenium.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class table2
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	List<WebElement> row = driver.findElements(By.xpath("(//div[@class=\"table-responsive\"])[2]/table/tbody/tr[2]"));
	//List<WebElement> row = driver.findElements(By.xpath("((//div[@class=\"table-responsive\"])[2]/table/tbody/tr/th"));
	for(WebElement a:row)
	{
		
		System.out.println(a.getText());
	}
	List<WebElement> header = driver.findElements(By.xpath("(//div[@class=\"table-responsive\"])[2]/table/tbody/tr/th"));
	for(WebElement b:header)
	{
		
		System.out.println(b.getText());
	}
}
}
