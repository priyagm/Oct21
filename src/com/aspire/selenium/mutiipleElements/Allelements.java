package com.aspire.selenium.mutiipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allelements {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		List<WebElement> mobilelist = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//a/div[2]/div[1]/div[1]"));
	for( WebElement name:mobilelist)                                
	{
			System.out.println(name.getText());
		}
//		for(int i=0; i<mobilelist.size();i++)
//		{
//		System.out.println(mobilelist.get(i).getText());
//		}
	}

}
