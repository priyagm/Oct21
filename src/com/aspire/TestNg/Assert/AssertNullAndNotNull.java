package com.aspire.TestNg.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndNotNull 
{
String s=null;
String q="peiyanka";
@Test
public void  Tc1()// pass
{
	Assert.assertNull(s);
}
@Test
public void  Tc2()//fail
{
	Assert.assertNull(q);
}
@Test
public void  Tc3()//fail
{
	Assert.assertNotNull(q);
}
}
