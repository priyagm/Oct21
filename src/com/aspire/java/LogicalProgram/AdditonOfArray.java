package com.aspire.java.LogicalProgram;

public class AdditonOfArray 
{
public static void main(String[] args) 
{
	int a[]= {1,2,3,4,5}; int add=0; float avg;
	for(int i=0; i<a.length;i++)
	{
		add=add+a[i];
	}
	System.out.println(add);
	avg=add/a.length;
	System.out.println(avg);
}
}
