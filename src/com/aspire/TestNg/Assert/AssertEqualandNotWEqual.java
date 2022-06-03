package com.aspire.TestNg.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualandNotWEqual
{
String a="Aspire";
String b="Aspire";
String c="Aspire Institute Punne";
@Test	
public void TC1()//fail

{
    Assert.assertEquals(a, c,"please provide correct value");
}
@Test
public void TC2()//pass
{
    Assert.assertEquals(a, b,"please provide correct value");
}
@Test
public void TC3()// pass
{
    Assert.assertNotEquals(c, b);
}
}