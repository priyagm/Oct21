package Practice;

import java.util.HashMap;

public class Hashm 
{
	public static void main(String[] args) 
	{
	HashMap<Integer, String> hm	= new HashMap<Integer,String>();
	hm.put(1, "priyanka");
	hm.put(4, "steffi");
	hm.put(3, "martin");
	hm.put(3, "bunty");
	System.out.println(hm);
	
	for(int i=1;i<=hm.size();i++)
	
	{
		System.out.print(hm.get(i)+",");
	}
	
}}
