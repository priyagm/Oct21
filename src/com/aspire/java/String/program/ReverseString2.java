package com.aspire.java.String.program;

public class ReverseString2 
{
public static void main(String[] args) 
{
	String s=" my name is priyanka";
	String a[]=s.split("");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}
}
}
