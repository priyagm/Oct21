package com.aspire.java.logical;
// 153
public class Amstrong 
{
public static void main(String[] args) 
{ int numb=153;
 int rem=0;
 int sum=0;
int temp = numb;

while(numb>0)
{
	rem=numb%10;   // 3, 5,1
	sum=sum+rem*rem*rem;//0+3*3*3=27,27+5*5*5=152, 152+1*1*1=153
	numb=numb/10;//15,1
	
}
System.out.println(sum);

if (temp==sum)
{
	
	System.out.println("its amstrong number");
}
else
{
	System.out.println("its not an amstrong number");
}


	
}}
