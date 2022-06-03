package com.aspire.javacollection.setlist;

import java.util.HashSet;
import java.util.Iterator;

public class hashlist 
{
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
	hs.add("priyanka");
	hs.add(80959410);
	hs.add(98.5f);
	hs.add(null);
	hs.add(98.5f);
	hs.add(null);
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.remove(null));
	System.out.println(hs);
	System.out.println(hs.contains("priyanka"));
	for(Object a:hs )
	{
		System.out.print(a+" ");
	}
	System.out.println();
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+",");
	}
}
}
