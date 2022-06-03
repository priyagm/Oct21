package com.aspire.selenium.table;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	List<WebElement> header = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr/th"));
	for(WebElement hdr:header)
	{
		System.out.print(hdr.getText()+"                          ");
	}
	System.out.println();
	List<WebElement> coloumn = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr/td[1]"));
	for(WebElement col1:coloumn)
	{
		System.out.println(col1.getText());
	}
	System.out.println();
List<WebElement> row = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[3]/td"));
for(WebElement row1:row)
{
	System.out.print(row1.getText()+"       ");
}
}}
