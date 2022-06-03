package Practice1;

public class err2
{
public static void main(String[] args)
{
	int a=100;
	int b=0;
	int c;
	
	try 
	{
		c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println(" zero cannot be divided to any number");
	}
}
}
