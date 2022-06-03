package Practice;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class Array1i
{
public static void main(String[] args)
{
ArrayList	al=new ArrayList();
al.add("priyanka");
al.add("priyanka ");
al.add(80959410);
al.add(null);
al.add(null);

System.out.println(al);
System.out.println(al.size());
for(int i=0;i<al.size();i++)
{
	System.out.print(al.get(i)+",");
}
System.out.println();
for(Object a:al)
{
	System.out.print(a+",");
}
System.out.println();
ListIterator ltr =al.listIterator();
while(ltr.hasNext())
{
	System.out.print(ltr.next()+",");
}
	

System.out.println();

while(ltr.hasPrevious())
{
	System.out.print(ltr.previous()+",");
}
System.out.println();
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.print(it.next()+",");
	}
	System.out.println();
	
	for(int j=al.size()-1;j>=0;j--)
	{
		
		System.out.print(al.get(j)+",");
	}
}
}
