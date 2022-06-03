package com.aspire.java.collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vecto
{
public static void main(String[] args)
{
Vector v=new Vector();
v.add("priyanka");
v.add(809594105);
v.add('A');
v.add(98.6f);
v.add(null);
v.add(98.6f);
System.out.println(v.size());
System.out.println(v.get(4));
System.out.println(v);
System.out.println(v.indexOf('A'));
System.out.println(v.remove(2));
System.out.println(v);
System.out.println(v.remove("priyanka"));
System.out.println(v);
System.out.println(v.equals(v));// doubt
System.out.println(v.indexOf (98.6f));
System.out.println(v.set(3,35 ));
System.out.println(v);
for(int i=0;i<v.size();i++)
{
	System.out.print(v.get(i)+" ");
	}
System.out.println();
for(int i= v.size()-1;i>=0;i--)
{
	System.out.print(v.get(i)+" ");
}
System.out.println();
Enumeration en=v.elements();
while(en.hasMoreElements())
{
	System.out.print(en.nextElement()+" ");
}
System.out.println();
ListIterator li=v.listIterator();
while(li.hasNext())
{System.out.print(li.next()+" ");}
System.out.println();
while(li.hasPrevious())
{
	System.out.print(li.previous()+" ");
}
}
}
