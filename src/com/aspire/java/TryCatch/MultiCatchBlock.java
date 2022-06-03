package com.aspire.java.TryCatch;

public class MultiCatchBlock 
{
	public static void main(String[] args) {
		
	
String s="priyanka";
String q=null;


try
{
//System.out.println(s.charAt(8));
System.out.println(q.length());
}
catch(StringIndexOutOfBoundsException e)
{
	System.out.println("index value should be less thank String length");
}
catch(NullPointerException f)
{
	System.out.println("null value length cannot be found out");
}

}}
