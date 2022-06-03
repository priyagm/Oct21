package com.aspire.selenium.regestration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("priyanka");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("manhallikar");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@ data-type='text'])[3]")).sendKeys("8095941051");
		driver.findElement(By.xpath("//input[@ data-type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("(//input[@ type='radio'])[1]")).click();
		boolean button = driver.findElement(By.xpath("(//input[@ type='radio'])[1]")).isSelected();
		System.out.println(button);
		driver.findElement(By.xpath("(//button[@ type='submit'])[2]")).click();
		boolean enab = driver.findElement(By.xpath("(//button[@ type='submit'])[2]")).isEnabled();
		System.out.println(enab);
	}

	
}
