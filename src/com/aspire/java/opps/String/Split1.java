package com.aspire.java.opps.String;

public class Split1
{
public static void main(String[] args)
{
	String s1="Priyanka manhallikar";
	String a[]=s1.split("");
	System.out.println(s1.charAt(2));
	 for(int i=a.length-1;i>=0;i--)
	 {
		 System.out.print(a[i]);
	}
	 System.out.println();
	for (int i=0;i<a.length;i++)
		System.out.print(a[i]);
}
}
