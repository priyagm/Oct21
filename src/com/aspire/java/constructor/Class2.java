package com.aspire.java.constructor;

public class Class2
{
int a; int b; int c;
Class2()
{
	a=100;b=200;c=300;
}
public static void main(String[] args) 
{
	Class2 C=new Class2();
	C.addition();
}
public void addition()
{ int d=a+b+c;
	System.out.println(a);
	System.out.println(d);
}
}
