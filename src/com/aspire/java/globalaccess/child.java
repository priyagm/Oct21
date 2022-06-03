package com.aspire.java.globalaccess;

public class child extends parent
{ 
	int e=100; static int b=200;

	public  void addition1()
{ 
	int a=10;
	
	int c= a+this.a+super.a;
	System.out.println(c);
	
}
public static void main(String[] args) 
{
	child c=new child();
	c.addition1();
	System.out.println(c.a);
	
	
	
}
}
