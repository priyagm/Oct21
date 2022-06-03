package com.aspire.java.opps.String;

public class repalce123abcd {
	public static void main(String[] args) 
	{
		String s="priyanka1233455";
		System.out.println(s.replaceAll("1233455", ""));
		System.out.println(s.replaceAll("[^1233455]",""));
		//System.out.println(s.replaceAll("priyanka",""));
	}

}
