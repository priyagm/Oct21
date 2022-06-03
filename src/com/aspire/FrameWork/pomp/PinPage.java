package com.aspire.FrameWork.pomp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	@FindBy(xpath="//input[@type='password']") WebElement pin;
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement Pinbutton;
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void EnterPin()
	{
		pin.sendKeys("123456");
	}
	public void ClickPinButton()
	{
		 Pinbutton.click();
	}
	
	
	
	
	
	
	
	

}
