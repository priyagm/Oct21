package com.aspire.selenium.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count {public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	List<WebElement> hdr = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr/th"));
	for(WebElement header:hdr)
	{
	  System.out.println(header.getText());
	}
	//row count go for any one coloumxpath
	int rowcount = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tbody/tr/td[1]")).size();
	System.out.println(rowcount);
	//for coulun count take any one rowxpath
	int cloumncount = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tbody/tr[2]/td")).size();
	System.out.println(cloumncount);
	for(int i=1;i<=rowcount;i++)
	{
		for( int j=1;j<=cloumncount;j++)
		{
	String body = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']//tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
			System.out.print(body+"           ");
		}
	System.out.println();	
	
}}}


