package Practice;

import java.util.HashSet;

public class hset {
	public static void main(String[] args) 
	{
		int a[]={1,2,2,3,4};
		HashSet hs=new HashSet();
		for(int numb:a)
		{
		if(hs.add(numb)==false)
		{
		System.out.println(numb);
		}

		}
//		HashSet hs=new HashSet();
//		hs.add("priyanka");
//		hs.add("priyanka");
//		hs.add(80959410);
//		hs.add(null);
//		hs.add(null);
//		System.out.println(hs);
//		for(Object a: hs)
//		{
//			System.out.print(a+" ");
//		}
//		
	}

}
