package com.aspire.java.constructor;

public class Demo2 
{
	int a;int b;int  c;int d;
	Demo2()
	{
		a=10;b=20;c=15;
	}
	public static void main(String[] args) 
	{
		Demo2 D=new Demo2();
		D.method2();
	}
	public void method2()
	{
		d=a+b+c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
}}
