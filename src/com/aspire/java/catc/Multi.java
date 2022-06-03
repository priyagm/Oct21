package com.aspire.java.catc;

public class Multi 
{
	public static void main(String[] args)
	{
	int a=10;
	int b=2;
	int c[]= {1,2,3,4,5};
	int d;
	int f;
	
	try 
	{
		try {
			d=a/b;
			System.out.println(d);
		}
		catch(ArithmeticException e)
		{
			System.out.println("do not divide it by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.println("index should be leaa then length of array");
		}
		
		f=c[6];
		System.out.println(f);
	}
	catch(ArithmeticException e)
	{
		System.out.println("do not divide it by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		 System.out.println("index should be leaa then length of array");
	}
}

}
