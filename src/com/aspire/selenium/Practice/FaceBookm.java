package com.aspire.selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookm {
	
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("priyanka");
	
	driver.findElement(By.xpath("(//input[contains(@class,\"inputtext _58mg _5dba _2ph-\")])[2]")).sendKeys("manhallikar");
	driver.findElement(By.xpath("(//input[contains(@class,\"inputtext _58mg _5dba _2ph-\")])[3]")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("123455");
WebElement day = driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
Select s=new Select(day);
s.selectByIndex(14);
WebElement month = driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
Select s1=new Select( month);
s1.selectByValue("3");
WebElement year = driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
Select s2=new Select(year);
s2.selectByVisibleText("1988");
driver.findElement(By.xpath("(//label[@class=\"_58mt\"])[1]")).click();
	}

}
