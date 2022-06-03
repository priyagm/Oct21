package com.aspire.java.opps.array;

import java.util.Arrays;

public class SampleBasics 
{public static void main(String[] args) {
	

int [] x= {10,12,13,14,20,21,34,14,2};
System.out.println(x[0]);
for(int a=0;a<x.length;a++)
{
	System.out.print(x[a]+", ");
}
System.out.println();
Arrays.sort(x);
for(int a=0;a<x.length;a++)
{
	System.out.print(x[a]+", ");
}

}}
