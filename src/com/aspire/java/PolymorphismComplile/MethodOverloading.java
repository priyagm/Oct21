package com.aspire.java.PolymorphismComplile;

public class MethodOverloading 
{
public void addition()
{
	int a=10;int b=20; int c= a+b;
	System.out.println(c);
}
public void addition(int x, int y)
{
	int z=x+y;
	System.out.println(z);
}
public void addition(int l, int m, int n)
{
	int k= l+m+n;
	System.out.println(k);
}
public static void main(String[] args) 
{
	MethodOverloading  ml=new MethodOverloading ();
	ml.addition();
	ml.addition(100, 200);
	ml.addition(1000, 2000, 3000);
}
}
