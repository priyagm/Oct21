package com.aspire.java.TryCatch;

public class StringError
{
public static void main(String[] args) 
{
	String s="priyanka";
	
	try
	{
		
		System.out.println(s.charAt(8));
	}

catch(StringIndexOutOfBoundsException e)
	
{
	System.out.println("Index value should be less than length");
}
	
	
}
}
