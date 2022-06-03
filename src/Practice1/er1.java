package Practice1;

public class er1
{
public static void main(String[] args)
{
	int a[]= {1,2,3,4,5,5};
	
	try
	{
		System.out.println(a[6]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("index should be less than lanth of array");
	}
}
}
