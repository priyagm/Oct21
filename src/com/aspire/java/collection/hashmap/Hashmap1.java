package com.aspire.java.collection.hashmap;

//import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap1 {
	public static void main(String[] args) 
	{
HashMap<Integer,String> hm=new HashMap<Integer,String>();
//ArrayList<Integer,String> al =new ArrayList<Integer,String>();
hm.put(6, "priyanka");
hm.put(2, "Steffi");
hm.put(3, "Martin");
hm.put(1, "Steven");
hm.put(4, "john");
hm.put(5, "priyanka");
hm.put(1," priyanka");//valuevill repaed butnot overwrite
hm.put(10, null);//key vill rewrite,not repated
hm.put(2,"Angel");
System.out.println(hm);
System.out.println(hm.size());//dublicate it wont count
System.out.println(hm.containsKey(1));
System.out.println(hm.containsValue("john"));
System.out.println(hm.containsValue("priyanka"));
System.out.println(hm.containsKey(1));
System.out.println(hm.get(10));
System.out.println(hm.remove(4));
System.out.println(hm.replace(1, "pinky"));
//System.out.println(hm.remove(2, "Angel"));
System.out.println(hm);
for(int i=1;i<=hm.size();i++)
{
	System.out.print(hm.get(i)+",");
}
//for(Object a:hm)// cant use fo esch
//{
//	System.out.println(a);
//}


	}

}
