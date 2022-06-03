package com.practice.java;

public class MultipleConstructor {
	
	int a; int b; int c; int f;
	MultipleConstructor()
	{
		a=10; b=20;
		
	}
	MultipleConstructor(int d, int e)
	{
		a=d; b=e;
		
	}
	public void addition()
	{
		c=a+b; 
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		MultipleConstructor	M=new MultipleConstructor();
		M.addition();
		MultipleConstructor	M1=new MultipleConstructor(30,40);
		M1.addition();
	}
}
