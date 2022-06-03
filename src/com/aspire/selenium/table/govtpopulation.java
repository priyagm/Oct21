package com.aspire.selenium.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class govtpopulation 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.census2011.co.in/states.php");
//	List<WebElement> rows = driver.findElements(By.xpath("//table[@class=\"filter table table-striped table-hover \"]//tr[2]/td"));
//	for(WebElement row1:rows)
//	{
//		System.out.print(row1.getText());
//	}
//	List<WebElement> column = driver.findElements(By.xpath("//table[@class=\"filter table table-striped table-hover \"]//tr/td[2]"));
//	for(WebElement column1:column)
//	{System.out.println(column1.getText());
//	}
	//row count
	int rowcount = driver.findElements(By.xpath("//table[@class=\"filter table table-striped table-hover \"]//tr/td[2]")).size();
System.out.println(rowcount);
	//colun count
	int colunmcount = driver.findElements(By.xpath("//table[@class=\"filter table table-striped table-hover \"]//tr[2]/td")).size();
System.out.println(colunmcount);
	Thread.sleep(2000);
for(int i=2; i<=rowcount;i++)
{
	for(int j=1;j<=colunmcount;j++)
	{
		String body = driver.findElement(By.xpath("//table[@class=\"filter table table-striped table-hover \"]//tr["+i+"]/td["+j+"]")).getText();
	System.out.print(body+"             ");
	}
	System.out.println();
}

}
}
