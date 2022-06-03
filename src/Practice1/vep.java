package Practice1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vep 
{
public static void main(String[] args) 
{
Vector	v=new Vector();
v.add("priyanka");
v.add("priyanka");
v.add(null);
v.add(null);
v.add("3697852");
v.add(60);
v.add("priyanka");
System.out.println(v.get(4));
v.remove(6);
System.out.println(v);
System.out.println(v.isEmpty());
System.out.println(v.remove("60"));//u cant use dis
System.out.println(v.set(5, 55));// you need to replace
System.out.println(v);
System.out.println(v.size());
Enumeration en=v.elements();
while(en.hasMoreElements())
{
	System.out.print(en.nextElement()+",");
}
	
	Iterator itr=v.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+",");
	}
	System.out.println();
	
for(int i=v.size()-1;i>=0;i--)
{System.out.print(v.get(i)+",");
	
}

}
}
