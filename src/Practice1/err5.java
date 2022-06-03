package Practice1;

public class err5
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c[]= {1,2,3,4};
		int d;
		int f;
		
		
		try
	{
			try 
			{
				f= c[5]/a;
			}
			catch(ArrayIndexOutOfBoundsException y) 
			{
				System.out.println("indecx should be less then length of array");
			}
			d=c[2]/b;	
			
			
	
	}
		catch(ArithmeticException x) 
		{
			System.out.println("cannot divide number by zero");
		}
	}

}
