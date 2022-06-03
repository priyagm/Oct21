package Practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class listA 
{
	
	public static void main(String[] args) {
		
	
ArrayList al =new ArrayList();
al.add("priyanka");
al.add("priyanka");
al.add(34);
al.add(null);
al.add(null);
System.out.println(al.size());
 ListIterator lil = al.listIterator();
 while(lil.hasNext())
 {
	 System.out.print(lil.next()+" ;");
 }
 System.out.println();
for(int i=0; i<=al.size()-1;i++)
{
	System.out.print(al.get(i)+", ");
}
System.out.println();
for(Object x:al)
{
	System.out.print(x+";");
}
}

	
	
	
	}
