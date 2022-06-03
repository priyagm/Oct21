package com.aspire.java.catc;

public class mULTI1
{
public static void main(String[] args)
{
	String s="priyanka";
	String s1= null;
	
	try {
		System.out.println(s.charAt(8));
		System.out.println(s1.length());
	}
	catch(StringIndexOutOfBoundsException e )
    {
		System.out.println("index should be less than array length");
    }
	catch(NullPointerException e)
	
	{
		System.out.println("null lenth cannot ne found");
	}
}}
