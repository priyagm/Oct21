package PageFactoryPAcetice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinpage 
{
@FindBy(xpath="//input[@type=\"password\"]")private  WebElement PN;
@FindBy(xpath="//button[@type=\"submit\"]")private WebElement PB;

Pinpage(WebDriver driver)

{
	
PageFactory.initElements(driver,this);
}
public void Pin(String pin )
{
	PN.sendKeys(pin);
}
public void PinClick()
{
	PB.click();
}



}
