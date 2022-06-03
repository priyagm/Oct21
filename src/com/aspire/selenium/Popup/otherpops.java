package com.aspire.selenium.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class otherpops {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
Alert al1 = driver.switchTo().alert();
System.out.println(al1.getText());
al1.accept();
driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
Alert alt2 = driver.switchTo().alert();
System.out.println(alt2.getText());
alt2.dismiss();
 driver.findElement(By.id("promptBox")).click();
 Alert al3 = driver.switchTo().alert();
System.out.println(al3.getText());
al3.dismiss();

}}
