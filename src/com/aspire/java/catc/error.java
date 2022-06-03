package com.aspire.java.catc;

public class error { 
	public static void main(String[] args) 
	{
	 int a=20;
	 int b=0;
	 int divi;
	 int sum;
	 
	 try
	 {
		 divi=a/b;
		 System.out.println(divi);
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("do not divide with zero");
	 }
	 
	 
	 
	 sum=a+b;
	 System.out.println(a+b);
	 String s= "priyanka";
		//System.out.println(a.length());
		try
		{
			System.out.println(s.charAt(9));
		}
		catch(StringIndexOutOfBoundsException  x)
		{
			System.out.println("take index less then length");
		}
	 }}
