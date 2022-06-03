package com.aspire.java.opps.String;

public class replaceCharter {
	public static void main(String[] args)
	{
		String s="@#$%priyanka##$$$";
		System.out.println(s.replaceAll("[^priyanka]", ""));;
		System.out.println(s.replaceAll("priyanka", ""));
	}

}
