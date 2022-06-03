package com.aspire.java.logical;

public class sawp2 
{
public static void main(String[] args)
{
	int a=600; int b=500;
	a=a-b;// a=100
	b=b+a;// b=600
	a=b-a;
	System.out.println(a);
	System.out.println(b);
}
}
