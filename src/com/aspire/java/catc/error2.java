package com.aspire.java.catc;

public class error2 
{ public static void main(String[] args) 
{
	int a[]= {1,2,3,4,5};
	//System.out.println(a[5]);
	try 
	{
		System.out.println(a[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("index shloud be less than length of array");
		
	}
 
}}
