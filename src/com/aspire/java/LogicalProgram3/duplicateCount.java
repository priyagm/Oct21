package com.aspire.java.LogicalProgram3;

public class duplicateCount 
{
public static void main(String[] args) {
	
	String s="Priyanka";
	char x='a'; int count =0;
	for(int i=0; i<=s.length()-1;i++)
	{
	char y	=s.charAt(i);
	if(x==y)
	{
		count++;
	}
		
	}
	System.out.println(count);
}
}
