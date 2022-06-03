package com.aspire.FrameWorkPagefactoryTestnG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//FRomexcel sheet to program
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement Un;
	@FindBy(xpath="//input[@type='password']")private WebElement Pwd;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement loginbutton;
	public LoginPage( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Enterusername(String Username)
	{
		Un.sendKeys(Username);
	}
	public void Enterpassword(String Password)
	{
		Pwd.sendKeys(Password);
	}
	public void Clickloginbutton()
	{
		loginbutton.click();
	}



	
}
