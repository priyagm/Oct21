package com.aspire.java.TryCatch;

public class ArithemeticError 
{
public static void main(String[] args) 
{
	int a=10;
	int b=0;
	int div;
	
	
	try
	{
	    div=a/b;
		System.out.println(div);
	}
	catch(ArithmeticException e)
	{
		
		System.out.println("Zero cannot be divided");
	}
}
}
