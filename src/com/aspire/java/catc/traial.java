package com.aspire.java.catc;

public class traial 
{
	public static void main(String[] args) {
		
	
int a=100; int b=0; 

try {
	try {
		
		String s="Priyanka";

		System.out.println(s.charAt(10));
	}
	catch(StringIndexOutOfBoundsException e)
	{
		
		System.out.println("index should be lass than length of array");
	}
	int c=a/b;
	System.out.println(c);
}
catch(ArithmeticException e)
{
	System.out.println("dont divideit by zero");
}

}}
