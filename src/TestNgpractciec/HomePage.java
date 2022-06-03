package TestNgpractciec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//img[@alt='Kite logo']")WebElement Actuallogo;
	@FindBy(xpath="//div[@class=\"avatar\"]/span")WebElement ExpIntial;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	  public void verifylogo(boolean expectedLogo)
	  {

		boolean actualLogo = Actuallogo.isDisplayed();
		 
		if(actualLogo==expectedLogo)
		{
			System.out.println("Logo verification test case pass");
		}
			else
			{
				System.out.println("Logo verification test case fail");
			}
		
		}
	  public void verifyintial(String ExpectedIntial)
	  {
		 
		  String ActualIntial = ExpIntial.getText();
			 
			if(ActualIntial.equals(ExpectedIntial))
			{
				System.out.println("intial verification test case pass");
			}
			else
			{
				System.out.println("intial verification test case fail");
			}
	  }
}
	
	
	
	
	
	
	
	
	
	
	
	
