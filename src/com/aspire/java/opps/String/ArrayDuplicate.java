package com.aspire.java.opps.String;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate {
	public static void main(String[] args) 
	{
		int a[]= {3,2,3,2,1,4,6,};
		HashSet<Integer> hs= new HashSet<Integer>();
		for(int no:a)
		{
			if(hs.add(no)==false)
			{
				System.out.println(no);
			}
		}
		
	}

}
