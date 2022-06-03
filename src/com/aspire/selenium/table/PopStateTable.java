package com.aspire.selenium.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopStateTable
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.census2011.co.in/states.php");
	String karpop = driver.findElement(By.xpath("//td[text()='61,095,297']")).getText();
	System.out.println(karpop);
	List<WebElement> header = driver.findElements(By.xpath("//table[@class='filter table table-striped table-hover ']/thead/tr[]/th"));
for(WebElement hdr:header) 
{
	System.out.println(hdr.getText());
	}
List<WebElement> ststes = driver.findElements(By.xpath("//table[@class=\"filter table table-striped table-hover \"]//tr/td[2]"));
for(WebElement sts :ststes)
{
	System.out.println(sts.getText());
}
}
}
