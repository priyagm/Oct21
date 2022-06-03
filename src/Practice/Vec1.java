package Practice;

import java.util.Enumeration;
import java.util.Vector;

public class Vec1 {
	public static void main(String[] args) {
	Vector	v=new Vector();
	
	v.add("priyanka");
	v.add("priyanka ");
	v.add(80959410);
	v.add(null);
	v.add(null);
	System.out.println(v);
Enumeration en	=v.elements();
while(en.hasMoreElements())
{
	System.out.print(en.nextElement()+" ,");
}
System.out.println();
System.out.println(v.firstElement());
System.out.println(v.get(2));
System.out.println(v.indexOf(null));
System.out.println(v.lastElement());
System.out.println(v.remove(0));
System.out.println(v);
System.out.println(v.add("steffi"));
System.out.println(v);

}}
