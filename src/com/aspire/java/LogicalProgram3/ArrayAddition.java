package com.aspire.java.LogicalProgram3;

public class ArrayAddition 
{
public static void main(String[] args) 
{
	int a[]= {1,2,3,4};
	int b[]= {4,5,6,7};
	for(int i=0; i<=a.length-1;i++)
	{
		
		for(int j=0; j<=b.length-1;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
			}			
			
		}
	}
}
}
