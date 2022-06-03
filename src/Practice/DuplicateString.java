package Practice;

import java.util.HashSet;

public class DuplicateString
{
public static void main(String[] args)
{
	String s="abcdabcd";
	char []a=s.toCharArray();
	HashSet<Character> hs = new HashSet<Character>();
	for(char str:a)
	{
		if(hs.add(str)==false)
		{
			System.out.println(str);
		}
	}
}
}
