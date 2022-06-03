package Practice1;

public class error 
{
public static void main(String[] args) 
{
	String s=null;
	
	try
	{
		System.out.println(s.length());
	}
	catch(NullPointerException a)
	{
		System.out.println("null length cant be found");
	}
}
}
