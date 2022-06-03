package com.aspire.FrameWork.pomp;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//import com.aspire.framwork.pagefactory.HomePage;

public class TextClass {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(4000);
		LoginPage lp = new LoginPage(driver);
		lp.username();
		lp.pawwrord();
		lp.Clickloginbutton();
		Thread.sleep(4000);
		PinPage pp = new PinPage(driver);
		pp.EnterPin();
		pp.ClickPinButton();
		Thread.sleep(4000);
		HomePage hp = new HomePage(driver);
		hp.verifylogo();
		hp.verifyintial();
	}

}
