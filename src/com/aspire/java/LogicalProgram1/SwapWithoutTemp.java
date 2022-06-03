package com.aspire.java.LogicalProgram1;

public class SwapWithoutTemp 
{
public static void main(String[] args) 
{
	int a=20; int b=30;
	a=a+b;//a=50;
	b=a-b;// b=20
	a=a-b;//50-20
	System.out.println(a);
	System.out.println(b);
}
}
