package com.aspire.selenium.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Row {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	List<WebElement> hdrrow = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr/th"));
	for(WebElement hdr:hdrrow)
	{
		System.out.println(hdr.getText());
	}
	List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr[2]/td"));
	System.out.println(row1.size());
	for(  WebElement rw1:row1)
	{
		System.out.println(rw1.getText());
	}
	System.out.println();
	List<WebElement> lastrow = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr[7]/td"));
	for(WebElement lstr:lastrow)
	{
		System.out.println(lstr.getText());
	}
	
	
	}

}
