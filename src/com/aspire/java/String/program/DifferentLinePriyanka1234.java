package com.aspire.java.String.program;

public class DifferentLinePriyanka1234
{
public static void main(String[] args) 
{
	String s="priyanka1234";
	System.out.println(s.replaceAll("[0-9]", ""));
	System.out.println(s.replaceAll("[^0-9]", ""));
}
}
