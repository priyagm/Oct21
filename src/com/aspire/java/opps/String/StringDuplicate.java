package com.aspire.java.opps.String;

import java.util.HashSet;
import java.util.TreeSet;

public class StringDuplicate {
	public static void main(String[] args) 
	{
		String s="abcdabcd";
		char a[]=s.toCharArray();
	HashSet<Character> ts = new HashSet<Character>();
			for(char Str:a)
		{
			if(ts.add(Str)==false)
			{
				System.out.print(Str);
			}
		}
	}

}
