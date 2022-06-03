
public class StringOccurance
{
public static void main(String[] args) 
{
	String s="priyanka";
	char a='e'; int count =0;
	
	for(int i=0;i<=s.length()-1;i++)
	{
		char b = s.charAt(i);
		if(a==b)
		{
			count++;
		}
	}
	System.out.println(count);
}
}
