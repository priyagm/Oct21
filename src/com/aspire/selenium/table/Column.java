package com.aspire.selenium.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Column {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
List<WebElement> colmn1 = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr/td[1]"));
for(WebElement CLM1:colmn1)
{
	System.out.println(CLM1.getText());
}
List<WebElement> colmn2 = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr/td[2]"));
for(WebElement CLM2:colmn2)
{
	System.out.println(CLM2.getText());
}
	}}
