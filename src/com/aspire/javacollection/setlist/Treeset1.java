package com.aspire.javacollection.setlist;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {
	public static void main(String[] args) 
	{
	TreeSet	ts=new TreeSet();
	ts.add("Priyanka");
	ts.add("Steffi");
	ts.add("Honey");
	ts.add("Angel");
	ts.add("pari");
	ts.add("pari");
	//ts.add(10);it vill not take
	//ts.add(null); it vill not take
	
	System.out.println(ts);
	System.out.println(ts.first());
	//System.out.println(ts.hashCode());
	System.out.println(ts.last());
	System.out.println(ts.contains("chinky"));
	System.out.println(ts.isEmpty());
	System.out.println(ts.remove("Priyanka"));
	System.out.println(ts);
	//System.out.println();
	
	for(Object a:ts)
	 {
		 System.out.print(a+" ");
	 }
	System.out.println();
	Iterator b=ts.iterator();
	while(b.hasNext()) {
	System.out.print(b.next()+" ");}
	}}
	


