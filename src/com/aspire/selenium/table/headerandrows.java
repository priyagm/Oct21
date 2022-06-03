package com.aspire.selenium.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class headerandrows {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		List<WebElement> hdr = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr/th"));
	                                                     
		//table[@id="BooksAuthorsTable"]/tbody/tr/th
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[2]"));
	
  for(WebElement header:hdr)
  {
	  System.out.println(header.getText());
  }
  System.out.println();
  for(WebElement row:row1)
  {
	  System.out.println(row.getText());
  }


}}
