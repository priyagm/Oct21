package com.aspire.java.opps.String;

public class Split {
	public static void main(String[] args) 
	{
		String s1="priyanka";
		String[] a=s1.split("");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		String s3="My name is priyanka";
		String[] x= s3.split("");
		for(int j=s3.length()-1;j>=0;j--)
		{
			System.out.print(x[j]);
			}
		System.out.println();
		System.out.println(s1);
				
	}

}
