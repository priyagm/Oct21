package com.aspire.TestNg.FailedFiles;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSiDone {
	String a="priyanka";
	String b="priyanka";
	String c="priyanka manhallikar";
	

	@Test
	public void Hard_assert()
	{
		System.out.println("HarrdAssert Started");
		Assert.assertEquals(a, b);//pass
		System.out.println("HarrdAssert 1st condition excuted");
		Assert.assertNotEquals(a, b);//fail
		System.out.println("HarrdAssert 2nd condition excuted");
		Assert.assertNotEquals(a, c);//pass// 
		System.out.println("HarrdAssert 3rd condition excuted");
		
		
	}
	@Test
	public void Soft_assert()
	{ 
		SoftAssert soft =new SoftAssert();
		System.out.println("SoftAssert Started");
		soft.assertEquals(a, b);//pass
		System.out.println("SoftAssert 1st condition excuted");
		soft.assertNotEquals(a, b);//fail
		System.out.println("SoftAssert 2nd condition excuted");
		soft.assertNotEquals(a, c);//pass
		System.out.println("SoftAssert 3rd condition excuted");
	    soft.assertAll();
	}

}
