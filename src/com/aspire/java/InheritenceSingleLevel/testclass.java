package com.aspire.java.InheritenceSingleLevel;

public class testclass 
{
public static void main(String[] args) 
{
	Parent p=new Parent();
	p.bunglow();
	p.car();
	Child c=new Child();
			c.bunglow();// overridding also
			c.car();
			c.bike();
			c.iphone();
}
}
