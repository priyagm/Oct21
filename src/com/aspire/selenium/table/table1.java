package com.aspire.selenium.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
String demontext = driver.findElement(By.xpath("//td[text()='Angels & Demons']")).getText();
	System.out.println("demontext");
	
	//header cell
	List<WebElement> header = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr/th"));//[]//th
	System.out.println(header.size());
	for(WebElement hdr:header)
	{
		System.out.println( hdr.getText());
	}
	}}
