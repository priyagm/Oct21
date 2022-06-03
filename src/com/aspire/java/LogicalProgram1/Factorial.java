package com.aspire.java.LogicalProgram1;
// 5*4*3*2*1
public class Factorial 
{
public static void main(String[] args) 
{
	int num=5;
	int fact=1;
	for(int i=num;i>=1;i--)
	{
		fact=fact*i;//25*3==75*2
	}
System.out.println(fact);	
}
}
