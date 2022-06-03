package com.aspire.TestNg.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueOrFalse 
{
   boolean a=true;
   boolean b=true;
   boolean c=false;
   @Test
   public void TC1()
   {
	   Assert.assertTrue(a);
   }
   @Test
   public void TC2()
   {
	   Assert.assertFalse(c);
   }
   @Test
   public void TC3()
   {
	   Assert.assertFalse(b,"enter correct input");
   }
}
