package com.aspire.java.opps.array;

import java.util.Arrays;

public class SortingAndnormal 
{public static void main(String[] args) {
	

int []a= {9,8,7,10,11,6,5,4,3,2,1};
 for(int b=0;b<a.length;b++)
 {
	 System.out.print(a[b]+",");//for writing all in one
 }
 System.out.println();
 Arrays.sort(a);
 for(int c=0;c<a.length;c++)
 {
	 System.out.print(a[c]+",");//sorting from smaller to biger
 }
 System.out.println();
 for(int c=a.length-1;c>=0;c--)
 {
	 System.out.print(a[c]+",");//sorting from bigger to small
 }System.out.println();
 System.out.println(a[0]);
}}
