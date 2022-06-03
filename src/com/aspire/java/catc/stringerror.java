package com.aspire.java.catc;

public class stringerror 
{
public static void main(String[] args)
{
	String a= "priyanka";
	//System.out.println(a.length());
	try
	{
		System.out.println(a.charAt(7));
	}
	catch(StringIndexOutOfBoundsException  b)
	{
		System.out.println("take index less then length");
	}
	
	
	
	
}
}
