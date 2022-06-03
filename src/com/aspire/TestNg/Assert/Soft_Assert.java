package com.aspire.TestNg.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert 
{
String a="priyanka";
String b="priyanka";
String c="priyanka manhallikar";
String d=null;
boolean e=true;
 boolean f=false;

@Test
public void Hard_assert()
{
	Assert.assertEquals(a, b);//pass
	Assert.assertNotEquals(a, b);//fail// stop here
	Assert.assertNull(d);//pass
	Assert.assertNotNull(c);//pass
	Assert.assertFalse(f);//pass
}
@Test
public void Soft_assert()
{ SoftAssert soft =new SoftAssert();
	soft.assertEquals(a, b);//pass
	soft.assertNotEquals(a, b);//fail// stop here
	soft.assertNull(d);//pass
	soft.assertNotNull(c);//pass
	soft.assertFalse(f);
	soft.assertAll();// if we hide it vill pass softassert
}
}
