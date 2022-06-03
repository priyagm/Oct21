package com.practice.java;

public class ThisClass extends SuperClass {
int a=100; int b=200; int c;
public void addition()
{
	int a=10; int b=20;
	 c=a+this.a+super.a;
	 System.out.println(c);
}
public static void main(String[] args) 
{
	ThisClass tc=new ThisClass();
	tc.addition();
}
}
