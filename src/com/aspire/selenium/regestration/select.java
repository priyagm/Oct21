


package com.aspire.selenium.regestration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select 
{
public static void main(String[] args) throws InterruptedException 
{ 
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	WebElement product = driver.findElement(By.xpath("//select[@id='first']"));
	// Select s1=new Select(product);
	//  s1.selectByIndex(2);
	// Thread.sleep(1000);
	// s1.selectByValue("Google");
	// Thread.sleep(1000);
	// s1.selectByVisibleText("Bing");
	WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
	Select s2=new Select(animals);
	s2.selectByIndex(3);
	Thread.sleep(1000);
	s2.selectByValue("babycat");
	Thread.sleep(1000);
	s2.selectByVisibleText("Big Baby Cat");
	List<WebElement> options = s2.getOptions();
	for(WebElement object:options)
	{
		System.out.println(object.getText());
	}
	System.out.println(s2.isMultiple());
	WebElement multiple = driver.findElement(By.xpath("//select[@id='second']"));
	Select s3=new Select(multiple);
	s3.selectByIndex(0);
	s3.selectByValue("burger");
	s3.deselectByValue("burger");
	s3.selectByVisibleText("Donut");
	List<WebElement> alloptions = s3.getOptions();
	for(WebElement object:alloptions)
	{
		System.out.println(object.getText());
	}
	List<WebElement> selectedoption = s3.getAllSelectedOptions();
	for(WebElement object:selectedoption)
	{
		System.out.println(object.getText());
	}
	System.out.println(s3.isMultiple());
	
	
	
	
	
}
}
 