package com.aspire.java.catc;

public class Nullerror
{
public static void main(String[] args)
{
	String s=null;
	//System.out.println(s.length());
	try 
	{
		System.out.println(s.length());
	}
	catch(NullPointerException e)
	{
		System.out.println("NULL STRING LENGTH CANNOT BE FOUND");
	}
}

}
