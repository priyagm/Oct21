
package PageFactoryPAcetice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
@FindBy(xpath="//img[@src=\"/static/images/kite-logo.svg\"]")private WebElement ActualLogo;
@FindBy(xpath="//div[@class=\"avatar\"]/span")private WebElement ActualIntial;

Homepage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void Logo(boolean SheetLogo )
{
	boolean act = ActualLogo.isDisplayed();
	
	if(act==SheetLogo)
	{
		System.out.println("TC logo is Passed");
		
	}
	else
	{
		System.out.println("TC logo is failed");
		
	}

}
public void ExpIntial(String Sheetintial)
{
	
	String actaI = ActualIntial.getText();
	
	if(Sheetintial.equals(actaI))
	{
		
		System.out.println("Tc of intial is passed");
	}
	else
	{
		System.out.println("Tc of intial is failed");
	}



}


}
