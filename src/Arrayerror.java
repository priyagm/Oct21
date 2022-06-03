
public class Arrayerror {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		
		
		try
		{
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
		
		System.out.println("index should be less than length of array");
		
		}
}
