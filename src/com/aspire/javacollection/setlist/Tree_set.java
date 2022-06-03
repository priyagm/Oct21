


package com.aspire.javacollection.setlist;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set {
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
	 ts.add(10);
	 ts.add(8);
	 ts.add(12);
	 ts.add(1);
	 ts.add(1);
	 System.out.println(ts);
	 System.out.println(ts.size());
	 System.out.println(ts.isEmpty());
	 System.out.println(ts.contains(1));
	 System.out.println(ts.contains(20));
	 for(Object a:ts)
	 {
		 System.out.print(a+" ");
	 }System.out.println();
	Iterator itr=ts.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+"; ");
	}
	
	}

	
	}


