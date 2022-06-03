package Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class Tressset 
{
public static void main(String[] args) 
{
	TreeSet tr = new TreeSet();
	tr.add("priyanka");
	tr.add("priyanka");
	//tr.add(null);
	System.out.println(tr);
	for(Object a:tr)
	{
		System.out.println(a);
	}
	Iterator lis = tr.iterator();
	while(lis.hasNext())
	{
		System.out.println(lis.next());   
	}
}
}
