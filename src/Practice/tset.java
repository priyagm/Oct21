package Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class tset
{
public static void main(String[] args) {
TreeSet ts	=new TreeSet();
	ts.add(1);
	ts.add(2);
	ts.add(3);
	ts.add(4);
	ts.add(3);
	System.out.println(ts);
	
	for(Object a:ts)
	{
		System.out.print(a);
	}
	Iterator it = ts.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
