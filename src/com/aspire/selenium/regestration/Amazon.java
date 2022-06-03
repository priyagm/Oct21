package com.aspire.selenium.regestration;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon
{
public static void main(String[] args) throws InterruptedException 
{ 
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	boolean logodisplayresult = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	
	System.out.println("logodisplayed="+logodisplayresult);
	if(logodisplayresult==true)
	{
		System.out.println("logo displayed");
	}
	
	else
	{
		System.out.println("logo is not displayed");
		
	}
	driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
	boolean emailtextbox = driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
	System.out.println("emailtext box is enambled="+emailtextbox);
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("steffi");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("manhallikar");
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9686249844");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("steffi@123");
	WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
	Select s=new Select(day);
	s.selectByIndex(1);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select s1=new Select(month);
	s1.selectByIndex(1);
	List<WebElement> option = s1.getOptions();
	//System.out.println("size of month"+option.size());
	for(WebElement object:option)
	{
		System.out.println(object.getText());
	}
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select s2=new Select(year);
	s2.selectByValue("2020");
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
    boolean femalebutton = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
    System.out.println("female button clicked="+femalebutton);
   boolean malebutton = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
   System.out.println("malebutoon selscted"+malebutton);
    driver.findElement(By.xpath("//button[@name='websubmit']")).click();
   driver.quit();
    }
}