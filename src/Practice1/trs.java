package Practice1;

import java.util.Iterator;
import java.util.TreeSet;

public class trs
{
	public static void main(String[] args) 
	{
	TreeSet ts	=new TreeSet();
	ts.add("priyanka");
	ts.add("steffi");
	ts.add("martin");
	ts.add("harry");
	ts.add("angeel");
	ts.add("binyy");
	ts.add("priyanka");
	ts.remove("priyanka");
	System.out.println(ts.size());
	System.out.println(ts);
	for(Object a:ts)
	{
		System.out.print(a+",");
	}
	Iterator itr =ts.iterator();
	System.out.println();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+",");
	}
	}

}
