package com.aspire.java.logical;
//fact 4= 4*3*2*1
public class factorail
{
public static void main(String[] args) 
{
	int num =4;
	int fact =1;
	 for (int i=num; i>=1;i--)
	 {
		fact=fact*i; // 1*4=4 fact*i=fact
		             //4*3=12
		             //12*2=24
		             //24*1=24
	 }
	 System.out.println(fact);
}
}
