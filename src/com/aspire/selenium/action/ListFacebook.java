


package com.aspire.selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ListFacebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions act=new Actions(driver);
     //  	act.moveToElement(month).click().perform();//by mouse
        act.click(month).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();//arrow;
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ENTER).perform();
		
	}

}
