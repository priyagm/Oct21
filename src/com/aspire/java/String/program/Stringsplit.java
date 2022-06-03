package com.aspire.java.String.program;

public class Stringsplit {
public static void main(String[] args) 
{
	String s="priyanka,steffi,martin,steven,john,   ";
	String a[]=s.split(",");
	for(int i=0; i<a.length-1;i++)
	{
		System.out.println(a[i]);
	}
}
}
