package com.aspire.oops.java.primitiveDatatype;

public class explict {
	public static void main(String[] args) 
{
	double p= 12345.6789d;
	float q;
	long r;
	int s;
	short t;
	byte u;
	q=(float)p; // p typecast to float
	r=(long)p;
	s=(int)p;
	t=(short)p;
	u=(byte)p;
	
	System.out.println("double p ="+p);
	System.out.println("float q = "+q);
	System.out.println("long r ="+r);
	System.out.println("int s ="+s);
	System.out.println("short t="+t);
	System.out.println("byte u="+u);
}

}
