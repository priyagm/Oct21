
package com.aspire.java.TryCatch;

public class NestedMultiError 
{
	public static void main(String[] args) {
		
	
int a[]= {1,2,2,4,5,8};
int x=20;
int y=0;
int div;


try {
	
	try {
		div=20/0;
		System.out.println(div);
		
	}
catch(ArithmeticException e)
	{
	System.out.println("zero cant divide any number");
	
	}
	System.out.println(a[6]);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("index should be less than array length");
	
}

}}

