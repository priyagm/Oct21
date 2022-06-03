package com.aspire.java.variables;

public class Sample1 extends Sample2
{ 
	static int  a =10; static int c=20;int b=30;
	public static void main(String[] args)
	{int a=100; int b= 200;   
	System.out.println(a+a+c);
		System.out.println(a+c);
		System.out.println(a);
		Sample1 o=new Sample1();
		System.out.println(o.b);
		System.out.println(Sample2.a);
		Sample2 o1=new Sample2();
		System.out.println(o1.b);
	}
	
	
	

}
