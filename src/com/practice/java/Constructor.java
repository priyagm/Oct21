package com.practice.java;

public class Constructor
{
	
	int a; int b; int c;
Constructor()
{
a=10; b=20;	

}
public void addition()
{
	int c=a+b;
	System.out.println(c);

}
public static void main(String[] args) 
{
	Constructor c=new Constructor();
	c.addition();
}

}
