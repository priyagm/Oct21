package com.aspire.FrameWork.PagefactoryDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement Pinbutton;
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void EnterPin(String PinValue)
	{
		pin.sendKeys(PinValue);
	}
	public void ClickPinButton()
	{
		 Pinbutton.click();
	}
	
	
	
	
	
	
	
	

}
