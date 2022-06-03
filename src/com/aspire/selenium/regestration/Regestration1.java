
package com.aspire.selenium.regestration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regestration1 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Priyanka%20G/Desktop/Registration%20form.html");
		Thread.sleep(2000);
		driver.findElement(By.id("123")).sendKeys("priya");
		Thread.sleep(2000);
		driver.findElement(By.id("123")).clear();
		//driver.findElement(By.name("demo")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("demo")).sendKeys("priyanka");
		Thread.sleep(2000);
		driver.findElement(By.className("sample")).sendKeys("manhallikar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='number']")).sendKeys("9686249844");
	    // driver.findElement(By.className("number")).sendKeys("8095941051");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("a")).click();
	//driver.findElement(By.linkText("Facebook")).click();
	//driver.findElement(By.partialLinkText("oog")).click();
		//driver.findElement(By.cssSelector("body > input.number")).click();
		driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("abc@134");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='number']")).sendKeys("9686249844");
		driver.quit();
		
		
		
	
	
	
	}
}
