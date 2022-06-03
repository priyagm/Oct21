package com.aspire.javacollection.setlist;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkset_1 {
	public static void main(String[] args) 
	{
		LinkedHashSet hls= new LinkedHashSet();
		hls.add("priyanka");
		hls.add("steffi");
		hls.add(1989);
		hls.add(1994);
		hls.add(null);
		hls.add(1989);
		System.out.println(hls);
		System.out.println(hls.size());
		System.out.println(hls.remove(null));
		System.out.println(hls);
		for(Object a:hls)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		Iterator itr=hls.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
