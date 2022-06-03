package com.aspire.java.LogicalProgram1;

public class SawpWithTemp 
{
public static void main(String[] args)
{
	int a=20; int b=30; int temp;
	temp=a;//temp=20
	a=b;// a=30
	b=temp;//b=20
	System.out.println(a);
	System.out.println(b);
}
}
