package Practice;

public class Stringsplit 
{
public static void main(String[] args) 
{
	String s="priyanka";
	
	String a[]=s.split("");
	for(int i=a.length-1;i>=0;i--)
	{
	System.out.print(a[i]);
	}
	System.out.println();
	String s1="my name is priyanka";
	String b[]=s1.split("");
	for(int j=b.length-1;j>=0;j--)
	{
		System.out.print(b[j]);
	}
		
}
}
