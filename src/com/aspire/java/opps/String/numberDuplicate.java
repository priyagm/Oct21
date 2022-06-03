package com.aspire.java.opps.String;

import java.util.TreeSet;

public class numberDuplicate
{
	public static void main(String[] args)
	{
		int a[]= {4,3,1,1,2,2};
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int no:a)
		{
			if(ts.add(no)==false)
			{
				System.out.println(no);
			}
		}
		
	}

}