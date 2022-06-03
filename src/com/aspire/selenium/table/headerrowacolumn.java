package com.aspire.selenium.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class headerrowacolumn {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	List<WebElement> header = driver.findElements(By.xpath("//table[@id=\"BooksAuthorsTable\"]/tbody/tr/th"));
	for(WebElement a: header)
{
System.out.println(a.getText());
}
	
	List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"BooksAuthorsTable\"]/tbody/tr[2]/td"));
	for(WebElement b:row)
	{
	System.out.print(b.getText());	
	}
	System.out.println();
		List<WebElement> column = driver.findElements(By.xpath("//table[@id=\"BooksAuthorsTable\"]/tbody/tr/td[1]"));
		for(WebElement c:column)
			{
		System.out.println(c.getText());	
			}
		

	}}
