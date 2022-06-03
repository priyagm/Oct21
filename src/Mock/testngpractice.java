package Mock;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngpractice 
{
 @Test()
 public void Tcs()
 {
	 Reporter.log("1", true);
 }
 @Test()
 public void Tcs2()
 {
	 Reporter.log("2", true);
 }
 @Test()
 public void Tcs3()
 {
	 Reporter.log("3", true);
 }
}
