package com.aspire.java.casting;

public class testclass {
	public static void main(String[] args) {
		parentclass pc=new parentclass();
		System.out.println("******pc***** ");
		pc.farm();
		pc.money();
		pc.car();
		pc.house();
		
		child c=new child ();
		System.out.println("*****child class*******");
	c.bike();
	c.farm();
	c.money();
	c.car();
	c.house();
	
	parentclass p= new child();
	System.out.println("******pc, cc********");
	p.car();
	p.farm();//upcsting
	p.house();
	p.money();//upcasting
	
	
	
	
	
	
	
	}

}
