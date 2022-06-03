package com.aspire.java.logical;

public class palindrome
{
	public static void main(String[] args) {
		
	
int num=343;
int rev=0;
int  rem=0; int temp = num;
while(num>0)
{
	rem= num%10;
	rev=rev*10+rem;
	num=num/10;
}
if(temp==rev)
{
	System.out.println("number is palindrome");
	
}
else
{
	System.out.println("number is not palindrome");
}
}}
