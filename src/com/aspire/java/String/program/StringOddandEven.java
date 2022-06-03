package com.aspire.java.String.program;

public class StringOddandEven 
{
	public static void main(String[] args) {
		
	
String a="Selenium";
for(int i=0; i<=a.length()-1;i=i+2)// even String
{
System.out.print(a.charAt(i));	
}
System.out.println();
for(int i=1;i<a.length();i=i+2)
{
System.out.print(a.charAt(i));	
}
}}
