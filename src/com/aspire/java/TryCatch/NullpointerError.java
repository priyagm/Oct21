package com.aspire.java.TryCatch;

public class NullpointerError 
{
public static void main(String[] args) 
{
	String s=null;
	
	try
	{
		
		System.out.println(s.length());
	}

catch(NullPointerException e)
	{
	
	 System.out.println("Length of NULL cannot be found");
	}
}
}
