package com.practice.java;

public class UpcastingTest 
{
public static void main(String[] args) 
{
	UpcastingPArent  p=new UpcastingPArent ();
	System.out.println("***************PC************");
	p.house();
	p.money();
	upcastingChild c=new upcastingChild();
	System.out.println("***************CC************");
	c.bike();
	c.money();
	c.house();
	UpcastingPArent p1=new upcastingChild();
	System.out.println("***************UPCAsting************");
	p1.house();
	p1.money();
}

}
