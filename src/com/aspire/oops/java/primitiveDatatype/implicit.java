package com.aspire.oops.java.primitiveDatatype;

public class implicit {
	public static void main(String[] args)

	{
		byte a=127;
		short b;
		int c;
		long d;
		float e;
		double f;
		b=a;
	    c=(int)a;// a typecast to int
		d=c;
		e=c;
		f=c;
		System.out.println(" byte a="+a);
		System.out.println("short b="+b);
		System.out.println("int c="+c);
		System.out.println("long d ="+d);
		System.out.println("float e ="+e);
		System.out.println("double f="+f);
		
	}
}
