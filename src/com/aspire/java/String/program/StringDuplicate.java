package com.aspire.java.String.program;

import java.util.HashSet;

public class StringDuplicate 
{
	public static void main(String[] args) {
		
	
String s="abcdabcd";
 char a[]=s.toCharArray();
 HashSet hs=new HashSet();
 for(char str:a)
 {
	 if(hs.add(str)==false)
	 {
		 System.out.println(str);
	 }
 }
}}
