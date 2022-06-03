package com.aspire.selenium.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fulltable {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
int rowcount = driver.findElements(By.xpath("//table[@id=\"BooksAuthorsTable\"]/tbody/tr/td[1]")).size();
System.out.println(rowcount);
int columnCount = driver.findElements(By.xpath("//table[@id=\"BooksAuthorsTable\"]/tbody/tr[2]/td")).size();
System.out.println(columnCount);
for(int i=2;i<= rowcount;i++)
{
	for(int j=1; j<=columnCount;j++)
	{
		 String table = driver.findElement(By.xpath("//table[@id=\"BooksAuthorsTable\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
		 
		 	System.out.print(table+"        ");	
	}
}
}}
