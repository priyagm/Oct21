package com.aspire.FrameWork.pomp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalProgramZerodha 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	//login page deatils
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("UBR679");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("priyanka@25");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(5000);
	//pin page details
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	//homepagedetails
	Thread.sleep(2000);
	boolean actualLogo = driver.findElement(By.xpath("//img[@alt='Kite logo']")).isDisplayed();
	boolean expectedLogo = true;
	if(actualLogo==expectedLogo)
	{
		System.out.println("Logo verification test case pass");
	}
		else
		{
			System.out.println("Logo verification test case fail");
		}
	 String ActualIntial = driver.findElement(By.xpath("//div[@class=\"avatar\"]/span")).getText();
	 String ExpectedIntial = "P";
	if(ActualIntial.equals(ExpectedIntial))
	{
		System.out.println("intial verification test case pass");
	}
	else
	{
		System.out.println("intial verification test case fail");
	}
	}
	
}

