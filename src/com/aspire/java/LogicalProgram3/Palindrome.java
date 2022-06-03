package com.aspire.java.LogicalProgram3;

public class Palindrome 
{
public static void main(String[] args) 
{
	int no=22022022; int rem=0; int rev = 0; int temp=no;
	
	while(no>0)//121//12//1
	{
		rem=no%10;  //  121%10=1;//12%10=2/1
		rev=rev*10+rem;    //0*10+1=1//1*10+2=12//12*10+1=121
		no=no/10;  //121/10=12//12/10=1
	}
	System.out.println(rev);
	if(temp==rev)
	{
		System.out.println("its a palindrome");
	}
	else
	{
		System.out.println("its not a planidrome");
	}
}
}
