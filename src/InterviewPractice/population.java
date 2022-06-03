package InterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class population {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Priyanka G\\eclipse-workspace\\Selemiumoct21\\Softfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
	List<WebElement> header = driver.findElements(By.xpath("//table[@class=\"wikitable sortable jquery-tablesorter\"]/thead/tr/th"));
	for(WebElement all:header)
	{
		
		System.out.println(all.getText());
	}
	int coloumncount = driver.findElements(By.xpath("//table[@class=\"wikitable sortable jquery-tablesorter\"]/tbody/tr[2]/td")).size();
	System.out.println(coloumncount);
	 int rowcount = driver.findElements(By.xpath("//table[@class=\"wikitable sortable jquery-tablesorter\"]/tbody/tr/td[1]")).size();
	System.out.println(rowcount);
	System.out.println(coloumncount);
	for(int i=2;i<=rowcount;i++)
		{
		for(int j=1; j<=coloumncount; j++)
		{
		String body = driver.findElement(By.xpath("//table[@class=\"wikitable sortable jquery-tablesorter\"]/tbody/tr["+i+"]/td["+j+"]")).getText(); 
		System.out.print(body+"                                   ");
		}
		System.out.println();
		}
	 }
	}

