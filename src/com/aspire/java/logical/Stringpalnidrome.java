package com.aspire.java.logical;

public class Stringpalnidrome
{ public static void main(String[] args) {
	

 String a= "priyanka";
  String rev="";
 
 
 for(int i=a.length()-1;i>=0;i--) 
 {
	rev=rev+a.charAt(i);
 }
	
	if (a.equals(rev))
	{
		System.out.println("its palindrome");
	}
	else 
	{System.out.println("not palindrome");}
		
}
}