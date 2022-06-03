package Practice;

import java.util.HashSet;

public class DupilcateNumber {
	public static void main(String[] args)
	{
		int a[]= {1,2,2,3,3,4,5	};
		
HashSet<Integer> hs = new HashSet<Integer>();
for(int no:a)
{
	if(hs.add(no)==false)
	{
		System.out.println(no);
	}
}

}}
