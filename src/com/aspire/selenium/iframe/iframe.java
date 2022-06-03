package com.aspire.selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
	driver.get("https://demoqa.com/nestedframes");
		WebElement parentframe = driver.findElement(By.xpath("//iframe[@src=\"/sampleiframe\"]"));
	driver.switchTo().frame(parentframe);
	//driver.switchTo().frame(null)
	String text1 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	System.out.println(text1);
	WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]"));
	driver.switchTo().frame(childframe);
	String childClass = driver.findElement(By.xpath("//p[text()=\"Child Iframe\"]")).getText();
	System.out.println(childClass);
	}

}
