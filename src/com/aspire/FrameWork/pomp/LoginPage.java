package com.aspire.FrameWork.pomp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(xpath="//input[@type=\"text\"]") WebElement Un;
	@FindBy(xpath="//input[@type='password']")WebElement Pwd;
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement loginbutton;
	public LoginPage( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username()
	{
		Un.sendKeys("UBR679");
	}
	public void pawwrord()
	{
		Pwd.sendKeys("priyanka@25");
	}
	public void Clickloginbutton()
	{
		loginbutton.click();
	}



	
}
