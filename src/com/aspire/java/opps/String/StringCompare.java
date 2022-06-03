package com.aspire.java.opps.String;

public class StringCompare {
	public static void main(String[] args) 
	{
		String s1="ASPIRE ";
		String s2="aspire";
		String s3="AsPire";
		String s4="";
		String s5=new String("aspire");
		String s6=new String("aspire");
		
		System.out.println(s1==s2);//false
		System.out.println(s6==s5);//false//new cannot be equal interms of object
		System.out.println((s6.toLowerCase())==s5);
		System.out.println(s2.equalsIgnoreCase(s3));//true
		System.out.println(s5.equalsIgnoreCase(s3));//true
		System.out.println(s4.equalsIgnoreCase(s5));//flase
	}

}
