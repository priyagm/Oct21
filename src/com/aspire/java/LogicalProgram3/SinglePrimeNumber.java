package com.aspire.java.LogicalProgram3;

public class SinglePrimeNumber
{
public static void main(String[] args)
{
	int a=11; int count=0;//1(its not aprime number)
	for(int i=2;i<a;i++)
	{
		if(a%i==0)//11%2=5.5//a=10;10%2=5.0 remider is 0
		{
			count++; //value 1
		}
	}
	if(count==0)
	{
		System.out.println("its a prime number");
	}
	else
	{
		System.out.println("its not aprime number");
	}
}
}
