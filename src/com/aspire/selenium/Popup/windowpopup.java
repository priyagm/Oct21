



package com.aspire.selenium.Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopup 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
//	String id = driver.getWindowHandle();
//	System.out.println(id);
	driver.findElement(By.xpath("//button[@id='win1']")).click();
	
	
	Set<String> id1 = driver.getWindowHandles();
//	for(String ids:id1)
//	{
//		System.out.println(ids);
//	}
	
ArrayList<String> al = new ArrayList<String>(id1);

driver.switchTo().window(al.get(1));
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung");
Thread.sleep(2000);
driver.switchTo().window(al.get(0));
String parentwindowtext = driver.findElement(By.xpath("//label[contains(text(),'Drag')]")).getText();
System.out.println(parentwindowtext);
}
}
