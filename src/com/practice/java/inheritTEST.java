package com.practice.java;

public class inheritTEST 
{
	public static void main(String[] args) 
	{
		InheritParent p=new InheritParent();
		p.car();
		p.house();
		InheritChild c=new InheritChild();
		System.out.println("*******Child******");
		c.bike();
		c.iphone();
		
		c.car();
		c.house();
		
		
	}
	
	

}
