package com.aspire.java.LogicalProgram3;

import java.util.Arrays;

public class ASortAsseinding {
	
	public static void main(String[] args)
	{
		
 int a[]= {2,4,3,1};
 
 Arrays.sort(a);
 for(int i=0; i<a.length;i++)
 {
	 System.out.print(a[i]);
 }
 System.out.println();
 
for(int i=a.length-1;i>=0;i--)
{
	System.out.print(a[i]);

}
	}

}
