package com.aspire.java.PlymorpisimRuntime;

public class Child extends Parent
{
	public void addition(int a, int b)
	{
		int c= a+b;
		System.out.println("addition from Child class="+c);
		}
	public void substraction(int a, int b)
	{
		int c=a-b;
		System.out.println("sunstraction from Child class="+c);
	}
	public void Multiplication(int a, int b)
	{
		int c= a*b;
		System.out.println("Multipication From Child class="+c);
	}

}
