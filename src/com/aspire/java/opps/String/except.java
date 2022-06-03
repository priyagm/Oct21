package com.aspire.java.opps.String;

public class except {
	
public static void main(String[] args) 
{
	String s1="Jav@##$$a";
	String str = s1.replaceAll( "[@#$$]", "");
	System.out.println(str);
}
}
