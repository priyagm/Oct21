package com.aspire.java.logical;
//  370
public class Amstring
{
public static void main(String[] args) 
{
	int numb=370; int temp=numb;
	int rem=0;
	int sum=0;
	while(numb>0)
	{
	rem =numb%10;
	sum=sum+rem*rem*rem;
	numb =numb/10;
	}
	System.out.println(sum);
	if(temp==numb)
	{
		System.out.println("number is amstrong number");
	}
	else
	{
		System.out.println("number is not amstrong ");
	}
}
}
