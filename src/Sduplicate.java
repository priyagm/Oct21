import java.util.HashSet;

public class Sduplicate 
{
public static void main(String[] args) 

{
	String s="Nayan"; String rev="";
//	char a[]= s.toCharArray();
//	HashSet hs =new HashSet();
//	for( char str:a)
//	{
//		if(hs.add(str)==false)
//
//		{
//			
//			
//			System.out.println(str);
//		}
//	}
	
	
	for(int i=s.length()-1; i>=0;i--)
	{
		
	rev=	rev+s.charAt(i);
		
	}
	if(s.equalsIgnoreCase(rev))
{
	System.out.println("its a palindrome");	

}
	else
		{
		
		System.out.println("its not a planidrome ");
		}
	
}
}
