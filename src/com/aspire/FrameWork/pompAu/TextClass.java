package com.aspire.FrameWork.pompAu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextClass {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(4000);
		String Username="UBR679";
		String Password="priyanka@25";
		String PinValue="123456";
		LoginPage lp = new LoginPage(driver);
		lp.Enterusername(Username);
		lp.Enterpassword(Password);
		lp.Clickloginbutton();
		Thread.sleep(4000);
		PinPage pp = new PinPage(driver);
		pp.EnterPin(PinValue);
		pp.ClickPinButton();
		Thread.sleep(4000);
		HomePage hp = new HomePage(driver);
		hp.verifylogo();
		hp.verifyintial();
	}

}
