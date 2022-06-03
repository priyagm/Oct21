package com.aspire.java.logical;

public class palindromeString 
{
public static void main(String[] args)
{
	String a="abccba";
	String rev="";
	
	
	for(int i=a.length()-1; i>=0;i--)
	{
		rev=rev+a.charAt(i);
	}
	System.out.println(rev);
	if(a.equals(rev))
	{
		System.out.println("its a palindrome");
	}
	else
	{
	System.out.println("its not palindrome");	
	}
}
}
