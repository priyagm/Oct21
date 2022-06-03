package com.aspire.java.constructor;

public class Mock {
	 int a; int b;  float c;
	 Mock()
	 {
		 a=100;b=200; //c=200.6f;
	 }
	 Mock(int p,float q)
	 {
		 a=p; c=q;
	 }
	 Mock( int x,float y,float z)
	 {
		 a=x;c=y+z;
	 }
	 public static void main(String[] args) 
	 {
		Mock m=new Mock();
		m.addition();
		Mock m1=new Mock(400,500.5f);
		m1.addition();
		Mock m2=new Mock(400,500.6f,600.10f);
		m2.addition();
		
		}
	 public void addition()
	 {
		 System.out.println(a+b+c);
		//
		 System.out.println(a+c);
	 }
	
}
