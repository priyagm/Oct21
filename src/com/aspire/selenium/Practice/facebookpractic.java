package com.aspire.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookpractic {
	public static void main(String[] args) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean logo = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
	System.out.println(logo);
	boolean enabled = driver.findElement(By.xpath("//input[@type=\"text\"]")).isEnabled();
	System.out.println(enabled);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
     Thread.sleep(2000);
   	driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("priyanka");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("manhallikar");
	driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("abc@gamil.com");
	driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("pmngde");
	WebElement date = driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
	Select s=new Select(date);
	s.selectByIndex(3);
List<WebElement> option = s.getOptions();
	List<WebElement> selectedoption = s.getAllSelectedOptions();
	for(WebElement all:selectedoption)
	{
		System.out.println(all.getText());
	}
	for(WebElement options:option)
	{
		System.out.println(options.getText());
	}
	driver.findElement(By.xpath("(//label[@class=\"_58mt\"])[1]")).click();
	boolean felmalebutton = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	System.out.println(felmalebutton);
}}
