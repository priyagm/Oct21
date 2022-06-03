package com.aspire.java.opps.array;

import java.util.Arrays;

public class SAmple2 
{
public static void main(String[] args)
{
	int  a[]= {1000,850,3,700,4501,4,6};
	for (int i=0;i<a.length;i++)//as it is
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	Arrays.sort(a);// higher to lower
	
	for(int b=a.length-1;b>=0;b--)
	{
		
		System.out.print(a[b]+" ");
	}
	System.out.println();
	for(int b=0;b<a.length;b++)//lower to higher
	{
		System.out.print(a[b]+",");
	}
}
}
