package com.aspire.java.opps.String;

public class abc123 {
	public static void main(String[] args)
	{
		String s2="abcd123";
	String str = (s2.replaceAll("[0-9]",""));
 String str1 = (s2.replaceAll("[^0-9]",""));
	System.out.println(str);
	System.out.println(str1);
	}

}
