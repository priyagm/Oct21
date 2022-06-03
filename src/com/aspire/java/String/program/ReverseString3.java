package com.aspire.java.String.program;

public class ReverseString3 
{
public static void main(String[] args) 
{
	String s="priyanka"; String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}
