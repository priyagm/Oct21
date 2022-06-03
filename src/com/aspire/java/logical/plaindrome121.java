package com.aspire.java.logical;

public class plaindrome121
{
	
	public static void main(String[] args) {
		
	
    int num=121;
    int rem=0; int rev=0; int temp= num;
    
    while(num>0)
    {
    rem=num%10;  // 1,2,1
    rev=rev*10+rem;//0+1,10+2=12,12*10=120+1
    num=num/10;//12,1
    }
    System.out.println(rev);
    if(rev==temp)
    {
    	System.out.println("its palindrome");
    }
    else
    {
    	System.out.println("its not a palindrome");
    }
}}
