package PageFactoryPAcetice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login 
{
	
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement UN;
	@FindBy(xpath="//input[@type='password']")private WebElement PW;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement LB;
	
	login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Username(String username)
	{
		
		UN.sendKeys(username);
	}
	public void Password(String password)
	{
		PW.sendKeys(password);
	}

public void LOginbutton()

{
	
LB.click();
}
}
