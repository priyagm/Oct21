package Mock;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Soft {

	
	String s="priyanka";
	String t="priyanka";
	
	@Test()
	public void tc1()
	{
		Assert.assertEquals(s, t);
	}
}
