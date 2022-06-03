package Practice1;

public class strRev 
{
public static void main(String[] args)
{
	String s="priyanka";
	String a[]= s.split("");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}
}
}
