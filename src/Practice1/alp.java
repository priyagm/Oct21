package Practice1;

import java.util.ArrayList;
import java.util.ListIterator;

public class alp
{
public static void main(String[] args)
{
ArrayList	al=new ArrayList();
al.add("priyanka");
al.add(80959419);
al.add(98.25f);
al.add(null);
al.add(98.25f);
al.add(null);
System.out.println(al);
for (int i=0;i<al.size();i++)
{
	System.out.print(al.get(i)+",");
}
System.out.println();
for(int j=al.size()-1;j>=0;j--)
{
	System.out.print(al.get(j)+",");
}
System.out.println();
for(Object a:al)
{
	System.out.print(a+",");
}
System.out.println();
ListIterator ltr=al.listIterator();
while(ltr.hasNext())
{
	System.out.print(ltr.next()+",");
}
System.out.println();
while(ltr.hasPrevious())
{
	System.out.print(ltr.previous()+",");
}
}
}
