package com.aspire.java.logical;
//0 1 1 2 3 5 8
public class fibonacci2 
{
	public static void main(String[] args) {
 int a[]=new int[10];
 a[0]=0;
 a[1]=1;
 for(int i=2; i<=a.length-1;i++)
 {
	 a[i]=a[i-1]+a[i-2];
 }
 for(int j=0; j<a.length;j++)
 {
	 System.out.println(a[j]);
 }
    }}
