package com.aspire.java.opps.array;

import java.util.Arrays;

public class trail {
public static void main(String[] args) {
	int a[]= {1,2,4,7,1,};
	System.out.println(a[0]);
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	System.out.println();
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}
	System.out.println();
	int sum=a[0]+a[2];
	System.out.println(sum);
}
}
