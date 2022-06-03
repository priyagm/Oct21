package com.aspire.java.String.program;

public class StringPlaindrome 
{
public static void main(String[] args) 
{
	String s="Nayan"; String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev= rev+s.charAt(i);
	}
	
	System.out.print(rev);
	System.out.println();
	if (s.equalsIgnoreCase(rev))
	{
		System.out.println("its a planidrome");
	}

	else
		{
		System.out.println("its not a Plaindrome");
		}
	}
}
