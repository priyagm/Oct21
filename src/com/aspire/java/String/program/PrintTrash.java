package com.aspire.java.String.program;

public class PrintTrash
{
public static void main(String[] args) 
{
	String s="@#$%^^&^$#@#%^12345abcd";
	System.out.println(s.replaceAll("[(^0-9)(^bcd)]", ""));
	//System.out.println(s.replaceAll("[^0-9]", ""));
}
}