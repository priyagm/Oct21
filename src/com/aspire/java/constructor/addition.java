package com.aspire.java.constructor;

public class addition {
	int a; int b;
addition()
{
	 a=10; b=20;
}
public static void main(String[] args)
{
	addition object= new addition();
	object.addition1();
	object.substraction();
	
}
public void addition1()
{ int c=10;
	 System.out.println(a+b+c);
}
public void substraction()
{
	 System.out.println(b-a);
}

}
