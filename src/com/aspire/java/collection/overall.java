package com.aspire.java.collection;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class overall {
	public static void main(String[] args)
	{
		int a[]= {7,9,8,4,6,4,2};
		String s[]= {"priyanka","steffi","martin","binny","mintoo","priyanka"};
		System.out.println("******Arraylist*******");
		ArrayList al= new ArrayList();
		for(int i=0;i< a.length;i++)
		{
			al.add (a[i]+" ");
			
		}
		
		for(int i=0;i< s.length;i++)
		{
			al.add(s[i]+" ");
			
		}
		
		for(Object b:s)
		{
			al.add(b);
		}
		System.out.print(al);
		System.out.println("*******linked list********");
		LinkedList ll=	new LinkedList();
		for(int i=0;i< a.length;i++)
		{
			ll.add(a[i]);
			
		}
	
		for(Object b:s)
		{
			ll.add(b);
		}
		
		System.out.println("*****vector******");
		Vector v =new Vector();
		for(int i=0;i< a.length;i++)
		{
			v.add(a[i]);
			
		}
	
		for(Object b:s)
		{
			v.add(b);
		}
		System.out.println(v);
		System.out.println("*******hashset*******");
		HashSet hs=new HashSet();
		for(int i=0;i< a.length;i++)
		{
			hs.add(a[i]);
			
		}
	
		for(Object b:s)
		{
			hs.add(b);
		}
		System.out.println(hs);
		}
	


}


