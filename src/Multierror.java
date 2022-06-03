
public class Multierror
{
public static void main(String[] args) 
{
	int a=10;
	int b=0;
	int c;
	int d;
	int x[]= {1,2,3,4,5,6};
	 
	try 
	{
		try
		{
			d=x[7]/b;
			 System.out.println(d);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index should be less than lengthof array");
		}
		c=x[4]/b;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("do not divide by zero");
	}
			
}
}
