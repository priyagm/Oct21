package com.aspire.java.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array1
{
public static void main(String[] args) 
{
	ArrayList al=new ArrayList();
	al.add("priyanka");
	al.add(99.6f);
	al.add(123456789);
	al.add("bidar");
	al.add(null);
	al.add(99.6f);
	al.add(60);
	al.add("priyanka");
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.get(0));
	System.out.println(al.indexOf(null));
	System.out.println(al.isEmpty());
	System.out.println(al);
	System.out.println(al.remove(6));
	System.out.println(al.remove(2));
	System.out.println(al);
	System.out.println(al.remove("priyanka"));
	System.out.println(al);
	
	
	for(int i=0;i<al.size();i++)
	{System.out.print(al.get(i)+",");
		
	}
	ListIterator ltr=al.listIterator();
	while(ltr.hasNext())
	{
		
		System.out.println(ltr.next());
	}
	
}
}