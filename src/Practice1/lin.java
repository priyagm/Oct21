package Practice1;

import java.util.LinkedList;
import java.util.ListIterator;

public class lin
{
	public static void main(String[] args)
	{
	LinkedList ll=new LinkedList();
	ll.add("priyanka");
	ll.add("priyanka");
	ll.add(null);
	ll.add(null);
	ll.add(98.56f);
	ll.add(24);
	System.out.println(ll);
	System.out.println(ll.remove(3));
	System.out.println(ll.remove("priyanka"));
	System.out.println(ll.size());
	System.out.println(ll.set(3, 38));
	System.out.println(ll);
	for(int i=ll.size()-1;i>=0;i--)
	{
		System.out.print(ll.get(i)+",");
	}
	System.out.println();
	for(int i=0;i <ll.size();i++)
	{
		System.out.print(ll.get(i)+",");
	}
	System.out.println();
	for(Object a:ll)
	{
		System.out.print((a)+",");
	}
	System.out.println();
	ListIterator ltr=ll.listIterator();
	while(ltr.hasNext())
	{
	System.out.print(ltr.next()+";");
	}
	System.out.println();
	while(ltr.hasPrevious())
	{
		System.out.print(ltr.previous()+";");
	}
	
	
	}

}
