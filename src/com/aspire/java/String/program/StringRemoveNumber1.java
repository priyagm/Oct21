package com.aspire.java.String.program;

public class StringRemoveNumber1 
{
public static void main(String[] args)
{
	String s="My name is Priyanka 123345";
	System.out.println(s.replaceAll("[0-9]", ""));
	System.out.println(s.replaceAll("[^0-9]", ""));
	System.out.println(s.replaceAll("[(a-z)(A-z )]", ""));
}
}
