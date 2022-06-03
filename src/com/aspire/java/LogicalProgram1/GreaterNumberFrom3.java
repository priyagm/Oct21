package com.aspire.java.LogicalProgram1;
// greater Number
public class GreaterNumberFrom3 
{
public static void main(String[] args)
{
	//int a=10; int b=20; int c=30;
	//int a=100; int b=90; int c=80;
	int a=80; int b=100; int c=20;
	if(a>b && a>c)
	{
		System.out.println("a value is greater");
	}

	else if(b>a && b>c)
	{
		System.out.println("b value is greater");
	}
	else
	{
		System.out.println("c is greater");
	}
	
}
}
