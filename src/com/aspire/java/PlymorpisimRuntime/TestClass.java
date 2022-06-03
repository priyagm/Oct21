package com.aspire.java.PlymorpisimRuntime;

public class TestClass 
{
public static void main(String[] args) 
{
	Parent p =new Parent();
	p.addition(10, 20);
	p.substraction(30, 20);
	p.Multiplication(2, 40);
	Child c=new Child();
	System.out.println("******method Overridding******");
			c.addition(100, 200);// method overrIDDING
			c.substraction(300,200);
			c.Multiplication(40, 40);
			
}
}
