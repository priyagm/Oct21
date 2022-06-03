package com.aspire.java.constructor;

public class Multi 
{
	int a; int b; //int c;


Multi()
{
	a=10;b=10;
}

Multi(int p, int q)
{ 
	 a=p;
	// p=100;q=200;
	a=q;
}
Multi(int i, int j,int k)
{
	a=i;b=j+k;
}
public static void main(String[] args)
{
 Multi object =new Multi();
 object.addition();
 Multi object1 =new Multi(10,40);
 object1.addition();
 Multi object2 =new Multi(20,30,40);
 object2.addition();
	
	
}
public void addition()	
{
	System.out.println(a+b);
	//System.out.println(p+q);
	

}}
