package com.aspire.java.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class link_list
{
public static void main(String[] args)
{
	LinkedList ll=new LinkedList();
	ll.add("Hi world");
	ll.add(null);
	ll.add(809594);
	ll.add("25%");
     ll.add("Hi world");
     System.out.println(ll);
     System.out.println(ll.size());
     System.out.println(ll.get(2));
     System.out.println(ll.get(3));
     System.out.println(ll.remove(null));
     System.out.println(ll);
     System.out.println(ll.set(2,"80%"));
     System.out.println(ll);
     System.out.println(ll.remove(2));
     System.out.println(ll);
     System.out.println(ll.set(2, "priyanka"));
     System.out.println(ll);
     for(int i=0;i<ll.size();i++)
     {
    	 System.out.print(ll.get(i)+" ");
     }
     System.out.println();
   ListIterator li=  ll.listIterator();
  while(li.hasNext())
 {
   System.out.print(li.next()+" ");
  }
   System.out.println();
   while(li.hasPrevious())
   {
   	System.out.print(li.previous()+" ");
   }
   for(Object a: ll)
   {
	   System.out.print(a);
   }
Iterator itr = ll.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	}
		   
}
}
