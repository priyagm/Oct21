package com.aspire.java.opps.String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class replaceString {
	public static void main(String[] args) 
	{
		String s="abcdabcd";
		
		char[]a=s.toCharArray();
		LinkedHashSet <Character> hs=new LinkedHashSet<Character>();
		for( char ch:a)
	{
			if(hs.add(ch)==false)
			{
				System.out.print(ch);
			}
			
		}
		
	
	

}}
