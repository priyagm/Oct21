


package com.aspire.selenium.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
    //row count take coloumn
   int rowcount = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/td[1]")).size();
   int columncount = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[2]/td")).size();
  for(int i=1;i<=rowcount;i++)
  {
	  for(int j=1; j<=columncount;j++)
	  {
		 String table = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']//tr["+(i+1)+"]/td["+j+"]")).getText();
		 System.out.print(table+"                        ");//tbody/tr["+(i+1)+"]/td["+j+"]"))
	  }
	  System.out.println();
  }
}}
