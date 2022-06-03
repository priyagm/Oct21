package com.aspire.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_list
{
public static void main(String[] args)
{
	
	ArrayList al=new ArrayList();
	al.add("priyanka");
	al.add(809594105);
	al.add('A');
	al.add(98.6f);
	al.add(null);
	al.add(98.6f);
	System.out.println(al.size());
	System.out.println(al.get(4));
	System.out.println(al);
	System.out.println(al.indexOf('A'));
	System.out.println(al.remove(2));
	System.out.println(al);
	System.out.println(al.remove("priyanka"));
	System.out.println(al);
	System.out.println(al.equals(al));// doubt
	System.out.println(al.indexOf (98.6f));
	System.out.println(al.set(3,35 ));
	System.out.println(al);
	
	
	for(int i=0; i<al.size();i++)
	{
		System.out.print(al.get(i)+" ");
	}
	System.out.println();
	for(int i=al.size()-1;i>=0;i--)
		
	{
		System.out.print(al.get(i)+" ");
	}
	System.out.println();
	Iterator itr=al.iterator();//datatype varible=ob.claaname
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	System.out.println();
ListIterator li=al.listIterator();//listerator
while(li.hasNext())//listerator forward
{
System.out.print(li.next()+" ");	
}
System.out.println();
while(li.hasPrevious())//listerator backward
{
System.out.print(li.previous()+" ");	
}
	
}


	
}
