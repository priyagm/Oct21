package com.aspire.java.constructor;

public class constructor
{
 int a; int b; int d;
 constructor()
 {
	a=10; b=20;
	
 }
 public static void main(String[] args) 
 {
	constructor c=new constructor();
	c.method();
 }
 public void method()
 {   d=a+b;
	 System.out.println(a+b);
 }
}
