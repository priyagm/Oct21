package com.aspire.java.constructor;

public class trail 
{
static int a=100; int b=200; int c=300;// int c=3000;
trail()
{
	
}
public static void main(String[] args)
{
	trail t=new trail();
	t.addition();
	t.substraction();

}
public void addition()
{
	System.out.println(a+b);
}
public void substraction()
{ int c=3000;
	System.out.println(c-a);
}
}
