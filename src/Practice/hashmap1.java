package Practice;

import java.util.HashMap;

public class hashmap1 
{
public static void main(String[] args) 
{
	HashMap<Integer,String> hs = new HashMap<Integer,String>();
	hs.put(5, "angle");
	hs.put(1, "priyanka");
	hs.put(2, "steffi");
	System.out.println(hs);
//	for(Object a:hs)
//	{
//		System.out.println(a);
//	}
	for(int i=1; i<=hs.size();i++)
		{
		System.out.println();
		}
	

}
}
