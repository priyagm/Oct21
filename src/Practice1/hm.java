package Practice1;

import java.util.HashMap;

public class hm 
{
public static void main(String[] args) 
{
HashMap<Integer,String>	hm=new HashMap<Integer,String>();
hm.put(1, "priyanka");
hm.put(1, "priya");
hm.put(2,"steffi");
hm.put(4, "steven");
hm.put(3, "martin");
hm.put(5, "priyanka");
hm.put(6, null);
System.out.println(hm);
for(int i=1;i<=hm.size();i++)
{
	System.out.print(hm.get(i)+",");
}
System.out.println();
for(int i=hm.size();i>=1;i--)
{
	System.out.print(hm.get(i)+",");
}
//for(Object a:hm)
//{
//	System.out.println(a);
//}
}
}