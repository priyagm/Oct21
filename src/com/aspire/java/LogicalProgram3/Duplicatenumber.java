package com.aspire.java.LogicalProgram3;

import java.util.HashSet;

public class Duplicatenumber 
{
public static void main(String[] args) 
{
	int a[]= {1,2,3,4,1};
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int numb:a)
	{
		if(hs.add(numb)==false)
		{
			
			System.out.println(numb);
		}
		
	}
	
}
}
