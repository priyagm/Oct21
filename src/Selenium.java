
public class Selenium 
{
public static void main(String[] args) 

{
	
	String s="Seleniumi";
	char x='e'; int count =0;
	for( int i=0; i<=s.length()-1; i++)

	{
		
		char y = s.charAt(i);
		if(x==y)
		{
			
			count++;
			
		}	
	}
	System.out.println(count);
	
}
}
