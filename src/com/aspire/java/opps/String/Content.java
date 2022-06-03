package com.aspire.java.opps.String;

public class Content {
	public static void main(String[] args) 
	{
		String s1="Aspire Institute Pune";
		String s2="aspire";
		String s3="PUNE";
		String s4="";
		String s5=" ";
		String s7="Ins";
		String s8="tit";
		String s9="ASPIRE";
		System.out.println(s1.contains(s7));//true
		System.out.println(s1.contains(s5));//true
		System.out.println(s2.contains(s8));//false
		System.out.println(s1.contains(s2));//false
		System.out.println((s1.toLowerCase()).contains(s2));
		System.out.println((s1.toLowerCase()).contains(s9.toLowerCase()));
		System.out.println(s1.toUpperCase().contains(s9));
		System.out.println(s1.charAt(20));//e
		System.out.println(s1.indexOf('e'));//index of first match
	System.out.println(s1.indexOf('i'));//3
	System.out.println(s1.indexOf('A'));//0
	System.out.println(s1.lastIndexOf('e'));//20
	System.out.println(s1.startsWith("Asp"));//true
	System.out.println(s1.startsWith("ire"));//false
	System.out.println(s1.endsWith("Pune"));//true
	System.out.println(s1.endsWith("te"));//false
	System.out.println(s7.concat(s8.concat(s3)));
	System.out.println(s1.contains(s2.toLowerCase()));
	System.out.println(s1.toUpperCase().contains(s2.toUpperCase()));
	System.out.println();
	}
	}

