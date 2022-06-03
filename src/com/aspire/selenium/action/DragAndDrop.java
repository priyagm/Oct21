package com.aspire.selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
	WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
	Actions act=new Actions(driver);
//	act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
	//act.moveToElement(drag).clickAndHold().release(drop).build().perform();
//	act.clickAndHold(drag).release(drop).build().perform();
	act.dragAndDrop(drag, drop).perform();
	
	
}
}
