
public class Stringerror
{
public static void main(String[] args)
{
	String s="priyanka";
	
	
	try
	{
		System.out.println(s.charAt(8));
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("index should be less String length");
	}
}
}
