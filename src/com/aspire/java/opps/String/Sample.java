package com.aspire.java.opps.String;

public class Sample {
	public static void main(String[] args) {
		String s="atipune";
		String s1="Aspire";
		String s2="Aspire";
		String s3= new String("Aspire");
		String s4=new String ("Aspire");
		String s5="aspire";
		System.out.println(s1==s2);// true//== for object both are in different object
		System.out.println(s3==s4);// false//s1 &s2 in constpool area and s3&s4 in nspa
	System.out.println(s1.equals(s4));//true//.equals value in object
	System.out.println(s.equals(s2));//false//
	System.out.println(s.equals(s1));//false//
	System.out.println(s3.equals(s2));//true//
	System.out.println(s1.equals(s2));//true//
	System.out.println(s5.equals(s1));//false
	System.out.println(s==s1);//false//
	System.out.println(s5==s2);//false bcz Aspire and aspire
	System.out.println(s1.toUpperCase().equals(s2.toUpperCase()));
	System.out.println(s3.equals(s4));
	System.out.println(s1.toUpperCase().equals(s5.toUpperCase()));
	System.out.println(s1==s5);
	System.out.println(s2.equals(s4));
	
	
	
	}

}
