package com.aspire.java.catc;

public class Error1
{
public static void main(String[] args)
{ int a=10;
int b=0;//5
int div;
int sum;




try
{div=a/b;
	System.out.println(div);

}
catch(ArithmeticException e)
{
	System.out.println("do not divide by zer0");
}
sum=a+b;
System.out.println(sum);
 String s="priyanka";
 
 try
 {
	 System.out.println(s.charAt(9));
	}
 catch( StringIndexOutOfBoundsException x)
 {
	System.out.println("index should be less den length"); 
 }
}

}
