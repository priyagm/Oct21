
package com.aspire.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook 
{
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(// input[@type='text'])[2]")).sendKeys("priyanka");
driver.findElement(By.xpath("(// input[@type='text'])[3]")).sendKeys("manhallikar");
driver.findElement(By.xpath("(// input[@type='text'])[4]")).sendKeys("809594105");
driver.findElement(By.xpath("(// input[@type='password'])[2]")).sendKeys("csbdgg");
WebElement date = driver.findElement(By.xpath("// select[@id='day']"));
Select s1=new Select(date);
s1.selectByIndex(26);

WebElement month = driver.findElement(By.xpath("// select[@id='month']"));
 Select s2=new Select(month);
 s2.selectByValue("1");
 boolean selected = driver.findElement(By.xpath("// select[@id='month']")).isDisplayed();
 System.out.println(selected);
WebElement year = driver.findElement(By.xpath("// select[@title='Year']"));
Select s3=new Select(year);
s3.selectByIndex(2);
List<WebElement> alloption = s3.getOptions();
for(WebElement object:alloption)
{
	System.out.println(object.getText());
	
	
	
}
driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
}
}


