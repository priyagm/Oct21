package com.aspire.selenium.regestration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class date {public static void main(String[] args) throws InterruptedException 
{ 
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("steffi");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("manhallikar");
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9686249844");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("steffi@123");
	Thread.sleep(1000);
	WebElement daylist = driver.findElement(By.xpath("//select[@id='day']"));
	Select s=new Select(daylist);
	s.selectByIndex(14);
	s.selectByValue("25");
	s.selectByVisibleText("12");
	List<WebElement> all = s.getOptions();
	for(WebElement option:all)
	{
		System.out.println(option.getText());
	}
	Thread.sleep(1000);
	WebElement monthlist = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	Select s1=new Select(monthlist);
	s1.selectByIndex(3);
	s1.selectByValue("3");
	s1.selectByVisibleText("4");
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
   
}

}
