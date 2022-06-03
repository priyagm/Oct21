package com.aspire.java.constructor;

public class Class1 { 
	int a;//and public void  method
int b; int c; int d;
Class1()
{ 
	a=10;b=20;c=30;// c=100;//second time can be done second value vill be tsken
}
	public static void main(String[] args) 
{
Class1 object=new Class1 ();
  object.method1();

}
public  void method1()
{ d=a+b+c; 
	System.out.println(d);
}}


