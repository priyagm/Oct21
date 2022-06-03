package Practice1;

public class err3 
{
public static void main(String[] args)
{
	String s="Priyanka";
	
	try
	{
		System.out.println(s.charAt(8));
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("index should be less than the String length");
	}
	
}
}
