package com.aspire.java.opps.String;

public class StringCase
{
public static void main(String[] args) 
{
	
String s1="Aspire Institute Pune";
String s2="aspire";
String s3="PUNE";
String s4="";
String s5=" ";
System.out.println(s2.equals(s1));//false
System.out.println(s1==s2);//false
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s3.toLowerCase());
System.out.println(s1.length());//21
System.out.println(s3.length());//4
System.out.println(s4.isEmpty());//true
System.out.println(s3.isEmpty());//false
System.out.println(s5.isEmpty());//false bcz one space is der
System.out.println(s1.charAt(4));//r
System.out.println(s4.length());//0
}
}
