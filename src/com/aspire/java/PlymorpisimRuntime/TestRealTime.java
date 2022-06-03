package com.aspire.java.PlymorpisimRuntime;

public class TestRealTime {
	public static void main(String[] args) 
	{
		ParentRealTime prt=new ParentRealTime ();
		prt.bunglow();
		prt.Car();
		prt.Gold();
		ChildRealTime crt= new ChildRealTime();
		System.out.println("*****method overridding******");
		crt.bunglow();// method overriding
		crt.Car();// method overriding
		crt.Gold();// unique method in parent
		crt.Bike();// uniqe method in child class
	}

}
