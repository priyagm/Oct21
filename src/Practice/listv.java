package Practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class listv 
{
public static void main(String[] args) 
{
Vector v=new Vector();
v.add("priyanka");
v.add("priya");
v.add(25);
System.out.println(v);
Enumeration ele = v.elements();
while(ele.hasMoreElements())
{
	System.out.println(ele.nextElement());

}
Iterator itr = v.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
