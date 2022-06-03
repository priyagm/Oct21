

package com.aspire.selenium.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Otheropopups 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
driver.manage().window().maximize();
	driver.findElement(By.id("alertBox")).click();
//alert
//String alt1 = driver.switchTo().alert().getText();//if u go with dis u vill only get text not accept bcz one time use
//System.out.println(alt1);
Thread.sleep(2000);
Alert alt1 = driver.switchTo().alert();
System.out.println(alt1.getText());
alt1.accept();
Thread.sleep(2000);
//confirm box
driver.findElement(By.id("confirmBox")).click();
Alert alt2 = driver.switchTo().alert();
System.out.println(alt2.getText());
alt2.accept();
//alt2.dismiss();
driver.findElement(By.id("promptBox")).click();
Thread.sleep(2000);
Alert alt3 = driver.switchTo().alert();
System.out.println(alt3.getText());
alt3.dismiss();
driver.quit();

}
}
