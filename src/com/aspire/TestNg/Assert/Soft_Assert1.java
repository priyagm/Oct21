package com.aspire.TestNg.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert1 {
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
	//pass inout put	soft.assertAll();
		//soft.assertAll();// fail
	}
}
