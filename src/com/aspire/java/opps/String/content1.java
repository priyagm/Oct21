package com.aspire.java.opps.String;

public class content1
{
public static void main(String[] args)
{
	String s1="Aspire Institute Training";
	String s2="Pune";
      String s3=" ";
      String s6="Mahrarastra";
      String s4=s1.concat(s2);
      String s5=s1.concat(s3).concat(s2);
      System.out.println(s1.concat(s2));
      
      System.out.println(s4);
      System.out.println(s5);
      System.out.println(s1.concat(s3).concat(s2));
      System.out.println(s1.concat(s6));
      System.out.println(s1.concat(s3).concat(s6));
      System.out.println(s1.concat(s3).concat(s2.concat(s3)).concat(s6));
	System.out.println(s1.concat(s3).concat(s2).concat(s3).concat(s6));
}
}
