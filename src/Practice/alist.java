package Practice;

import java.util.ArrayList;
import java.util.ListIterator;

import com.aspire.java.collection.Array_list;

public class alist 
{
public static void main(String[] args)
{
	ArrayList al=new ArrayList();
	al.add("priyanka");
	al.add("steffi");
	al.add("priyanka");
	al.add(null);
	al.add(null);
	System.out.println(al);
	ListIterator ltr = al.listIterator();
	while(ltr.hasNext())
	{
		System.out.print(ltr.next());
	}
	for(Object a:al)
	{
		System.out.print(a);
	}
	
}
}
